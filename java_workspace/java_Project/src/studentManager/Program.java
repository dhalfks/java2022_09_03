package studentManager;

import java.util.Scanner;

public interface Program {
	/* 1. program interface
	 * 학생리스트 출력
	 * 학생등록
	 * 학생검색
	 * 수강신청
	 * 수강철회
	 * */
	
	void printStudent();
	void insertStudent(Scanner scan);
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
	
}
