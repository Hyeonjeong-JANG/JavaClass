package ch06;

class 궁수{
	String name = "궁수";
}
class 전사{
	String name = "전사";
}
public class ObjectEx02 {

	public static void main(String[] args) {
		//궁수[] s1 = new 궁수[2];
		//s1[1] = new 전사();//위와 같이 하면 s1은 궁수타입이기 때문에 이건 안 돼.
       //System.out.println(s1[0].name);
	   //System.out.println(s1[1].name);
		
		
		Object[] s1 = new Object[2];
		s1[0] = new 궁수();
		s1[1] = new 전사();
		
		궁수 g1 = (궁수)s1[0];//다운캐스팅
		전사 g2 = (전사)s1[1];
		
		System.out.println(g1.name);
		System.out.println(g2.name);
		// 오브젝트는 자주 쓰지 않지만 타입을 묶을 때 유용함
		// 단점: 다운캐스팅해줘야함.
	}

}
