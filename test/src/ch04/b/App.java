package ch04.b;

import ch04.a.Cal;//import는 파일명까지 써야함.


//main이 있는 자바파일을 실행파일이라고 한다.
public class App {

	// JVM이 main 메서드를 찾으려면 public이 필요.(공개)
	// JVM이 main 메서드를 찾으려면 static이 필요.(메모리에 올린다는 뜻)
	// main 메서드만 return 타입을 허용하지 않는다.(void만 쓸 수 있다.)
	// 메서드의 이름이 main이다.
	// String[] args 매개변수 = 몰라도됨(나중에 배열할 때 알아보자구)
	public static void main(String[] args) {
		Cal c = new Cal();//Cal은 static이 없기 때문에 메모리에 아무 것도 뜨지 않기 때문에 new를 해서 heap에 올려줘야한다.			
		//new를 해주면 Cal 클래스의 static이 아닌 모든 것들이 메모리에 뜬다.
		c.minus();
		//System.out.println(c.num); public이 아니기 때문에 다른 패키지에서 찾을 수 없다.
	}

}
