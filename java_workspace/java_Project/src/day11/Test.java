package day11;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력:");
		int num = scan.nextInt();
		
		while(num!=0) {
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("입력2:");
			int num2 = scan1.nextInt();
			System.out.println(num2);
			scan1.close();
		}
		
		System.out.println(num);
		
		scan.close();
		
	}

}
