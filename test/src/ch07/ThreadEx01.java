package ch07;
//자바는 일단은 메인 스레드 하나만 들고 있다. 
public class ThreadEx01 {
	
	//자바의 메인 스레드
	public static void main(String[] args) {
		for(int i=1; i<11;i++) {
			System.out.println(i);
		}
	}

}
