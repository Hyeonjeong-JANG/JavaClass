package ch01;
// 패키지 = 자바 파일이 모여 있는 폴더

public class VarEx01 {

	public static void main(String[] args) {
		boolean b1 = true; // 박스에 1이 저장됨
		boolean b2 = false; // 박스 0
		int n1 = 1000; // 나 메모리가 4Byte 공간이 필요해!
		double d1 = 1000.1;// 나 메모리가 8Byte 공간이 필요해!
		char c1 = '가';// 나 메모리가 2Byte 공간이 필요해!
		
		System.out.println(c1);
		System.out.println(n1);
		// c1, n1 이런 애들은 변수다.
		
		n1 = 50; // 값을 변경
		System.out.println(n1);
	}

}
