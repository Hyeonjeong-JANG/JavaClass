package ch06;

public class ConEx02 {

	public static void main(String[] args) {
		int point = 80;
		//성적이 90점이 넘으면 차를 주겠다.
		//성적이 90점이 안 되면 벌을 주겠다.
		if(point > 90) {
			System.out.println("차를 받음");
		} else {
			System.out.println("매 맞음");
		}
	}

}
