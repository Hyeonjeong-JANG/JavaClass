package ch05;

//접근제어자 = 디폴트 접근제어자, public 접근제어자, private 접근제어자
class Player{
	// 상태 = 필드
	String name;
	private int thirsty;//private를 하면 외부 클래스에서 접근이 불가능해져.
	
	//상태를 초기화하기 위해서 아래와 같이 생성자를 만들었음.
	public Player(String name, int thirsty) {
		this.name=name;
		this.thirsty=thirsty;
	}
	
	// 행위 = 메서드 = 값을 변경할 수 있음
	void 물마시기() {
		System.out.println("물마시기 행위");
		this.thirsty = this.thirsty - 50;
	}
	
	int 목마름상태확인() {
		return this.thirsty;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("홍길동", 100);
		System.out.println("이름은: " +p1.name);
//		System.out.println("갈증지수: " +p1.thirsty + "/100");
		System.out.println("갈증지수: " +p1.목마름상태확인() + "/100");
		
		// 1. 첫 번째 시나리오 = 마법! 이렇게 하면 안 돼.
//		p1.thirsty=50;//원인 없이 갈증지수 변경 = 마법 -> 잘못된 프로그램
//		System.out.println("갈증지수: " +p1.thirsty + "/100");
		
		//2. 두 번째 시나리오 = 상태가 행위를 변경함 -> 이것도 하면 안 돼. -> 실수할 수 있음(신입) -> 실수할 수 있는 코드를 만드는 것이 문제.
//		p1.물마시기();//이렇게 하라고 했는데.
//		p1.thirsty=50;//신입은 이렇게 할 수 있어. 
//		System.out.println("갈증지수: " +p1.thirsty + "/100");
		//3. 세 번째 시나리오 -> 이게 객체지향 프로그램!!!
		//p1.thirsty = 50; // 아 이렇게 하니까 안 되네? 아!! 팀장님이 물마시기()로 해결하라고 하셨지!! ㅇㅋㅇㅋ
		p1.물마시기();//실수할 수가 없음.
		System.out.println("갈증지수: " + p1.목마름상태확인()+"/100");
		
	}

}

//상태지향 프로그래밍은 행위를 통해 상태를 변경한다!
//그런데 누군가가 직접 접근해서 변경할 수 있기 때문에 
//직접 접근하지 못하게 하기 위해 private를 꼭 붙여야 한다.
//그래야지 신입이 상태에 직접 접근을 못 한다.
