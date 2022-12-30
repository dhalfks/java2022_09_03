package day08;

public class 참조변수형변환 {
	

	public static void main(String[] args) {
//		int num = 5;
//		int num2 = 3;
//		double num3 = (double)num / num2;
		
		//자식을 부모로 형변환하는 경우 무조건 가능.
		C c = new C();
		P p = new P();
		P c1 = new C(); //자동으로 변환 가능.
		System.out.println(c1.num1);
		
		P p2 = c;  //자동을 변환 가능.
		
		//부모를 자식으로 형변환하는 경우 형 변환을 생략할 수 없으며, 조건부로 에러가 발생할수도 있음. 
		//1. 에러가 발생하지 않은 경우
		// 부모의 참조변수가 자식의 객체랑 연결되어 있는 경우
		//이 부모의 객체를 다시 자식의 객체로 형변환 가능.
		P p3 = new C(); //부로를 자식 객체와 연결
		C c3 = (C)p3;
		
		System.out.println(c3.num1);
		System.out.println(c3.num2);
		System.out.println(p3 instanceof C);
		//2. 에러가 발생하는 경우 (예외발생)
		P p1 = new P();
		C c4 = (C)p1;
		
		System.out.println(c4.num1);
		// p1객체가 C클래스로 형변환이 가능한지 체크
		if(p1 instanceof C) {
			System.out.println("형변환 가능");
		}else {
			System.out.println("불가능합니다.");
		}
		
		
	}

}
class P{
	int num1 = 10;
}

class C extends P{
	int num2 = 20;
}