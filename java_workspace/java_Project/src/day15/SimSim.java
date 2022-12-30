package day15;

import java.util.Scanner;

public class SimSim {

	public static void main(String[] args) {
		/* 1. String a = "a:b:c:d"  ==> "a#b#c#d" 로 변환
		 * 
		 * 2. 구구단 출력
		 * 
		 * 3. 입력 12345, 출력 1+2+3+4+5 = 총합을 출력
		 * 	  각 숫자는 배열로 담아 합계 처리
		 * 
		 * 4. out 파일에 저장되어 있는 내용을 out2로 저장
		 * 
		 * 5. int data[] = {1,2,3,4,5,6,7,8}
		 * 메서드를 이용하여 합계, 평균, 최대값, 최소값 출력
		 * 
		 * 6. 1~20까지의 랜덤수 발생 후 짝수만 배열에 5개 저장 후 출력
		 * 
		 * 7. String b = "aaabbbccdeeef" 입력 => 문자의 반복횟수 출력
		 *     결과 = a3b3c2d1e3f1   
		 * */
		Q3();
		
	}
	public static void Q3() {
		Scanner scan = new Scanner(System.in);
		String str = "9530234";
		System.out.println(str);
		int[] res = new int[str.length()];
		String num[] = str.split("");
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			res[i] = Integer.parseInt(num[i]);
			System.out.print(res[i]+" ");
			sum += res[i];
		}
		System.out.println();
		System.out.println("합계 : "+sum);
	}

}
