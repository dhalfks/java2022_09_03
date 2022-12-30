package day14;

public class PriorityEx01 {

	public static void main(String[] args) {
		// 스레드 우선 순위는 스레드가 실행되는 순서를 
		// 스레드의 우선순위가 높은 스레드가 실행상태를 더 많이 가져감.
		// 무조건 보장할 수 없음(Java Thread Scheduler 마음)
		// 고려O, 무조건 보장X
		
		for(int i=1; i<=10; i++) {
			Thread th = new Thread03("MyThread"+i);
//			if(i!=10) {
//				th.setPriority(Thread.MIN_PRIORITY);
//			}else {
//				th.setPriority(Thread.MAX_PRIORITY);
//			}
			th.start();
			try {
				th.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			//System.out.println(th.getPriority()+" " + th.getName());
		}
		System.out.println("main종료");
	}

}
