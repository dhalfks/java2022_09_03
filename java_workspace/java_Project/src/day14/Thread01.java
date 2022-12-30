package day14;

public class Thread01 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println(i+"번째"+getName());
			//System.out.println();
		}
		try {
			//sleep : 일정시간동안 쓰레드를 멈추게 하는 메서드 
			//ms 1000분의 1초  
			Thread.sleep(500); //0.5초 이후 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
