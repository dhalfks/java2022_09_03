package day02;

public class 알파벳 {

	public static void main(String[] args) {
		//char : 유니코드표에 따라 글자에 코드가 매겨져 있음.
		 char ch = 'B';
		 System.out.println((int)ch);
		 //A~Z 반복문을 활용하여 표시
		 System.out.println("-----");
		 for(char ch1='a'; ch1<='z'; ch1++) {
			 //유니코드 표에 따라 값을 비교할 수 있기 때문
			 System.out.print(ch1+" ");
		 }
		 
		 /* a			i줄 a~z j=i
		  * ab
		  * abc
		  * abcd
		  * abcde
		  * a..........z
		  * */
		 System.out.println();
		 System.out.println("-------");
		 for(char i='a'; i<='z'; i++) { //줄개수 a~z개까지 출력
			 for(char j='a'; j<=i; j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 System.out.println();
		 System.out.println("--------");
		 char a=96;
		 for(int i=1; i<=26; i++) { //줄번호
			 for(int j=1; j<=i; j++) { //반복횟수
				 a++; //97번 ='a'  //count 값
				 System.out.print(a);
			 }
			 a=96;
			 System.out.println();
		 }
	}

}
