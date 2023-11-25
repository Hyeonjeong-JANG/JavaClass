package ch05;

//프로토스유닛 안에는 질럿, 드라군, 다크템플러가 있다. 
//아래와같이 상속을 하면 다형성이 적용되어서 
//질럿을 부르면 프로토스유닛과 질럿의 특성이 모두 보여진다.
class 프로토스유닛{
	String name = "프로토스유닛";
	void 기본공격(프로토스유닛 e1) {}//무효화
	String 이름확인() {//무효화
		return "?";
//		System.out.println("프로토스유닛메서드");
	}
}

class 질럿 extends 프로토스유닛{
	String name = "질럿"; 
	
	//오버라이드 = 부모의 메서드를 무효화하다.
	//부모가 프로토스유닛메서드라고 했는데
	//자식이 가진 질럿메서드가 나옴
	void 기본공격(프로토스유닛 e1) {
//		System.out.println("질럿메서드");
//		System.out.println("질럿이 "+e1.name+"을 공격합니다.");
		System.out.println(this.name+"이 "+e1.이름확인()+"을 공격합니다.");
		
	}
	String 이름확인() {
		return name;
	}
	//오버라이드 = 부모의 메서드를 무효화하다.
	
}

class 드라군 extends 프로토스유닛{
	String name = "드라군";//얘는 실행이 안 되고 프로토스유닛이 실행돼. 그것을 고치기 위해 위에 프로토스유닛클래스에 이렇게 해준다.
	void 기본공격(프로토스유닛 e1) {

		System.out.println(this.name+"이 "+e1.이름확인()+"을 공격합니다.");
		
	}
	String 이름확인() {
		return name;
	}
}

class 다크템플러 extends 프로토스유닛{
	String name = "다크템플러";
	void 기본공격(프로토스유닛 e1) {

		System.out.println(this.name+"이 "+e1.이름확인()+"을 공격합니다.");
		
	}
	String 이름확인() {
		return name;
	}
}

//팀장 -> 신입아 리버라는 유닛을 하나 만들어봐.(오버라이드 해서 만들어!!)
//팀장 -> 프로토스유닛으로 상속해서 만들어봐.(공격메서드, 이름을 확인하는 메서드가 필요해)
//팀장 -> name이라는 변수를 하나 만들어서 리버라고 적어.



public class OOPEx06 {

	public static void main(String[] args) {
		프로토스유닛 u1 = new 질럿();//new 질럿 -> (질럿, '프로토스유닛') 질럿을 불렀으니까 타입을 질럿과 프로토스유닛 모두로 바꿀 수 있다. 그러면 이제 프로토스유닛을 바라보게 됨.
		프로토스유닛 u2 = new 드라군();//(드라군, '프로토스유닛')
		프로토스유닛 u3 = new 다크템플러();//(다크템플러, '프로토스유닛')
		
		u2.기본공격(u2);
		u2.기본공격(u3);
		
	}

}
