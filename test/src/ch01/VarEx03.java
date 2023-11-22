package ch01;

// static은 클래스 자료형이다. // 클래스 자료형은 커스텀 자료형이다.
// 여러가지 데이터를 가지고 있는 클래스를 Beans라고 부름.

class MyVar{// Beans
	static int n1 = 10;
	static char c1 = 'A';
}

class MyVar2{
	static int n1 = 20;
	static char c1 = 'B';
}
// 이렇게 MyVar의 값을 static으로 저장하면? 단점!
// 1. 프로그램 시작 전부터 프로그램 종료시까지 존재한다.
// 2. 많은 데이터를 저장하고 싶으면 클래스 자료형을 여러개 만들어야 한다.

public class VarEx03 {

	static int num = 500;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(n1);
		System.out.println(MyVar.n1);
		System.out.println(MyVar.c1);
		System.out.println(MyVar2.n1);
		System.out.println(MyVar2.c1);
		System.out.println(VarEx03.num);
		System.out.println(num); // 이렇게 써도 오키
	}

}
