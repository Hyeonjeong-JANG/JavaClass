package ch07;

class 총{
	void shoot() {
		System.out.println("총을 발사했습니다.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// 컴파일 예외(Java가 알 수 있음)
		try {
			System.out.println("잠자기 시작");// 요거 트라이 안에 안 적고 밖에다 쓰면 오류남.
			Thread.sleep(1000); // 메인스레드가 3초동안 잠을 잔다.
			System.out.println("잠자기 끝");
		} catch (Exception e) {// 방해! // 여러 익셉션이 있지만 부모인 그냥 익셉션을 써줘라.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 런타임 예외(개발자가 알 수 있다)
		int[] nums = {1, 2, 3};
		try {
			System.out.println(nums[3]);
		} catch (RuntimeException e) {
			// catch의 역할은 try(시도)하다가 예외가 발생하면 어덯게 처리할지를 정의하는 영역
			System.out.println("괜찮아 그냥 진행해");
			System.out.println(e.getMessage());// 어떤 오류가 발생했는지 알 수 있어. // 나중에는 이러게 얻은 메시지들은 로그 파일 등에 남겨 놓아야 한다.
			e.printStackTrace();// 오류의 추정 로그가 찍힘.
		}
		//3번지는 없어서 실행하면 3초 후에 오류가 나오면서 강제종료돼! 아래의 코드를 실행하지도 않고.
		// 트라이 캐치를 하지 않으면 수 많은 오류들이 발생할 수 있어.
		
//		총 s= new 총();
		총 s =  null;
		try {
			s.shoot();
		} catch (RuntimeException e) {// 여러 익셉션이 있지만 부모인 그냥 런타임익셉션을 써줘라.
			System.out.println("총이 없어서 총을 만들고 다시 시도하겠습니다.");
			s= new 총();
			s.shoot();
		}
		
		System.out.println("메인스레드종료");
	}

}

// 예외처리는 컴파일 예외, 런타임 예외가 있는데 컴파일 예외는 컴퓨터가 자동으로 알려준다. 런타임 예외는 그럴 수 없기 때문에 트라이 캐치를 써야 한다.
// 일반적인 컴파일 예외는 익셉션이라 적고 런타임예외는 런타임익셉션이라고 적어준다.
// try
// catch - 트라이하다 실패했으니까 그 후에 어떻게 처리할지 알려주는 곳이다.