package day03;

public class Array04 {

	public static void main(String[] args) {
		int arr[] = new int[] {3, 5, 7, 1, 6, 9, 4};
		/* 합계, 평균, 최대값, 최소값 출력
		 * */
		int max, min, sum=0;
		double avg=0;
		max=arr[0]; //3
		min=arr[0]; //3
		
		for(int i=0; i<arr.length;i++) {
			//sum = sum + arr[i];
			if(max < arr[i]) {
				max = arr[i]; //최대값
			}
		}
		System.out.println("최대값 : "+max);
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		avg = (double)sum/arr.length;
		System.out.println("최소값 : "+min);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
