package day06;

public class Method10 {

	public static void main(String[] args) {
		/* 재귀 메서드 : 메서드A 안에 메서드A를 호출하는 메서드(드물게 사용)
		 * 10! = 10*9*8*7*6*5*4*3*2*1
		 * 5!=5*4*3*2*1
		 * 4!=4*3*2*1
		 * 3!=3*2*1
		 * 2!=2*1
		 * 1!=1
		 * 0!=1
		 * */
		System.out.println(fact(5));
		System.out.println(factorial(5));

	}
	/* 기능 : 양수가 주어지면 주어진 양수의 팩토리얼값을 알려주는 메서드
	 * 매개변수 : 양수 => int num
	 * 리턴타입 : 팩토리얼 값 => int
	 * */
	public static int fact(int num) {
		if(num < 0) { //num가 0보다 작다면 0리턴 
			return 0; //이부분이 없다면, 스택 오버플로 발생.
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		int res = 1;
		for(int i=2; i<=num; i++) {
			res*=i;  //res = res * i
		}
		return res;
	}
	
	public static int factorial(int num) {
		if(num < 0) { //num가 0보다 작다면 0리턴 
			return 0; //이부분이 없다면, 스택 오버플로 발생.
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		return num * factorial(num-1);
	}

}
