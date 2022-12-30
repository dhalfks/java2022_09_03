package day14;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		Runnable beep = new BeepPrintThread01();
		Thread th = new Thread(beep);
		
		th.start();
		
		//나중 진행
		for(int i=0; i<10; i++) {
			System.out.println(i+" print");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
