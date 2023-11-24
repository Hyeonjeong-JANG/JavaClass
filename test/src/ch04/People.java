package ch04;

public class People {
	String name;
	int age;
	// 이 파일에는 디폴트 생성자가 있을까요? .java 를 .class로 컴파일할 때 자바가 자동으로 코드를 만들어줌.
	// 다양성을 위해서 따로 초기화하지 않음.
	// 내가 직접 생성자를 정의하였기 때문에 디폴트 생성자 없음.
	public People(String name, int age) {
		System.out.println("People 메서드 스택의 name: "+name);
		System.out.println("People 메서드 스택의 age: "+age);
		
		this.name=name;
		this.age=age;//this는 자기 자신의 heap공간을 가리킴
//		public class People {
//			String name;
//			int age;
//			}얘네
	}
}
