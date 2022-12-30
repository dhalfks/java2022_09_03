package day02;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for, while, do~while문 
		 * - for, while문은 문법은 다르지만 동작은 같다.
		 * - do~while는 동작이 조금 다르다.
		 * 
		 * for(1.초기화 ; 2.5.8조건식 ; 4.7.증감연산식){
		 * 3.6.실행문;
		 * }
		 * 1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화
		 * 			 실행시 처음 한번만 실행, 생략가능.
		 * 2. 조건식 : 반복문의 반복을 결정하는 식. 참이면 반복, 거짓이면 그만.
		 * 			 생략가능 (생략하면 무조건 true)
		 * 3. 증감연산식 : 조건식에서 사용하는 변수가 증가/감소되어 반복횟수를 결정
		 * 				생략가능
		 * */
		/* 1~10까지 출력하는 예제 
		 * 초기화 : 1부터 (i=1)
		 * 조건식 : 10까지(i<=10)
		 * 증감연산식 : 1씩증가 (i++) i = i + 1
		 * 실행문 : i를 출력
		 * 반복문이 종료 후 : 없음.
		 * */
		
		for(int i=1; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println(); //줄바꿈.
		
		/* 10부터 1까지 출력
		 * 초기화 : j = 10
		 * 조건식 : j >= 1
		 * 증감연산식 : j--
		 * 실행문: j를 출력
		 * 종료 후 : 없음.
		 * */
		for(int j=10; j>=1; j--) {
			System.out.print(j+" ");
		}
		System.out.println(); //줄바꿈
		
		/* 1~10까지 모든 짝수를 출력
		 * 초기값 : 2부터
		 * 조건식 : 10까지
		 * 증감식 : 2씩증가
		 * 실행문 : 출력
		 * */
		for(int i=2; i<=10; i=i+2) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) { //짝수의 조건
				System.out.print(i+" ");
			}
		}
		System.out.println();//줄바꿈
		/* 1~10까지의 합계 출력 (1+2+3+4+5+...10)
		 * 초기화 : 1부터 (i=1)
		 * 조건식 : 10까지 (i<=10)
		 * 증감식 : i++
		 * 실행문 : sum=sum+ i 누적
		 * 실행 후 :sum 출력
		 * */
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum + i; //sum+=i;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		
		/* 2단출력 
		 * 2*1=2 , 2*2=4, 2*3=6 ... 2*9=18
		 * 초기화 : i=1
		 * 조건식 : i<=9
		 * 증감식 : i++
		 * 실행문 : 출력 2*i = (2*i)
		 * 종료 후 : 없음.
		 * */
		for(int i=1; i<=9; i++) {
			System.out.println("2*"+i+"="+(2*i));
		}
	}

}
