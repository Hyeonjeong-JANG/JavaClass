package ch05;
//오버로딩

//class 홍길동{//다른 파일에서 이미 홍길동 만들어서 또 만들 수 없음.
//	}

class 임꺽정{
	void 달리기() {
		System.out.println("달리기1");
	}
	
	//오버로딩
	void 달리기(int speed) {
		System.out.println("달리기2");
	}
	//오버로딩
	void 달리기(double speed) {
		System.out.println("달리기3");
	}
	//오버로딩
	void 달리기(int speed, double power) {
		System.out.println("달리기4");
	}
	
	void 달리기2() {
		System.out.println("달리기5");
	}//이렇게 써도 되는데 왜 오버로딩을 하는가?
	
}
public class OOPEx04 {

	public static void main(String[] args) {
		임꺽정 e = new 임꺽정();
		e.달리기();
		e.달리기(1);
		e.달리기(1.0);
		e.달리기(1, 1.0);
		e.달리기2();
	}

}


