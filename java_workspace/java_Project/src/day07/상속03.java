package day07;

public class 상속03 {

	public static void main(String[] args) {
		/* 모든 클래스의 최고 조상은 Object 클래스
		 * 모든 클래스는 Object클래스가 제공하는 클래스를 사용할 수 있고,
		 * 오버라이딩 할 수 있다. 
		 * 
		 * 상속은 단일 상속이 원칙!!!
		 * 부모는 1명. 부모가 2개가 될 수 없다.
		 * 
		 * */
		A1 a = new A1();
		a.num = 10;
		System.out.println(a);

	}

}
class A1{
	int num;

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
}

class B1{
	int num1;
	
}

class C extends A1{
	
}