package day06;

public class Method09 {

	public static void main(String[] args) {
		/* calc(1, 2, /)  + - * / % 
		 * calc(1.4, 2.1, +)
		 * 메서드 오버로딩을 이용하여 두정수와 연산자, 두 실수와 연산자 값을 입력했을 때
		 * 연산의 결과가 출력되는 calc 메서드를 완성하시오. 
		 * */
		int res = calc(10, 20, '+');
		if(res == 99999) {
			System.out.println("잘못된 연산자입니다.");
		}else {
			System.out.println(res);
		}

	}
	public static int calc(int num1, int num2, char op) {
		int res;
		switch(op) {
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': res = num1 / num2; break;
		case '%': res = num1 % num2; break;
		default:
			res = 99999;
		}
		return res;
	}
	public static double calc(double num1, double num2, char op) {
		switch(op) {
		case '+': return num1 + num2;
		case '-': return num1 - num2;
		case '*': return num1 * num2;
		case '/': return num1 / num2;
		case '%': return num1 % num2;
		}
		return 99999;
	}

}
