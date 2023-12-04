package ch07;
//자바는 일단은 메인 스레드 하나만 들고 있다. 
class SubThread implements Runnable{

	//자바의 서브스레드
	@Override
	public void run() {
		for(int i=1; i<6;i++) {
			try {System.out.println("서브스레드: "+i);
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	
}
public class ThreadEx01 {
	
	//자바의 메인 스레드
	public static void main(String[] args) {		
		SubThread st = new SubThread();
		Thread t1 = new Thread(st); // 타겟(st)을 선정하는 자리
		t1.start();// run 메서드 실행
		
		for(int i=1; i<6;i++) {
			try {System.out.println("메인스레드: "+i);
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
// main 스레드와 run 메서드를 왔다갔다 하면서 문맥을 교환한다.
// 1. 눈속임 가능 2. 힘들어요

// 만드는 방법
// 박스를 만들자(스레드 객체를 만들자)
// 스레드 객체의 타겟을 설정하자.(반드시 runnable타입어야 함.)
// 실행하자.