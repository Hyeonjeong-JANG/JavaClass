package ch01;

class 붕어빵{
	int 가격 = 1000;
	String 맛 = "달콤함";
	String 색깔 = "노란색";
}
public class ExampleEx01 {

	public static void main(String[] args) {
		붕어빵 붕어빵1 = new 붕어빵();
		붕어빵 붕어빵2 = new 붕어빵();
		붕어빵2.맛 = "매콤함";
		붕어빵 붕어빵3 = new 붕어빵();
		붕어빵3.색깔 = "빨간색";

		System.out.print(붕어빵1.가격);
		System.out.print(붕어빵1.맛);
		System.out.println(붕어빵1.색깔);
		System.out.print(붕어빵2.가격);
		System.out.print(붕어빵2.맛);
		System.out.println(붕어빵2.색깔);
		System.out.print(붕어빵3.가격);
		System.out.print(붕어빵3.맛);
		System.out.println(붕어빵3.색깔);
	}

}
