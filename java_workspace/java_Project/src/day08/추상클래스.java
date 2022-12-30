package day08;

public class 추상클래스 {

	public static void main(String[] args) {
		/* 추상 클래스 : 추상 메서드를 포함하는 클래스
		 * 추상 메서드 : 선언부만 있고, 구현부가 없는 메서드
		 * 추상 클래스를 이용하여 객체를 생성할 수 없다.
		 * */
		Dog d = new Dog();
		d.name="강아지";
		d.category = "개과";
		d.printInfo();
		d.howl();

	}

}
//추상 클래스 Aminal 생성 abstract
// 
abstract class Animal{ //추상클래스
	public String name;
	public String category;
	public void printInfo() {
		System.out.println("-------");
		System.out.println("이름:"+name);
		System.out.println("분류:"+category);
	}
	public abstract void howl(); //추상메서드
}
//추상클래스를 상속받으면 반드시 구현해야 한다.
//자식클래스가 추상클래스면 구현안해도 됨. 
class Dog extends Animal{
	public Dog() {}
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}
	@Override
	public void howl() {
		System.out.println("울음소리:멍멍");
	}
	
}