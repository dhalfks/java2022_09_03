package day03;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 거꾸로 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19463 => 36491 => 3+6+4+9+1
		 * 각 자리의 합계 출력 
		 * / 와 % 이용 
		 * 
		 * 
		 * */
//		int num = 114567;
//		System.out.println(a); //자리수
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();  // 12345
		int a = (int)Math.log10(num)+1; //자리수
		int arr[] = new int[a];
		int sum=0;
		int i=0;
		while(num > 0) {
			i++;
			int b = num % 10; //끝자리 분리
			arr[i] = b;
			num = num / 10;
			sum = sum+b;
			//System.out.println(a);
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println(sum);
				
				
				
				
				scan.close();;
		
		
	}

}
