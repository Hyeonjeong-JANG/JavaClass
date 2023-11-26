package ch06;


//if문은 조건을 만족할 때 한 번 실행
//반복문은 조건을 만족할 때 여러 번 실행
public class ConEx01 {

	public static void main(String[] args) {
		int point = 80;
		//성적이 80점이 넘으면 용돈을 받음.
		if(point > 80) {
			System.out.println("용돈 받음");
		} else {
			System.out.println("용돈 못 받음");
		}
	}

}
