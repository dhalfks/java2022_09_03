package day12;
//Product 클래스를 제네릭타입으로 생성
public class Sale_Generic01<K,V> {
	//멤버변수 menu, price
	private String menu;
	private int price;
	private K type;
	private V code;
	
	public Sale_Generic01() {}
	public Sale_Generic01(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
//	public K getMenu() {
//		return menu;
//	}
//	public void setMenu(K menu) {
//		this.menu = menu;
//	}
//	public V getPrice() {
//		return price;
//	}
//	public void setPrice(V price) {
//		this.price = price;
//	}
	
	
	@Override
	public String toString() {
		return "Sale_Generic01 [menu=" + menu + ", price=" + price + "]";
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public K getType() {
		return type;
	}
	public void setType(K type) {
		this.type = type;
	}
	public V getCode() {
		return code;
	}
	public void setCode(V code) {
		this.code = code;
	}
	
	
}
