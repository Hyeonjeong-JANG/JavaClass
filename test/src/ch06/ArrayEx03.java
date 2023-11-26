package ch06;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[][] nums = {{1,2,3},{4,5,6}};//2행 3열 이차원 배열
		
		System.out.println(nums[0][0]);//0
		System.out.println(nums[0][2]);//3
		System.out.println(nums[1][1]);//5
		
		int[][] nums2 = new int[2][2];//2행2열의 배열이 나옴.
		
		nums2[0][0] = 1;
		nums2[0][1] = 2;
		nums2[1][0] = 3;
		nums2[1][1] = 4;//요 순서로 읽는 것이 좋고 막 뒤죽박죽 읽는 것은 좋지 않다.
		
		System.out.println(nums2[1][0]);
	}

}
