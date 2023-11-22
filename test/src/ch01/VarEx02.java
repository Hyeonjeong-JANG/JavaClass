package ch01;

// int n3 = 30; // 신텍스 에러
public class VarEx02 {

	static int n2 = 20;
	public static void main(String[] args) {
		int n1 = 10; // 8번 라인이 실행될 때 10이라는 숫자가 n1이라는 메모리 공간에 할당된다.
		System.out.println(n1); // main이라는 stack 공간의 n1
		System.out.println(n2); // VarEx02라는 static 공간의 n2
		
	}

}

// 1. 자바의 모든 코드는 클래스 내부에 존재해야 한다.
// 2. 자바는 실행 전에 static 이라는 키워드를 가지고 있는 모든 친구들을 static 메모리 공간에 로드한다.
// 3. 자바를 실행하면 main 이라는 친구의 내부{}를 실행한다.
// 4. 내부{}가 끝나면 종료된다.(자바프로그램)
