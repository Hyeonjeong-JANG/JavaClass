package ch03;

public class CoinExample {

	public static void main(String[] args) {
		// 동전구하기 500, 100, 50, 10
		int money = 2680;
		int restMoney = money;
		
		//변수명의 첫 글자는 숫자가 될 수 없다.
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		
		//스탭1
		System.out.println("500원: "+ (restMoney / 500));
		count500 = restMoney/500;
		restMoney = restMoney%500;
		System.out.println("남은 금액: "+ restMoney);

		//스탭2
		System.out.println("100원: "+ (restMoney / 100));
		count100 = restMoney/100;
		restMoney = restMoney % 100;
		System.out.println("남은 금액: "+ restMoney);
		
		//스탭3
		System.out.println("50원: "+ (restMoney / 50));
		count50 = restMoney/50;
		restMoney = restMoney%50;
		System.out.println("남은 금액: "+ restMoney);
		
		//스탭4
		System.out.println("10원: "+ (restMoney / 10));
		count10 = restMoney/10;
		restMoney = restMoney%10;
		System.out.println("남은 금액: "+ restMoney);
				
		//마무리
		System.out.println("==================");
		System.out.println(money + "의 최소 동전 개수는?");
		System.out.println( "500원"+count500+"개");
		System.out.println( "100원"+count100+"개");
		System.out.println( "50원"+count50+"개");
		System.out.println( "10원"+count10+"개");
		System.out.println("==================");
	}

}
