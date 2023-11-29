package ch06;
//제네릭문법: 어떤 클래스를 만들 때 타입이 정해져 있지 않으면 오브젝트로 하면 불편하니까 제네릭으로 해라 이거다.

//class 호랑이{
//	String name = "호랑이";
//}
//
//class 사자{
//	String name = "사자";
//}
//
//// 호랑이 또는 사자를 담는 큰 바구니
//class 큰바구니{
//	Object data;
//}
//
//public class GenericEx02 {
//
//	public static void main(String[] args) {
////		큰바구니 s1 = new 큰바구니();
////		s1.data = new 호랑이();//s1.data가 바라보는 것은 큰바구니여서 호랑이를 불러도 소용 없음
////		호랑이 h1 = (호랑이)s1.data;//그래서 다운캐스팅해줌
////		System.out.println(h1.name);		
//	}
//
//}//근데 이렇게 하면 불편해서 이렇게 안 쓸거야.

class 호랑이{
String name = "호랑이";
}

class 사자{
String name = "사자";
}

//호랑이 또는 사자를 담는 큰 바구니
class 큰바구니<T>{
T data;
}

public class GenericEx02 {

public static void main(String[] args) {
//	큰바구니<호랑이> s1 = new 큰바구니<호랑이>();//양쪽으로 호랑이 다 쓰면 귀찮으니까 뒷부분은 생략 가능
	큰바구니<호랑이> s1 = new 큰바구니<>();//이렇게 하면 위의 T에 호랑이가 딱 들어가게 되는거다. 그래서 호랑이 바구니가 된다.
	s1.data = new 호랑이();
	System.out.println(s1.data.name);
	
	큰바구니<사자> s2 = new 큰바구니<>();
	s2.data = new 사자();
	System.out.println(s2.data.name);
}

}
