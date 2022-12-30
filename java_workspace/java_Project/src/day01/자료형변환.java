package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		/* 자료형(변수타입)
		 * 변수 A = B 저장하려고 할 때 자료형이 서로 맞지 않으면 오류
		 * (자료형변환 casting) 저장이 가능.
		 * 자동 자료형 변환 : 자료형변환시 생략해도 문제가 없는 경우.
		 * */
		double num1 = 10;
		byte num2 = 1;
		int num3 = num2;
		
		//명식적 자료형 변환 : 에러가 발생하거나, 필요에 의해 형변환이 필요한 경우
		//리터럴 값 앞에 (타입)
		int num4 = (int)num1;
		int num5 = (int)1.2;
		System.out.println(num5);

	}

}
