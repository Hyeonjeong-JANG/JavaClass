package ch07;

import java.io.IOException;
import java.io.InputStream;

// buffer: 임시 저장 공간
public class StreamEx01 {

	public static void main(String[] args) {
		InputStream in =System.in; // System.in(키보드)
		try {
			int data = in.read();// 2진수를 10진수로 변환해서 읽어줌. A(인코딩 전 데이터)를 넣으면 01000001로 인코딩되고 65(디코딩 된 데이터)이 반환됨.
			// 1. 키보드는 A를 인코딩해서 01000001로 컴퓨터에게 전송
			// 2. ByteStream으로 흘러들어간다.(Input)
			// 3. read() 메서드로 01000001를 65로 디코딩한다.
			// 4. 65를 A(문자)로 부호화시킨다.
			// 단점: ABC라고 적어도 A만 반환됨.(한 번에 1 바이트 씩만 전송됨)
			System.out.println(data);// 키보드로 입력받을때까지 안 멈춤
			System.out.println((char)data); // 부호화
		} catch (Exception e) {//트라이케치에서 잡힌 것은 컴파일 에러기 때문에 컴파일 에러의 최상위인 Exception으로 해주는 것이 좋아.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
 