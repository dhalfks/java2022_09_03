package day06;

public class 클래스04 {

	public static void main(String[] args) {
		Car c = new Car(); 
		c.print();
		c.setColor("red");
		c.setDoor(2);
		c.setAirback(2);
		c.setPower(true);
		c.print();
		
		System.out.println("-------");
		Car c1 = new Car("red");
		c1.print();
		System.out.println("-------");
		Car c2 = new Car("blue",2);
		c2.print();
		System.out.println("-------");
		Car c3 = new Car("yello", 4, 4, true);
		c3.print();
		

	}

}
class Car{
	private String color;
	private int door;
	private int airback;
	private boolean power;
	
	public Car() {};
	public Car(String color) {
		// this 멤버변수를 의미
		// 매개변수와 멤버변수의 이름이 같은경우 사용
		this.color = color;
	}
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	public Car(String color, int door, int airback) {
		this(color, door);  //생성자 호출
		this.airback = airback;
	}
	public Car(String color, int door, int airback, boolean power) {
		this(color,door,airback); //생성자 호출
		this.power = power;
	}
	
	
//	public Car(String color, int door, int airback, boolean power) {
//		super(); //내 부모 생성자
//		this.color = color;
//		this.door = door;
//		this.airback = airback;
//		this.power = power;
//	}
	public void print() {
		System.out.println(color);
		System.out.println("door : "+door);
		System.out.println("airback : "+airback);
		System.out.println(power);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getAirback() {
		return airback;
	}
	public void setAirback(int airback) {
		this.airback = airback;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
}