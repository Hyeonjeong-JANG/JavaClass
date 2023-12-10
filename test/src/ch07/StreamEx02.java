package ch07;

//Buffered Reader
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {

	public static void main(String[] args) {
		InputStream in =System.in; // System.in(키보드)
		InputStreamReader ir = new InputStreamReader(in);// 65를 A로 부호화, 문자열을 바꿔주진 못 해 
		try {
			char[] data = new char[3]; // 내가 미리 크기를 알 수 없으니까 숫자를 예측하기 힘들어.
			// 그래서 막 1000개 만들어 놓으면 500개짜리 문자가 들어오면 500개의 자리는 그냥 낭비됨.
			// 그래서 Buffered Reader를 이용함.
			// 장점 1) 숫자 -> 부호화, 2) 문자를 가변적으로 받아서 배열의 공간 낭비가 없다. SteamEx03에서 Buffered Reader함.
			ir.read(data);
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
