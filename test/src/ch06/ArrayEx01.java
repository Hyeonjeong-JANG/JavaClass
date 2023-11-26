package ch06;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] nums= {4,5,6};
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		//System.out.println(nums[3]);//이건 범위를 벗어나서 안 됨.
	}

}

//배열
//연속된 3개의 int형 공간이 필요(3개의 배열을 저장할 경우)
//데이터 읽기가 빠르다.
//시작 번지만 바라본다.
//0번지부터 시작한다.