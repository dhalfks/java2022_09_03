package studentManager;

import java.util.Scanner;

public class StudentManager implements Program {
	private Student[] std = new Student[10];
	private int stdCount; //등록한 학생 카운트
	
	@Override
	public void printStudent() {
		// 등록한 모든 학생들을 출력하는 메서드
		for(int i=0; i<stdCount; i++) {
			printStudentOne(std[i]);
		}
		
	}
	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 학생정보 값을 입력받아 객체생성한 후 객체배열에 저장
		System.out.println("--학생정보입력--");
		System.out.println("이름:");
		String name = scan.next();
		System.out.println("주민번호:");
		String rNum = scan.next();
		System.out.println("학번:");
		String sNum = scan.next();
		System.out.println("학부:");
		String faculty = scan.next();
		System.out.println("학과:");
		String major = scan.next();
		System.out.println("-------------");
		//입력받은 값으로 객체를 생성
		Student s = new Student(sNum, name, rNum, faculty, major);
		
		//배열이 다 찼다면 더 큰배열을 생성 후 배열복사
		if(stdCount == std.length) {
			Student[] tmp = new Student[std.length+5]; //새배열
			System.arraycopy(std, 0, tmp, 0, std.length);
			std = tmp;
		}
		// 1명의 객체를 배열에 추가
		std[stdCount] = s;
		stdCount++;
	}
	@Override
	public void searchStudent(Scanner scan) {
		// 입력받은 학생명으로 std 검색
		// 검색어를 입력받기~!!
		System.out.println("--검색할 이름 입력--");
		String tmpName = scan.next();
		//전체배열탐색
		for(int i=0; i<stdCount; i++) {
			//std[i].getName().equals(tmpName) 같은 의미
			if(tmpName.equals(std[i].getName())) {
				//한사람의 정보를 출력
				printStudentOne(std[i]);
			}
		}
	}
	@Override
	public void registerSubject(Scanner scan) {
		// 수강신청하고자 하는 학생이름 체크
		//학생의 위치를 알려주는 index변수
		int index = -1;
		//학번을 입력받아 수강신청자 체크
		System.out.println("수강신청할 학번 입력:");
		String sNum = scan.next();
		//그 학번이 어디에 있는지 체크 (index번지에 검색학생 위치 확보)
		for(int i=0; i<stdCount; i++) {
			if(sNum.equals(std[i].getStudentNum())) {
				index=i;
				break;
			}
		}
		
		//만약 학번을 못찾았다면...
		if(index==-1) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		
		//과목명을 입력받아 과목 객체 생성 insertSubject 메서드 호출
		System.out.println("--과목명 : ");
		String sTitle = scan.next();
		//과목객체 생성
		Subject sb = new Subject(sTitle);
//		Subject sb1 = new Subject(); //생성자 없을 때 
//		sb1.setSubName(sTitle);
		std[index].insertSubject(sb); //Student에서 insertSubject메서드 호출
		
	}
	@Override
	public void deleteSubject(Scanner scan) {
		// registerSubject와 같음. 
		int index = -1;
		System.out.println("수강철회할 학번 입력:");
		String sNum = scan.next();
		
		for(int i=0; i<stdCount; i++) {
			if(sNum.equals(std[i].getStudentNum())) {
				index = i;
				break;
			}
		}
		//못찾았다면
		if(index == -1) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		System.out.println("--과목명:");
		String sTitle = scan.next();
		std[index].deleteSubject(sTitle);	
	}
	/* 수강관리프로그램 - main
	 * --메뉴--
	 * 1.학생등록
	 * 2.학생확인(학생리스트)
	 * 3.학생검색
	 * 4.수강신청
	 * 5.수강철회
	 * 6.종료
	 * */
	public void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1.학생등록");
		System.out.println("2.학생확인(리스트)");
		System.out.println("3.학생검색");
		System.out.println("4.수강신청");
		System.out.println("5.수강철회");
		System.out.println("6.종료");
		System.out.println("---------------");
		System.out.println("메뉴를 선택해주세요.");
	}
	//한명의 학생을 출력할 수 있는 메서드
	public void printStudentOne(Student s) {
		System.out.println("--학생정보--");
		s.stdPrint(); //학생정보 출력메서드
		//System.out.println(s); //toString출력
		System.out.println("--수강정보--");
		s.print();//수강정보 출력메서드
	}
	//잘못입력된메뉴일 때
	public void printAlert() {
		System.out.println("메뉴를 잘못입력했습니다.");
	}
	
	//프로그램 종료
	public void printExit() {
		System.out.println("프로그램 종료~!!");
	}
	
}
