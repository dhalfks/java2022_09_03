package product;

public class Order extends Product {
	private int count; //수량
	private int total; //한메뉴에 대한 지불금액
	
	public Order() {}
	public Order(String menu, int count) {
		//super.menu = menu;
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
//	@Override
//	public String toString() {
//		//return super.menu +", "+ count +" "+ super.price;
//	}
	
}
