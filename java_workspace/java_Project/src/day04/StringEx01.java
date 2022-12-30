package day04;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 검색하고자 하는 단어를 입력하면 
		 * 해당 단어를 포함하는 파일을 출력
		 * */
		String[] fileName = {"java의 정석.txt", "String메서드.jpg", "이것이java다.png",
				"이것이java다.jpg", "String의 정석.png"};
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어를 입력하세요.");
		String s = scan.next(); //단어를 입력받기
		int cnt=0;
		System.out.println("----검색값 : "+ s +" -----");
		//일반 for문
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].contains(s)) {
				System.out.println(fileName[i]);
			}
		}
		
		//향상된 for문
		for(String tmpFile : fileName ) {
			if(tmpFile.contains(s)) { //있다면 true
				cnt++;
				System.out.println(tmpFile);
			}
		}
		if(cnt==0) {
			System.out.println("검색값이 없습니다.");
		}
		
		
		scan.close();
	}

}
