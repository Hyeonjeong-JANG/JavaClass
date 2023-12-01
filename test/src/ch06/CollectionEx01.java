package ch06;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEx01 {

	public static void main(String[] args) {
		
		//배열과 콜렉션의 차이
		// 배열은 연속된 공간이 있어야 해서 크기를 미리 정해 놓지만
		// 콜렉션은 떨어지게 저장할 수 있어서 크기를 미리 정해 놓을 필요가 없다. 
		// int, double, char, boolean => 기본자료형(값을 가짐)
		// String, 커스텀자료형(클래스) => 레퍼런스자료형(주소를 가짐)
		//제네릭에는 기본자료형이 올 수 없음. <int>이런거 금지.
		// 그래서 래핑클래스가 있음 = Integer, Double, Character, Boolean. 숫자를 넣고 싶으면 int 대신에 Integer 넣고 이렇게 사용하면 됨.
		ArrayList<Integer> c1=new ArrayList<>();
		int n1 =1;
		Integer n2 = 2;
//		System.out.println(n1);
//		System.out.println(n2);
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		System.out.println(c1.get(0));
		System.out.println(c1.get(1));
		System.out.println(c1.get(2));// c1 배열의 0, 1, 2번째
		
		
		// for문(반복문)
		int size=c1.size();
		System.out.println("사이즈: "+c1.size());//c1에 뭘 추가해도 자동으로 사이즈가 변경되어서 출력됨.
//		for (int i = 0; i <c1.size(); i++) {//이렇게 쓰면 반복할 때마다 size()라는 메서드를 계속 호출함. 안 좋음.
		for (int i = 0; i <size; i++) {//이렇게 코드를 리팩토링함. 이게 콜렉션.
			System.out.println(c1.get(i));
		}
		
	}

}
