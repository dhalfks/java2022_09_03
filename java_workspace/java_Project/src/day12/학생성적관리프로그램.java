package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 학생성적관리프로그램 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* map을 이용(멤버변수로 선언, 메인에서 map 객체-매개변수..)
		 * 한 학생의 성적을 관리하는 프로그램 작성
		 * scanner는 멤버변수로 선언하고, 메서드에서 사용.
		 * >>menu
		 * 1.성적추가  => insert(map) - scan필요
		 * 2.성적조회(전체출력) => print(map)
		 * 3.성적조회(과목) - 과목 서치 후 출력 => printSub(map) - Scan
		 * 4.성적수정 => modify(map) - scan
		 * 5.종료
		 * 출력예시
		 * 국어:100
		 * 
		 * 전체 조회시에만 합계/평균 같이 출력
		 * */
		HashMap<String, Integer> map = new HashMap<>();	
		int menu = -1;
		do {
			printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: insert(map); break;
			case 2: print(map); break;
			case 3: printSub(map); break;
			case 4: modify(map); break;
			case 5:  break;
			default:
				System.out.println("잘못된 메뉴~!!");
			}
		}while(menu != 5);
		System.out.println("프로그램 종료~!!");
	}
	
	public static void printMenu() {
		System.out.println(">>menu");
		System.out.println("1.성적추가");
		System.out.println("2.성적조회(전체출력)");
		System.out.println("3.성적조회(과목)");
		System.out.println("4.성적수정");
		System.out.println("5.종료");
		System.out.println(">>menu : ");
	}
	//성적 추가 => insert(map)
	//리턴 : void
	public static void insert(HashMap<String, Integer> map) {
		//1. 과목과 성적 입력받기 (성적이 0~100범위를 벗어난다면 다시 입력
		System.out.println("과목과 성적을 입력해주새요(ex: 국어 90) :");
		String subject = scan.next(); //공백을 포함하지 않음. nextLine() :공백포함
		int score = scan.nextInt(); 
		
		if(score < 0 || score >100) {
			System.out.println("잘못된 점수입니다.");
			return; //메서드를 빠져나가는 구문 //break; (반복문을 빠져나가는 구문)
		}
		//2. map에 추가(과목이 존재한다면 추가불가, 없다면 추가)
		if(map.get(subject)==null) {
			map.put(subject, score);
		}else {
			System.out.println(subject+"는 이미 존재하는 과목입니다.");
		}
	}
	
	//print(map) => 전체과목 프린트
	public static void print(HashMap<String, Integer>map) {
		int sum=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			sum+= map.get(key);
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("합계: "+sum);
		System.out.printf("평균: %.2f\n",(double)sum/map.size());
		
	}
	
	//성적조회(과목) - 과목 서치 후 출력 => printSub(map)
	public static void printSub(HashMap<String, Integer>map) {
		//1.과목을 입력받기
		System.out.println("조회할 과목을 입력해주세요");
		String subject = scan.next(); 
		//2. 해당 과목의 성적을 가져옴.
		Integer score = map.get(subject);  //subject의 value
		
		//3. 해당과목이 없다면 없다고출력
		if(score == null) {
			System.out.println(subject+"는 없는 과목입니다.");
		}else {
			System.out.println(subject+":"+score);
		}
	}
	
	//성적수정 => modify(map)
	//과목과 성적을 입력받아, 
	public static void modify(HashMap<String,Integer>map) {
		//1. 과목과 성적 입력받기 (성적이 0~100범위를 벗어난다면 다시 입력
		System.out.println("과목과 성적을 입력해주세요(ex: 국어 90) :");
		String subject = scan.next(); //공백을 포함하지 않음. nextLine() :공백포함
		int score = scan.nextInt(); 
		
		if(score < 0 || score >100) {
			System.out.println("잘못된 점수입니다.");
			return; //메서드를 빠져나가는 구문 //break; (반복문을 빠져나가는 구문)
		}
		//2. map에 추가(과목이 존재한다면 추가, 없다면 추가불가)
		if(map.get(subject)==null) {
			System.out.println(subject+"는 없는 과목입니다.");
		}else {
			map.put(subject, score);
			System.out.println(subject+"성적이"+score+"로 변경되었습니다.");
		}
	}
	
	
	
	
	
	
	
	
	

}
