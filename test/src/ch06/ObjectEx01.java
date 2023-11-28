package ch06;
//오브젝트 클래스는 모든 클래스의 부모인데 생략되어 있다.
class Dog extends Object{
	String name = "토토";
}

class Cat{
	String name = "야옹이";
}

public class ObjectEx01 {

	public static void main(String[] args) {
		Object o1 = new Dog();// 다형성
		Object o2 = new Cat();//굳이 추상메소드를 만들지 않아도 이렇게 타입을 오브젝트로해서 묶을 수 있어.
		
//		Dog d1 = o1;//이거안됨. 오브젝트타입이 도그타입이 될 수 없어. 도그는 오브젝트와 도그가 되지만 오브젝트는 그냥 오브젝트야.
		Dog d1 = (Dog)o1;//이렇게 다운캐스팅 해줘야 함
		Cat c1 = (Cat)o2;//이렇게 다운캐스팅 해줘야 함
		Cat c2 = (Cat)o1;//이건안돼. 강아지를 캣으로 바꿀 수 없어. 다운캐스팅은 같은 메모리 안에 있는 것 끼리만 된다.
		System.out.println(d1.name);
		System.out.println(c1.name);
	}

}
