package ch04.a;

public class Cal {//public이 없으면 외부에서 Cal을 임폴트 할 수 없다.
	
	int num = 10;

	void add() {
		System.out.println("더하기 메서드");
	}
	
	public void minus() {
		System.out.println("빼기 메서드");
	}
	
	private void multi() {
		System.out.println("곱하기 메서드");
	}
	
	public void divide() {
		System.out.println("나누기 메서드");
	}
	
}

// void 앞에 아무것도 없으면 동일엔 패키지에서만 가져다 쓸 수 있는 '디폴트 접근 제어자'라고 한다. 
// void 앞에 public이 붙으면 다른 패키지에서도 접근이 가능하다. 'public 접근 제어자'라고 한다.
// void 앞에 이 붙으면 동일한 클래스에서만 접근이 가능하다. 'private 접근 제어자'라고 한다.