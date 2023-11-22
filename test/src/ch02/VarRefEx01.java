package ch02;

// new가 되어서 heap에 할당이 될 때 사이즈를 알 수 있다.(프로그램이 실행되었을 때 = Runtime)
class MyData{
	int id = 1; // 4Byte
	int price = 1000; // 4Byte
}

//레퍼런스(참조) 변수, 일반 변수
public class VarRefEx01 {

	public static void main(String[] args) {
		// 타입 변수; int num; 변수를 선언한다.
		// 타입 변수 = 값; int num = 10; 변수를 초기화(메모리에 할당)한다.
		int num = 10; //일반변수(크기가 정해져 있는 것 = 컴파일 시점)
		MyData d = new MyData(); // 레퍼런스변수(크기가 정해져 있지 않은 것 = 컴파일 시점)
		System.out.println(num);
		System.out.println(d.id);
		System.out.println(d.price);
	}

}

// 일반 변수는 값을 가지고 있고, 레퍼런스변수는 주소(포인터)를 가지고 있다. 그 주소로 값을 찾음.
// 일반 변수 = int, double, boolean, char...(8가지)
// 레퍼런스 변수 = class 자료형(Beans)
