package day07;

public class Calc {

	public static void main(String[] args) {
		/* 메서드 오버로딩을 이용해서 메서드 작성
		 * 메서드 오버로딩 규칙
		 * 1. 메서드의 매개변수 타입이 달라야 한다.
		 * 2. 메서드의 매개변수 개수가 달라야 한다.
		 * 리턴타입은 아무 영향을 주지 않는다.
		 * 메서드의 이름이 같다오 매개변수의 형태가 다르면
		 * 다른 메서드로 인식 맵핑
		 * 
		 * */
		int width = 100; //가로
		double height = 40; //세로
		//1. 삼각형의 면적 (가로*세로 /2)
		System.out.println(area(width, height));
		
		int w = 50;//가로
		int h = 30;//세로
		//2. 사각형의 면적 (가로*세로)
		area(w, h);
		
		//3. 원의 면적 (PI*r제곱)
		double r = 3;
		final double PI = 3.141592;
		double pi = Math.PI;
		System.out.println(area(r, PI));
	}
	/* 메서드명 : area
	 * */
	//1 메서드
	public static double area(int w, double h) {
		return w*h*0.5;
	}
	//2 메서드
	public static void area(int w, int h) {
		System.out.println("2. 사각형면적 : "+ w*h);
	}
	
	//3 메서드
	public static double area(double r, double pi) {
		return r*r*pi;
	}
}
