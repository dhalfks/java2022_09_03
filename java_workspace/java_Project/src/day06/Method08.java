package day06;

public class Method08 {

	public static void main(String[] args) {
		/* 메서드 오버로딩 
		 * - 동일한 이름을 가지는 메서드가 여러개 만드는 경우
		 * 1. 매개변수의 개수가 다르면 가능.
		 * 2. 매개변수의 종류(자료형)다른 경우 가능.
		 * 리턴타입은 상관 없음. 매개변수 이름도 상관없음. 
		 * */
		System.out.println(sum(1.5, 1.5));
		System.out.println(sum(10, 20, 30));
		String str = "Hello World";
		

	}
	
	//num1, num1를 매개변수로 받아 결과로 합을 돌려주는 메서드
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
