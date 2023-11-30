package ch06;

//와일드카드

abstract class 공{
	abstract String getName();
}

class 농구공 extends 공{
	private String name = "농구공";

	//자식이 부모의 메서드와 동일한 것을 들고 있으면 부모의 메서드가 오버라이드(무효화)됨.
	//source -> 게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class 축구공 extends 공{
	private String name = "축구공";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class 가방<T>{
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class GenericEx03 {
	// <? extends Object>이 생략되면 아래와 같이 와일드카드만 적는다.
	static 가방<? extends 공> 꺼내기(int time) {//9시 = 축구, 12시 = 농구
		if(time == 9) {
			System.out.println("가방에 축구공이 담겼어요.");
			축구공 g2= new 축구공();
			가방<축구공> b2 = new 가방<>();
			b2.setData(g2);
			return b2;
		}else {
			System.out.println("가방에 농구공이 담겼어요.");
			농구공 g1= new 농구공();			
			가방<농구공> b1 = new 가방<>();
			b1.setData(g1);	
			return b1;
		}
	}
	
	public static void main(String[] args) {
		가방<? extends 공> r1 = 꺼내기(9);
		가방<? extends 공> r2 = 꺼내기(12);
		//공은 getName이 없다. 그래서 위로 가서 무효화 함수를 하나 만들어.
		System.out.println(r1.getData().getName());
		System.out.println(r2.getData().getName());
		
	}

	//제네릭 고급 = 다형성, Object, 추상클래스, 오버라이드(무효화), 동적바인딩 등을 알고 있어야 하므로 어려울 것이다. 그러나 이해하면 자바 실력이 짱짱이니까 함 노력해보자!!
	// 이해가 안 가면 웹에서 다시 공부해도 된다., 웹이나 프로그램을 만들 때 엄청난 위력을 발휘할 것이다.
}
