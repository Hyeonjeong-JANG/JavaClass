package ch07.socket1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {
	// Crtl + Space , Ctrl + Shift + O
	
	// 클라이언트 연결을 받는 소켓
	ServerSocket serverSocket; // 클라이언트 소켓과 연결만 함. 10000번으로 해보자.
	
	// 실제 통신을 하는 소켓
	Socket socket; // 1024~65535 중 사용하지 않는 포트 번호를 랜덤으로 선정해서 사용. 
// 서버 소켓이 연결되면 소켓으로 클라이언트와 Byte Stream 연결을 해서 통신함.
	// 소켓이 왜 두 개인가?(서버소켓, 소켓)
	// 소켓은 포트 통신인데  
	BufferedReader br;
	
	public ServerFile() { // Ctrl + Space 하면 나옴
		System.out.println("1. 서버 소켓 시작-------------------");
		
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("2. 서버 소켓 생성 완료: 클라이언트 접속 대기중...------------");
			socket = serverSocket.accept(); // 클라이언트 접속 대기 중...
			System.out.println("3. 클라이언트 연결 완료 - buffer 연결 완료(read)");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));// 소켓.겟인풋스트림이 뭐냐면 소켓과 클라이언트 소켓을 연결하는 바이트 스트림. 그 선 양 끝에 버퍼를 달아주는 것이다. 
			
			String msg = br.readLine();
			System.out.println("클라이언트로부터 받은 메시지:" + msg);
		} catch (Exception e) {
			System.out.println("서버 소켓 에러 발생함: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new ServerFile();
	}

}
