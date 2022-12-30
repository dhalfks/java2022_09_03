package day05;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMulti(7);
	}
	/* 정수를 주면 해당 단의 구구단 출력메서드
	 * 매개변수 : 정수(int num)
	 * 리턴타입 : void
	 * 메서드명 : printMulti
	 * */
	public static void printMulti(int num) {
		//num단  * 1
		for(int i=1; i<=9; i++) {
			System.out.println(num + "*"+i+"="+(num*i));
		}
	}
	
}
