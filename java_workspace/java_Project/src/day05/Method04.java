package day05;

public class Method04 {

	public static void main(String[] args) {
		/* 메서드 선언부 구성
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 기능구현;
		 * }
		 * 메서드 선언 위치
		 * 클래스안, 메서드 밖
		 * */
		System.out.println(sum(10,20));
		System.out.println(sub(10,20));
		System.out.println(mul(10,20));
		System.out.println(div(20,4));
		System.out.println(mod(20,4));
		

	}
	/* 기능 : 두 정수의 합을 구해서 결과를 알려주는 메서드
	 * 리턴타입 : 결과를 자료형으로 표현 (int)
	 * 매개변수 : 두 정수( 각각 자료형 변수명)
	 * 메서드명 : sum
	 * */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	/* 기능 : 두 정수의 차를 구해서 알려주는 메서드
	 * */
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	/* 기능 : 두 정수의 곱을 구해서 알려주는 메서드
	 * */
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	/* 기능 : 두 정수를 나눠 값을 알려주는 메서드
	 * */
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	/* 기능 : 두 정수를 나눈 나머지를 알려주는 메서드
	 * */
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
}
