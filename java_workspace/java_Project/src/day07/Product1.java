package day07;

public class Product1 {
	private String name;
	private int price;
	
	public Product1() {}
	public Product1(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//등록
	public void insertProdcut(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[상품명:" + name + ", 가격:" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
