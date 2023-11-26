package ch06;

public class ConEx03 {

	public static void main(String[] args) {
		int point = 91;
		
		//90점이 넘으면 차를 사주겠다.
		//80점이 넘으면 자전거를 사주겠다.
		//그게 아니면 벌을 주겠다.
		
		if(point > 90) {
			System.out.println("차를 사줌");
		} else if(point > 80){
			System.out.println("자전거를 사줌");
		}else {
			System.out.println("매 맞음");
		}
	}

}
