package day08;

public class Exception01 {

	public static void main(String[] args) {
		System.out.println(calc(33,1,'+')); //RuntimeException은 가능하지만
		//그외 다른 Exception은 try catch문으로 예외처리를 하지 않으면 에러발생
		
		try {
			//예외가 발생할 수 있는 구문들...
			//ArithmeticException : 0으로 나누(/, %)었을 때 발생
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '%')); //예외발생
			System.out.println(calc(4, 0, '?')); //가능성
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '/')); //예외발생
		}catch(Exception e) {
			//예외 발생시 처리할 문구출력.
			System.out.println(e.getMessage());
			//System.out.println("예외가 발생했습니다.");
			//e.printStackTrace();
		}finally {
			//예외와 상관없이 꼭 나와야 하는 구문
			System.out.println("계산기 종료!!");
		}

	}
	
	/* 기능 : 두 정수와 산술연산자가 주어졌을 때 산술연산의 결과를 알려주는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : calc
	 * 메서드에서 throw를 발생시키게 되면 메서드 선언부에 throws를 이용하여 
	 * 발생할 수 있는 예외를 적어주어야 한다.
	 * RuntimeException일경우 생략가능.
	 * */
	public static double calc(int num1, int num2, char op) throws RuntimeException {
		//throws는 RuntimeException일경우 생략가능
		double res;
		//예외처리는 미리 앞에서 해주는게 깔끔하다.
		if((op=='/' || op=='%') && num2 == 0) {
			throw new RuntimeException("Num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': res = num1 / num2; break;
		case '%': res = num1 % num2; break;
		default:
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.~!!");
		}
		return res;
	}
	

}
