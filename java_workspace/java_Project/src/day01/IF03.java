package day01;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학의 값을 입력받아 합계와 평균
		 * 평균 90이상이면 A
		 * 평균 80이상이면 B
		 * 평균 70이상이면 C
		 * 나머지는 D
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력(0~100) : 국,영,수 순으로");
			
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		if(kor <0 || kor >100) {
			System.out.println("잘못된 값입니다.");
		}
		if(eng <0 || eng >100) {
			System.out.println("잘못된 값입니다.");
		}
		if(math <0 || math >100) {
			System.out.println("잘못된 값입니다.");
		}
		
		int sum = kor+eng+math;
		double avg = sum / 3.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		char ch='F'; 
		if(avg > 100 || avg <0) {
			System.out.println("잘못된 성적입니다.");
		}else if(avg >= 90) {
			ch='A';
		}else if(avg >= 80) {
			ch='B';
		}else if(avg >= 70) {
			ch='C';
		}else {
			ch='D';
		}
		System.out.println("평가 : "+ch);
		
		
		scan.close();

	}

}
