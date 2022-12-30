package day01;

public class 변수 {

	public static void main(String[] args) {
		//주석 : 코드에 영향을 미치지 않는 문구, 설명을 위해 사용
		//한줄 주석 : // 시작점부터 주석 시작, 줄이바뀌면 영향력이 없다.
		/* 여러줄
		 * 주석입니다. */
		// 변수 선언 방법
		// 변수타입 변수명; 
		
		int num1, num3, num4;  //선언만 (같은 자료형을 같이 선언 가능)
		int num2 = 123; //선언 후 값을 지정
		char ch;
		float num5;
		num5 = (float) 1.2;  //float형은 접미사 f(F)
		double num6;
		num6 = 1.5;
		boolean bool ;
		bool = true;
		//노란밑줄 : 경고, 한번도 사용된적 없는 경우
		//빨간밑줄 : 오류
		int appleCount; //변수명은 의미 있게.
		int applecount; //대소문자 구분함.
		//중복선언 불가능
		char ch1 = 'a';
		System.out.println(ch1);
		num1 = 10;
		System.out.println(num1);
		//2진법, 8진법, 16진법(메모리주소 0x~)
		num2 = 010;  //8진수로 
		System.out.println(num2);
		num3 = 0x10; //16진수
		System.out.println(num3);
		long num7 = 123456789012L; //큰수를 다룰 때는 접미사 L(l)
		
		int kor=97, math=80, eng=70;
		int sum=0, avg=0;
		//지역변수 { } 괄호 안에서만 사용가능. 초기화가 반드시 필요
		if(num1 >= 70) {
			int a = 100;
			if(num1 > a) {
				System.out.println("a가 더 큽니다.");
			}
		}
		int a = 100;
		num2 = num1 + a ;
		System.out.println();
	}
	
}
