package ch05;

abstract class Animal{
	//void speak() {}//예가 무효화 되더라도 들고는 있어야 한다.
	abstract void speak();//추상메서드는 몸체{}가 있어선 안 됨.{}요거 금지
	
	void Hello() {
		System.out.println("!!!");
	}
}//추상클래스는 내부는 너네가 알아서 해라 이런 느낌.
//추상클래스 안의 메서드는 추상메서드로 할 수도 있고 일반 메서드로 할 수도 있다.
//추상메서드를 쓰면 그 부분은 반드시 오버라이드 해야하고 일반 메서드로 쓴 부분은 그렇지 않다.


class Dog extends Animal{
	//오버라이드(Animal의 speak()가 무효화된다.)
	void speak() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	//오버라이드(Animal의 speak()가 무효화된다.)
	void speak() {
		System.out.println("야옹");
	}
}

//신입아 Bird를 하나 만들어!! Animal을 상속해서 만들어.
//그리고 sysout 해서 짹쨱만 해주면 돼!
class Bird extends Animal{

	//추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야 한다.
	@Override
	void speak() {
		System.out.println("짹짹");
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1=new Dog();
		Animal a2=new Cat();
		Animal a3=new Bird();
		a1.speak();//동적바인딩: 애니멀의 스피크를 호출하러 갔다가 오버라이드(부모의 메서드가 무효화) 때문에 도그의 스피크가 호출됨.
		a2.speak();
		a3.speak();
		//Animal a3 = new Animal();
	}

}
