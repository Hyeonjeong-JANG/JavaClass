package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		//캐스팅(다운캐스팅, 업캐스팅)
		int n1 = 100;//4Byte
		double d1 = n1;//8Byte(8Byte <- 4Byte) // 8바이트 공간에 4바이트를 넣은 것과 같다.
		System.out.println(d1);//업캐스팅(작은 것을 큰 쪽으로 넣음), 묵시적으로 일어남
		
		double d2 = 100.8;
		//int n2 = d2;//double을 int로 변환할 수 없어요. 
		int n2 = (int)d2;//명시적 형변환을 해준다. 다운캐스팅
		System.out.println(n2);//큰 것을 작은 것에 구겨 넣었으니 잘려나간다.
		// 단점: 데이터가 유실될 수 있다. 100.8이 100으로 잘려서 나옴.
		
		int money = 130;
		System.out.println(130 / 100);
		System.out.println(money / 100);
		System.out.println(money / 100.0);// int  나누기 double을 해주면 double이 된다. //나누면 큰 쪽으로 따라간다.
		//4바이트 공간(int)을 8바이트 공간(double)으로 나누면 그 값이 8바이트 공간으로 들어가서 1.3 이렇게 나올 공간이 있어서 그렇게 나온다.
		//4바이트 공간(int)을 4바이트 공간(int)으로 나누면 4바이트 안에는 정수가 들어갈 수 있으니 1이 나온다.
	}

}
