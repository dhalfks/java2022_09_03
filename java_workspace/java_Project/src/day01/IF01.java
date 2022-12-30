package day01;

public class IF01 {

	public static void main(String[] args) {
		/* if(조건식){ 실행문; }
		 * 실행문이 한줄일경우 {} 생략가능.
		 * 조건식이 참이면 실행문을 실행해라
		 * */
		/* num1 값을 주고, num1이 0이면 0이라고 출력
		 * 조건식 : num1이 0이면
		 * 실행문 : 0이라고 출력
		 * */
		int num1 = -1;
		if(num1 == 0) {
			System.out.println("num1은 0입니다.");
		}
		
		/* num1이 0이 아니면, 0이 아니라고 출력 
		 * 조건식 : num1이 0이 아니면
		 * 실행문 : 0이 아니라고 출력
		 * */
		if(num1 != 0) {
			System.out.println("num1은 0이 아닙니다.");
		}
		
		/* num1이 양수이면 양수라고 출력(0을 포함하지 않음.)
		 * num1이 0이면 0입니다. 아니면 음수입니다. 
		 * */
		num1=0;
		if(num1 > 0) {
			System.out.println("num1은 양수입니다.");
		}else if(num1 < 0){
			System.out.println("num1은 음수입니다.");
		}else {
			System.out.println("num1은 0입니다.");
		}
		
		/* num2가 짝수인지 홀수인지 판별
		 * num2가 짝수이면 짝수라고 출력, 아니면 홀수라고 출력
		 * */
		int num2=1;
		if(num2 % 2 == 0) {
			System.out.println(num2 + " : 짝수");
		}else {
			System.out.println(num2 + " : 홀수");
		}
	}

}
