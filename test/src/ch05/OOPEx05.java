package ch05;

class 전사{//검
	String name = "전사";
	
	void 기본공격(궁수 e1) {
		System.out.println("검으로 " + e1.name + " 공격하기");
	}//이렇게되면 전사는 궁수만 공격할 수 있어. 광전사를 공격하고 싶다면 아래와 같이 복사해서 해보자.
//	void 기본공격2(광전사 e1) {
//		System.out.println("검으로 " + e1.name + " 공격하기");
//	}
	
	//오버로딩(유닛이 100개라면)
	void 기본공격(광전사 e1) {
		System.out.println("검으로 " + e1.name + " 공격하기");
	}
	
	//오버로딩(유닛이 100개라면)
	void 기본공격(마법사 e1) {
		System.out.println("마법으로 " + e1.name + " 공격하기");
	}
	
	//오버로딩(유닛이 100개라면)
	void 기본공격(엘프 e1) {
		System.out.println("활로 " + e1.name + " 공격하기");
	}
	
	//오버로딩(유닛이 100개라면)
	void 기본공격(흑마법사 e1) {
		System.out.println("흑마법으로 " + e1.name + " 공격하기");
	}
}

class 궁수{//활
	String name = "궁수";
	
	void 기본공격(광전사 e1) {
		System.out.println("활로 " + e1.name + " 공격하기");
	}
}

class 광전사{//도끼
	String name = "광전사";
	
	void 기본공격(전사 e1) {
		System.out.println("도끼로 " +e1.name+ " 공격하기");
	}
}

class 마법사{//마법
	String name = "마법사";
	
	void 기본공격(전사 e1) {
		System.out.println("마법으로 " +e1.name+ " 공격하기");
	}
}

class 엘프{//활
	String name = "엘프";
	
	void 기본공격(전사 e1) {
		System.out.println("활로 " +e1.name+ " 공격하기");
	}
}


class 흑마법사{//흑마법
	String name = "흑마법사";
	
	void 기본공격(전사 e1) {
		System.out.println("흑마법으로 " +e1.name+ " 공격하기");
	}
}

public class OOPEx05 {

//	static void attack(전사 u1) {
//		u1.기본공격();
//	}
	public static void main(String[] args) {
		전사 u1 = new 전사();
		궁수 u2 = new 궁수();
		광전사 u3 = new 광전사();
		마법사 u4 = new 마법사();
		엘프 u5 = new 엘프();
		흑마법사 u6 = new 흑마법사();
		
//		attack(u1);
		u1.기본공격(u2);//u1은 기본공격할 때 u2를 받아야 함.
		u2.기본공격(u3);
		u3.기본공격(u1);
//		u1.기본공격2(u3);//이렇게하면 각각의 적군마다 메서드를 모두 기억해줘야하니까 헷갈려. 오버로딩을 해보자.
		//오버로딩을 하면 기억해야 할 메소드 명이 줄어들기 때문에 편해. 유닛이 100개라면? 
		//유닛이 100개라면 기본공격 메서드가 100개가 되어야 한다. 엄청난 단점!!!
		//오버로딩은 어느 정도 경우의 수의 제한이 있다면 좋다. 하지만 경우의 수가 많다면? 힘들어.
		u1.기본공격(u3);
		u1.기본공격(u4);
		u1.기본공격(u5);
		u1.기본공격(u6);
	}

}
//OOPEx06.java에서는 오버로딩의 한계 극복이 나온다. -> 오버라이딩?!