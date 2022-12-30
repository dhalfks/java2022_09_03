package day03;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고, 
		 * 점수의 합계와 평균 출력
		 * 합계 : 
		 * 평균 : 
		 * */
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int arr[] = new int [size];
		int sum=0;
		double avg=0;
				
		System.out.println("점수를 입력해주세요.");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
			sum = sum+arr[i];  //sum += arr[i]
		}
		avg = (double)sum / arr.length;
		
		System.out.printf("합계 : %d%n",sum);
		System.out.printf("평균 : %.2f%n",avg);
		
		
		scan.close();

	}

}
