package day02;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/* 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 1+2  =3,  1*3 =3
		 * 연산자(+-* /)
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num1 = scan.nextInt();
		
		System.out.println("연산자를 입력해주세요.");
		//next() : 단어 .charAt(위치); 0번부터 시작
		char op = scan.next().charAt(0);  //한글자만 받음.
		
		System.out.println("숫자를 입력해주세요.");
		int num2 = scan.nextInt();
		
		switch(op) {
		case '+':
			System.out.println(num1+""+op+""+num2+"="+(num1+num2));
			break;
		case '-':
			System.out.println(num1+""+op+num2+"="+(num1-num2));
			break;
		case '*':
			System.out.println(num1+""+op+""+num2+"="+(num1*num2));
			break;
		case '/':
			System.out.println(num1+""+op+""+num2+"="+(num1/num2));
			break;
			default:
				System.out.println("잘못된 연산자입니다.~!!");
			break;
		}
		scan.close();

	}

}
