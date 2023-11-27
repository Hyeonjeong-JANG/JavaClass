package ch06;

public class ConEx04 {

	public static void main(String[] args) {
		
		//연습문제1
//				for(int i=1; i<11; i++) {
//					if(i == 6) {
//				
//					}else {
//						System.out.println(i);
//					}
//				}
		
		for(int i=1; i<11; i++) {
			if(i != 6) {
				System.out.println(i);
			}
		}
		System.out.println("==================");
		//연습문제2
		for(int i = 10; i>0; i--) {
			if(i != 3) {
				System.out.println(i);
			}
		}
		System.out.println("==================");
		//연습문제3-1 - 조건문으로
		for(int i = 1; i<21; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		//연습문제3-2 - 조건문 없이
		for(int i = 2; i<21; i=i+2) {
				System.out.println(i);
		}
		
	}
}
