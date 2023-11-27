package ch06;

public class ArrayForEx01 {

	//메서드 만들기
	static void 남은금액계산(int[] coin, int restMoney) {
		for(int i = 0; i<coin.length; i++) {
			System.out.println(coin[i]+"원: "+ (restMoney / coin[i]));
			restMoney = restMoney%coin[i];
			System.out.println("남은 금액: "+ restMoney);
		}
	}
	public static void main(String[] args) {
		// 동전구하기 500, 100, 50, 10
		int coin[] = {500, 100, 50, 10};
		int money = 1350;
		int restMoney = money;
	
		남은금액계산(coin, restMoney);
		//최소 동전 구하기 리팩토링
		
//		for(int i = 0; i<coin.length; i++) {
//			System.out.println(coin[i]+"원: "+ (restMoney / coin[i]));
//			restMoney = restMoney%coin[i];
//			System.out.println("남은 금액: "+ restMoney);
//		}//얘를 올림
		
//		//스탭1
//		System.out.println(coin[0]+"원: "+ (restMoney / coin[0]));
//		restMoney = restMoney%coin[0];
//		System.out.println("남은 금액: "+ restMoney);
//
//		//스탭2
//		System.out.println(coin[1]+"원: "+ (restMoney / coin[1]));
//		restMoney = restMoney % coin[1];
//		System.out.println("남은 금액: "+ restMoney);
//		
//		//스탭3
//		System.out.println(coin[2]+"원: "+ (restMoney / coin[2]));
//		restMoney = restMoney%coin[2];
//		System.out.println("남은 금액: "+ restMoney);
//		
//		//스탭4
//		System.out.println(coin[3]+"원: "+ (restMoney / coin[3]));
//		restMoney = restMoney%coin[3];
//		System.out.println("남은 금액: "+ restMoney);

	}

}
