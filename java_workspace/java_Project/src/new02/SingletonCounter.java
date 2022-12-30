package new02;

class Counter{
	// 싱글톤 패턴으로 객체 만들기
	private static Counter instance;
	private int count;
	
	//private 생성자 
	private Counter(){}
	
	// getInstance()
	public static Counter getInstance() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	// count()
	public int countMethod() {
		count++;
		return count;
	}
	
}

// 단 하나의 객체를 보장하기 위한 패턴
// 상속 허용X
public class SingletonCounter {

	public static void main(String[] args) {
		
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		c1.countMethod();
		System.out.println(c1.countMethod());
		c2.countMethod();
		System.out.println(c2.countMethod());
	}

}

