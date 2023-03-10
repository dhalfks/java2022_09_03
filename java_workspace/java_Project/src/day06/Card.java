package day06;
/* Card 클래스 
 * - 숫자 : 1~10, J, Q, K
 * - 모양 : 하트, 다이아, 클로버, 스페이드
 * - 한장의 카드 정보를 출력 기능
 * */
/* 클래스의 구성
 * - 멤버변수 : 클래스의 속성/정보 => private으로 선언하고, getter/setter 생성
 * - 멤버 메서드 : 클래스의 기능
 * - 생성자 : 클래스의 멤버 변수를 초기화하는 메서드
 * - 클래스에 생성자가 하나도 없으면, 기본 생성자는 자동으로 생성한다.
 * - 생성자의 이름은 클래스명과 같고, 리턴 자리가 없음.
 * 생성자 선언방법
 * public Card(){
 * }
 * */
public class Card {

	private int num; //숫자
	private char shape; //모양
	
	public Card() {
		num = 1;
		shape = '♥';
	}
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
			default:
				System.out.print(num+" ");
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<1 || num >13) {
			this.num = 1;
		}else {
			this.num = num;
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '◆': case '♣': case '♠':
			this.shape = shape;
			break;
			default:
				this.shape='♥';
		}
	}
	
}
