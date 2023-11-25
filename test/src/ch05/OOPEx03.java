package ch05;

//다형성

//홍길동은 요리사니까 상속을 받을 수 있어. 그렇기 때문에 홍길동은 요리사와 홍길동의 특성을 모두 가져.
//요리사를 홍길동이라고 특정할 수 없기 때문에 요리사는 요리사다!!(요리사에 홍길동 특성을 어쩌구 할 수 없어.)
//요리사
class 요리사{
	String name= "요리사";
}

//홍길동 or 요리사
class 홍길동 extends 요리사{
	String name="홍길동";
}
public class OOPEx03 {

	public static void main(String[] args) {
		홍길동 h1 = new 홍길동(); // new 홍길동을 하면 홍길동, 요리사가 같이 뜨고 홍길동 h1을 하면 홍길동을 바라보게 된다. 
		System.out.println(h1.name);
		
		요리사 y1 = new 홍길동();
		System.out.println(y1.name);
		
		//홍길동 h2 = new 요리사(); //이건 new 요리사를 했기 때문에 요리사만 떠서 홍길동을 불러올 수 없어.
	}

}
