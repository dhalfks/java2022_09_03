package day09;

import java.util.Random;

public class RamdomEx01 {

	public static void main(String[] args) {
		Math.random(); // 0<= x >1
		/* random클래스는 시스템의 현재 시간을 seed값으로 사용하여 객체를 생성 랜덤수를 생성.
		 * nextInt(6)+1  //1~6까지의 수를 생성
		 * */
		Random r = new Random(); //seed값이 필요.
		int r1 = r.nextInt(6)+1; //1~6까지
		System.out.println(r1);
		
		int random[] = new int[5];
		for(int i=0; i<random.length; i++) {
			random[i] = r.nextInt(6)+1;
			System.out.print(random[i]+" ");
		}

	}

}
