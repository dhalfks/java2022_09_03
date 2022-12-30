package day02;

public class For02 {

	public static void main(String[] args) {
		/* 1~10까지의 홀수 합, 짝수 합
		 * 조건 짝수/홀수 판별
		 * 초기화 : i=1
		 * 조건식 : i<=10
		 * 증감식 : i++
		 * 실행문 : 짝수인지 판별, 합 아니면 합
		 * 종료 후 : 합을 출력
		 * */
		int evenSum=0, oddSum=0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) { //짝수라면..
				evenSum = evenSum + i;  //evenSum += i
			}else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("짝수 합계 : "+ evenSum);
		System.out.println("홀수 합계 : " + oddSum);
		
		//구구단 출력 2*1단 ~ 9단까지   i * j = 
		for(int i=2; i<=9; i++) { // 2 ~ 9단
			for(int j=1; j<=9; j++) { //2 * 1~9
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
//		for(1. (int i=2); 2. (i<=9); 4. (i++)) { // 2 ~ 9단
//			3.실행문(for(int j=1; j<=9; j++) { //2 * 1~9
//				System.out.println(i+"*"+j+"="+(i*j));
//			})
//		} 
//		
//		2단(i) => j 1~9
//		3단(i) => j 1~9
		
	}

}
