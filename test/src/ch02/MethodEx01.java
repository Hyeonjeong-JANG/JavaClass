package ch02;

// 메서드는 클래스가 가진 행위를 말한다.
class 손님{
	
	// 손님의 행위
	void 커피마시기() {// 메서드는 클래스 내부에 위치해야 한다.
		System.out.println("손님이 커피를 마셔요.");
	}
	
}

public class MethodEx01 {

	// 메서드 = MethodEx01 클래스의 행위
	static void start() {
		System.out.println("만나서 반갑습니다."); // String 타입
		System.out.println("start 메서드 종료");
	}
	
	public static void main(String[] args) {
		MethodEx01.start();
		손님 s = new 손님();
		s.커피마시기();
	}
}
