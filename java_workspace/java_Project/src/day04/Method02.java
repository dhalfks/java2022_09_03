package day04;

public class Method02 {

	public static void main(String[] args) {
		// 2~100의 소수를 출력
		int sum=0;
		System.out.println(isPrime(11));
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) { //true / false
				sum = sum + i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("--2~100까지 소수의 합계--");
		System.out.println(sum);
	
	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판별 (true, false)
	 * 소수 : 1과 자기자신의 수외에는 나누어떨어지지 않는 수
	 * 리턴타입 : boolean
	 * 매개변수 : int num1 
	 * 메서드명 :	isPrime
	 * */
	public static boolean isPrime(int num1) {
		int cnt=0; //갯수 count
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0) {
				cnt++;
			}
		}
		if(cnt==2) {
			return true;
		}
		return false;
	}
}
