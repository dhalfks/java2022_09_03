package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stream04 {

	public static void main(String[] args) {
		/* 여행사 상품이 있습니다. 
		 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 때 비용 계산, 고객 명단 검색, 출력
		 * 고객에 대한 클래스를 생성하고, ArrayList로 고객을 관리
		 * 
		 * 고객정보
		 * CustomerLee
		 * 이름 : 이순신, 나이 : 40, 비용 : 100
		 * CustomerKim
		 * 이름 : 김유신, 나이 : 20, 비용 : 100
		 * CustomerHong
		 * 이름 : 홍길동, 나이 : 13, 비용 : 50
		 * 
		 * 고객명단 => 총 여행경비 합계
		 * 이름 : 이순신, 나이 : 40, 비용 : 100
		 * 이름 : 김유신, 나이 : 20, 비용 : 100
		 * 이름 : 홍길동, 나이 : 13, 비용 : 50
		 * 총여행비용 : 250
		 * 
		 * 20대 이상고객명단 => 이름순으로 정렬
		 * 이름 : 김유신, 나이 : 20, 비용 : 100
		 * 이름 : 이순신, 나이 : 40, 비용 : 100
		 * */
		//Customer클래스를 이용한 객체 생성
		Customer cuLee = new Customer("이순신", 40);
		Customer cuKim = new Customer("김유신", 20);
		Customer cuHong = new Customer("홍길동", 13);
		
		//ArrayList생성 객체 저장
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(cuLee);
		customerList.add(cuKim);
		customerList.add(cuHong);
		
		int sum =0;
		System.out.println("-고객명단-");
		for(Customer tmp : customerList) {
			String name = tmp.getName();
			int age = tmp.getAge();
			int price = tmp.getPrice();
			sum += price; //가격합계
			System.out.println(name+":"+age+", 비용:"+price);
		}
		System.out.println("총비용 : "+sum);
		//정렬
		Collections.sort(customerList);
		
//		customerList.sort(new Comparator<Customer>() {
//
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				// String: compareTo 1(양수), -1(음수), 0
//				// int: 작은수- 큰수: (-)  큰수-작은수 : + 양수, 음수, 0
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		//조건 20세이상만 출력
		for(Customer tmp : customerList) {
			if(tmp.getAge()>=20)
			System.out.println(tmp);
		}
		
		//Stream을 이용한 방법
		System.out.println("==스트림을 이용한 방법==");
		customerList.stream().map(c->c.getName()) //원하는 요소만 추출해서 출력
			.forEach(s->System.out.println(s));
		System.out.println("--총비용--");
		int tot = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 경비:"+tot);
		customerList.stream().filter(c->c.getAge()>=20).sorted()
			.forEach(a->System.out.println(a));
		 
	}

}
class Customer implements Comparable<Customer>{
	//멤버변수선언
	private String name;
	private int age;
	private int price;
	
	//생성자
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = age>=15? 100: 50;
//		if(age>=20) {
//			this.price=100;
//		}else {
//			this.price=50;
//		}
	}
	//getter/setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//toString
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}