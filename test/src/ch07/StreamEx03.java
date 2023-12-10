package ch07;

// BufferedReader
// 1) 양 끝 단 버퍼의 크기를 맞춘다.
// 2) 버퍼가 가득 차면 자동 전송된다.(flush) -> 상대 버퍼가 비워져 있어야.
// 3) 전송된 후 버퍼가 비워지고 그 자리에 나머지 데이터가 갱신된다.
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {

	public static void main(String[] args) {
		InputStream in =System.in; // System.in(키보드)
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String data = br.readLine();
			System.out.println(data);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
