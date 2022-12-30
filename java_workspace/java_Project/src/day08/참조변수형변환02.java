package day08;

public class 참조변수형변환02 {

	public static void main(String[] args) {
		 P p1 = new P();
		 C c1;
		 if(p1 instanceof C) {
			 c1 = (C)p1;
			 System.out.println(c1.num2);
		 }else {
			 System.out.println("형변환이 불가능합니다.");
		 }
		 
		 P p2 = new C();
		 if(p2 instanceof C) {
			 c1=(C)p2;
			 System.out.println(c1.num2);
		 }else {
			 System.out.println("형변환이 불가능합니다.");
		 }
		 

	}

}
