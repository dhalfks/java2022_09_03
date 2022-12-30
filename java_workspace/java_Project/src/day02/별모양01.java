package day02;

public class 별모양01 {

	public static void main(String[] args) {
		/* 별찍기 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		for(int i=1; i<=5; i++) { //5줄
			for(int j=1; j<=5; j++) { //1줄의 별개수
				System.out.print("*");
			}
			System.out.println();// 1줄이 끝나고 줄바꿈  
		}
		System.out.println("----------");
		
		/* *	 i=1  j=1*
		 * **	 i=2  j=2**
		 * ***	 i=3  j=3***
		 * ****	 i=4  j=4****
		 * ***** i=5  j=5*****
		 * */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		/* *****	i=1	j=5***** 6-i=5
		 * ****		i=2 j=4****	 6-i=4
		 * ***		i=3 j=3***
		 * **		i=4 j=2**
		 * *		i=5 j=1*
		 * 
		 * */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------");
		
		/*     *  	i=1, 공백4, *1
		 *    **	i=2, 공백3, *2
		 *   ***	i=3, 공백2, *3
		 *  ****	i=4, 공백1, *4
		 * *****    i=5, 공백0, *5
		 * */
		for(int i=1; i<=5; i++) {
			//공백
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			//별
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		//if문을 활용한 방법
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) {  //j=4, j=3, j=2...
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
