package ch06;



public class ForEx01 {
	//이름() -> 메서드의 일반적인 형식인데 
	//for()같이 호출하지 않아도 실행되는 메서드는 Expression(표현식)이라고 한다. 
	//int i=1; 초기화(for문이 시작될 때 단 한 번만 실행)
	//i<101; 조건문(처음부터 끝까지 계속 실행)
	//i=i+1 증감식(증가 or 감소)(for문이 한 번 실행된 이후부터 계속 실행)
	public static void main(String[] args) {
		
		for(int i = 1; i<101; i=i+1) {//i는 for라는 stack 내부에서 정의된 지역변수
			System.out.println(i);
		}
	}

}
