package test;

import java.awt.*;

public class BeepPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit t = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			t.beep();
			System.out.println("Enn");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
//		Runnable e = new EnnEx();
//		Thread t = new Thread(e);
//		t.start();
				
				
		for(int i=0; i<5; i++) {
			System.out.println("삐");
			try {
				Thread.sleep(500);
			} catch (Exception e1) {
				// TODO: handle exception
			}
		}
	}

}
