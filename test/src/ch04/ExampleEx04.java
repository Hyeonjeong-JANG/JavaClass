package ch04;

class Food{
	String menu;
	int price;
	
	public Food(String menu, int price) {
		this.menu=menu;
		this.price=price;
	}
	
	void myPrint() {
		System.out.println(menu + " 가격은 " + price + "입니다.");
	}
}
public class ExampleEx04 {

	public static void main(String[] args) {

		Food f1 = new Food("치킨", 2000);
		Food f2 = new Food("피자", 5000);
		
		f1.myPrint();
		f2.myPrint();
	}

}
