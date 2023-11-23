package ch04.a;

public class App2 {

	public static void main(String[] args) {
		Cal c = new Cal();//같은 패키지에 있기 때문에 가져다 쓸 수 있음.
		c.add();//같은 패키지에 있기 때문에 가져다 쓸 수 있음.
		c.minus();//같은 패키지에 있기 때문에 가져다 쓸 수 있음.
		// c.multi(); // 같은 클래스가 아니기 때문에 찾을 수 없다.
		System.out.println(c.num);//같은 패키지에 있기 때문에 찾아짐.
	}

}

