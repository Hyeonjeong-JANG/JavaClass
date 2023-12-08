package ch07;
// String Constant Pool
public class StringEx01 {

	public static void main(String[] args) {
		String s1 =new String("바다");//100번지
		String s2=new String("바다");//30번지
		//String은 사용이 매우 빈번하기 때문에 new를 쓰지 않아도 된다.
		String s3= "바다";//500번지
		String s4= "바다";//500번지
		System.out.println("s1");
		System.out.println("s2");
		System.out.println(s1==s2); // 주소를 비교 // 서로 저장된 공간이 달라서 false
		System.out.println(s3==s4); // 주소를 비교 //서로 저장된 공간이 같음!!
		s3 = s3+"태양";// 바다태양이 된다고 원래의 s3공간이 바다태양으로 바뀌는 것이 아니라 새로운 공간에 저장이 되는 것이다. 그리고 s3은 바다태양을 가리키게 된다.
		System.out.println(s3);
		System.out.println(s4);
		s3 = s3 + "달";// 또 새로운 공간에 바다태양달이 저장되고 s3은 바다태양달을 가리킨다.
		System.out.println(s3);
		// 바다, 바다태양이 저장되었던 곳은 가바지 컬렉션이 된다.
		// 장점: 같은 문자열이면 같은 공간을 공유해서 쓰기 때문에 메모리의 효율이 좋다.
		// 단점: 문자열을 변경하게 되면 될 때마다 새로운 공간이 할당된다. 문자열을 자주 변경하는 경우에는 사용하지 않는 것이 좋아.
		// 문자열을 비교할 때 -> s1 s2 s3 s4(바다)
		System.out.println(s1.equals("바다"));//문자열 값 자체와 주소 두 개를 비교
	}

}
