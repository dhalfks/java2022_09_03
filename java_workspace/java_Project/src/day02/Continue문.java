package day02;

public class Continue문 {

	public static void main(String[] args) {
		/* continue문 pass, skip개념
		 * */
		/* 1~10까지 출력 
		 * 5는 빼고 출력 1 2 3 4 6 7 8 9 10
		 * */
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue; //조건에 맞다면 건너뛰기
			}
			System.out.print(i+" ");
		}
		/* 1~10까지중 짝수만 출력 continue문을 이용하여 출력
		 * */
		System.out.println(); //줄바꿈
		System.out.println("-----------");
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
