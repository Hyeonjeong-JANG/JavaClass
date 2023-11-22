package ch01;

class Note1 {
	static int num = 1;
	static int time = 1015;
	static int price = 3000;
}

class Note2 {
	static int num = 2;
	static int time = 1020;
	static int price = 1000;
}

// 노트가 100개 필요하면 클래스를 100개 만들어야해?!
// static으로 만들어 놓으면 딱 만들어진 것 외에는 사용할 수 없어.(정적방법)
// 동적 방법(heap)을 사용하자!! VarEx05!!
public class VarEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Note1.num);
		System.out.println(Note1.time);
		System.out.println(Note1.price);
	}

}
