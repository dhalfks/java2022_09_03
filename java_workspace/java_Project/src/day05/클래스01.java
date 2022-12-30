package day05;

public class 클래스01 { //파일명과 클래스명이 같을 때만 public 가능.
	/* 클래스 - 설계도
	 * 객체 	- 제품
	 * 메서드 - 기능
	 * 
	 * 클래스
	 * - 속성(정보) : 멤버변수 
	 * - 기능 : 메서드
	 * 프린터 클래스
	 * - 속성(정보) : 크기, 제조사, 이름, 컬러
	 * - 기능 : 인쇄, 스캔, 복사, 팩스
	 * 
	 * 멤버변수는 클래스 안에 작성. 메서드 밖 위쪽 (4번라인)
	 * 멤버변수는 클래스안에서 사용할 수 있다. (모든 메서드를 포함)
	 * 
	 * - 객체 선언
	 * 클래스명 객체명;
	 * 
	 * - 객체 초기화(생성)
	 * 객체명 = new 클래스명();
	 * 
	 * - 객체 선언/초기화
	 * 클래스명 객체명 = new 클래스명();
	 * 
	 * - 멤버 메서드 사용 법
	 * 객체.메서드명();
	 * 
	 * 같은 클래스안의 메서드를 호출할 때는 그냥 사용가능. 
	 * 다른 클래스에서 메서드를 호출할 때는 객체를 이용하여(객체.메서드명) 사용가능.
	 * */
	/* 접근제한자(제어자)
	 * public : 모두사용가능.
	 * protected : 나 + 패키지 + 자식클래스
	 * (default) : 나 + 패키지
	 * private : 나
	 * 
	 * - 클래스에 public을 붙일 수 있는건 파일명과 같은 클래스만 가능. 
	 * - 멤버 변수와 멤버 메서드 public은 문제없이 사용가능.
	 * 
	 * private : 멤버변수/멤버메서드는 다른 클래스에서 사용할 수 없음. 
	 * 
	 * - 일반적으로 멤버변수는 private으로 하고, 멤버 메서드는 public으로 선언한다.
	 * - 일반적으로 private으로 선언된 멤버 변수는 getter/setter를 만들어서 해당 변수에
	 * 접근할 수 있도록 한다.
	 * */

	public static void main(String[] args) {
//		Method07_lotto lotto = new Method07_lotto();
//		int arrlotto[] = new int[7];
//		lotto.randomArray(arrlotto);
//		lotto.printArray(arrlotto);
		
		Point p = new Point();
		p.print();
		p.move(2, 3);
		p.print();
		p.x = 10; 
		p.y = 20;
		p.print();
		p.setX2(50);
		p.setY2(30);
		p.print();
		System.out.println(p.getX2());
		System.out.println(p.getY2());
		System.out.println(p.x);
		System.out.println(p.y);
		
	}

}

/* 다른 클래스 밖에서 클래스 생성 
 * 접근제한자 class 클래스명{
 * }
 * */
class Point{
	public int x;
	public int y;
	private int x2;
	private int y2;
	
	public void print() {
		System.out.println("xy:("+ x + ","+ y +")");
		System.out.println("x2y2:("+ x2 + ","+ y2 +")");
	}
	
	/* x, y의 값을 변경하는 move 
	 * 매개변수로 값을 받아 x,y 값을 변경
	 * */
	public void move(int x1, int y1) {
		x = x1;
		y = y1;
		x2 = x1;
		y2 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	/* x2, y2에 접근하기 위한 getter/setter 메서드 생성 */
//	public int getX2() {
//		return x2;
//	}
//	public void setX2(int x1) {
//		x2 = x1;
//	}
//	public int getY2() {
//		return y2;
//	}
//	public void setY2(int y1) {
//		y2 = y1;
//	}
	
}