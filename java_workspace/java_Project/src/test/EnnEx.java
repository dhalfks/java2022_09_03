package test;

public class EnnEx implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("Enn");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

	}

}
