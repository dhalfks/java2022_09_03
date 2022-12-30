package day14;

public class ThreadMain01 {

	public static void main(String[] args) {
		Thread01 t1 = new Thread01();
		
		Runnable t2 = new Thread02();
		Thread t3 = new Thread(t2);
		//t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t3.start();
		try {
			t1.join();
			//t3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main종료");
	}

}
