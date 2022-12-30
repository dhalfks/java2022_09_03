package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)  {
		/* 단어장 프로그램 작성
		 * 1.단어등록
		 * 2.단어검색
		 * 3.단어수정
		 * 4.단어출력
		 * 5.종료
		 * 파일로 저장하는 메뉴 추가 
		 * 파일명은 word.txt
		 * apple : 사과
		 * cat : 고양이
		 * */
		//단어장
		ArrayList<Word> list = new ArrayList<>();
		
		Word w = new Word("apple","11");
		Word w1 = new Word("dog","22");
		Word w2 = new Word("cat","33");
		Word w3 = new Word("apple","44");

		list.add(w);
		list.add(w1);
		list.add(w2);
		list.add(w3);
//		System.out.println("---------");
//		for(Word tmp : list)
//			System.out.println(tmp);
//		Word s = new Word("apple",null);
//		if(list.get(0).equals(s)) {
//			
//			System.out.println("검색완료");
//		}else {
//			System.out.println("X");
//		}
//		list.remove(s);
//		System.out.println("---------");
//		for(Word tmp : list)
//			System.out.println(tmp);
//		System.out.println("--------");
//		Collections.sort(list);
//		for(Word tmp : list)
//			System.out.println(tmp);
		
		
		int menu = -1;
		do {
			printMenu();
			menu = scan.nextInt();
			try {
				switch(menu) {
				case 1: insertWord(list); break;
				case 2: searchWord(list); break;
				case 3: 
					if(modifyWord(list)) {
						System.out.println("수정성공~!!");
					}
					break;
				case 4: printWord(list); break;
				case 5: fileWriter(list); break;
				case 6: break;
				default:
					System.out.println("잘못된 메뉴~!");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}while(menu!=6);
		System.out.println("프로그램 종료");
	}
	
	private static void fileWriter(ArrayList<Word> list) throws IOException {
		Writer fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		StringBuffer sb = new StringBuffer();
		int cnt=0; //i 변수와 같은 의미
		String data = "";
		while(cnt < list.size()) {
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); //줄바꿈
			data = sb.toString();
			cnt++;
		}
		System.out.println(data); //찍어보는 용
		fs.write(data);
		fs.close();
		
	}
	//메뉴출력
	public static void printMenu() {
		System.out.println(">>단어장 프로그램 작성");
		System.out.println("1.단어등록");
		System.out.println("2.단어검색");
		System.out.println("3.단어수정");
		System.out.println("4.단어출력");
		System.out.println("5.파일저장");
		System.out.println("6.종료");
		System.out.println(">>menu : ");
	}
	
	//insertWord
	/* 단어를 단어장에 등록하는 기능
	 * 다른 메서드(main)에 있는 list를 (매개변수)로 가져와서 등록
	 * 리턴 : void
	 * */
	public static void insertWord(ArrayList<Word>list) {
		Word w = new Word(); //빈객체 생성
		System.out.println("단어입력:");
		//String word = scan.next();
		w.setWord(scan.next());
		System.out.println("뜻입력:");
		//String mean = scan.next();
		w.setMean(scan.next());
		list.add(w);
	}
	/* 기능 : 검색, 수정 단어를 입력받아 객체를 생성하고, 리턴하는 메서드
	 * 리턴 : Word
	 * 매개변수 : X
	 * 메서드명 : inputWord
	 * */
	public static Word inputWord() {
		System.out.println("검색단어:");
		String s = scan.next();
		Word w = new Word(s); //mean은 null을 갖는 객체 생성
		return w;
	}
	/* searchWord
	 * 단어장에서 단어를 검색하고, 콘솔에 출력메서드
	 * 리턴 : void
	 * 매개변수 : 단어장 ArrayList<Word>list
	 * */
	public static void searchWord(ArrayList<Word>list) {
		Word w = inputWord(); //검색을 위해 검색값 입력받고, 객체 생성
		for(Word tmp : list) {
			if(tmp.equals(w)) {  // ok:tmp.getWord().equals(w.getWord())
				System.out.println("검색결과");
				System.out.println(tmp);
 				return;
			}
		}
		System.out.println("검색 단어가 없습니다.");
	}
	
	/* modifyWord (수정)
	 * 단어장에서 단어를 검색하고, 검색된 단어를 삭제한 후 다른 단어와 뜻을 입력받아 추가
	 * 매개변수 : 단어장 ArrayList<Word>list
	 * 리턴타입 : boolean
	 * */
	public static boolean modifyWord(ArrayList<Word>list) {
		//검색해서 있으면 삭제(remove), 단어가 없으면 없다고 출력 종료
		Word w = inputWord();  //검색단어 입력 후 객체 생성
		boolean res =list.remove(w); //삭제
		if(!res) {
			System.out.println("검색단어가 없습니다.");
			return false;
		}
		
		//해당 값 추가
		insertWord(list);
		
		return true;
	}
	
	//printWord
	//매개변수 : 단어장 ArrayList<Word>list
	//리턴 : void
	public static void printWord(ArrayList<Word>list) {
		System.out.println(">>단어장");
		//정렬 후 출력
		Collections.sort(list);
		for(Word tmp : list) {
			System.out.println(tmp);
		}
	}
	

}
