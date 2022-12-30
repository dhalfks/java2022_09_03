package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BankApp {
	/* 은행업무 프로그램
	 * 값을 입력받을 때 Scanner는 제외
	 * 클래스작업 - 계좌정보 : 계좌번호, 소유주, 잔고 
	 * 메뉴 : 1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
	 * 1. 계좌번호는 자동 생성 "Bank-0001"
	 * 2. 계좌는 여러개 생성 가능.
	 * 3. 하나의 계좌에 대해 입금/출금이 가능
	 * 4. 입금/출금이 이루어지면 잔액이 변경
	 * 5. 잔액이 부족하면 출금시 잔액부족 출력 
	 * 6. 생성되지 않은 계좌에 대한 입/출금 X
	 * 
	 * String tmp = "Bank-"+String.format(new 
	 * DecimalFormat("0000").format(증가변수));
	 * */
	private static ArrayList<Account> accountList = new ArrayList<>();
	private static BufferedReader br = new BufferedReader(new 
			InputStreamReader(System.in));
	//br.readLine(); // => String값으로 받기
	private static final String PREFIX = "Bank-";
	private static int seq = 0; //계좌번호 자동 발급을 위한 시퀀스
	private static boolean isCreate = false; //계좌등록여부 확인
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int menu = -1;
		//메뉴 반복
		do {
			//메뉴 출력
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.println("menu>>");
			//메뉴 입력받아 숫자로 변환 후 메뉴에 저장
			menu = Integer.parseInt(br.readLine());
			switch(menu) {
			//계좌생성
			case 1: createAccount(); break;
			//계좌목록
			case 2: accountList(); break;
			//예금
			case 3: deposit(); break;
			//출금
			case 4: withdraw(); break;
			case 5: break;
			default:
				System.out.println("error!!");
			}
		}while(menu!=5);
		System.out.println("프로그램 종료!!");
	}

	private static void withdraw() throws IOException {
		// 출금 메서드
		//계좌가 없으면 출력할 값이 없음.
		if(!isCreate) { //계좌생성의 변수 값이 false라면...
			System.out.println("계좌등록이 되지 않았습니다.");
			return;
		}
		//계좌번호 출력
		accountList();
		System.out.println("출금 계좌번호 선택 >>");
		Account account;
		while(true) {
			String ano = br.readLine(); //출금 계좌번호 입력받기
			account = findAccount(ano);
			if(account == null) {
				System.out.println("계좌를 확인해주세요~!!  다시입력>>");
			}else {
				break;
			}
		}
		//계좌 확인 후 출금처리
		System.out.println("출금할 금액 입력 >>");
		int amount = Integer.parseInt(br.readLine());
		int result = account.withdraw(amount); 
		if(result == -1) {
			return;
		}
		System.out.println("잔액 :"+ result);
		System.out.println("출금성공~!!");
	}

	private static void deposit() throws IOException {
		// 입금 메서드
		//계좌가 없으면 출력할 값이 없음.
		if(!isCreate) { //계좌생성의 변수 값이 false라면...
			System.out.println("계좌등록이 되지 않았습니다.");
			return;
		}
		//계좌번호의 리스트 출력
		accountList();
		Account account; //계좌정보를 담을수 있는 변수생성
		System.out.println("입금 계좌번호 선택 >>");
		while(true) {
			String ano = br.readLine(); //입금계좌번호 입력
			account = findAccount(ano);
			if(account == null) {
				System.out.println("계좌번호를 확인하세요!! 다시입력>");
			}else {
				break;
			}
		}
		//계좌를 찾고 난 후 입금처리 부분
		System.out.println("입금금액 입력 >>");
		int amount = Integer.parseInt(br.readLine());
		account.deposit(amount); //입금
		int res = account.getBalance(); //잔액
		System.out.println("잔액 : "+res);
		System.out.println("예금성공~!!");
	}
	
	//찾는 계좌번호가 맞는 확인한 후 맞는 계좌의 객체를 반환
	//리턴 : 계좌정보, 매개변수 : 내가 입력한 계좌번호
	private static Account findAccount(String ano) {
		Account account=null;
		for(int i=0; i<accountList.size(); i++) {
			if(accountList!=null) { //계좌리스트에 계좌가 있다면 하단 실행문을 실행
				String anoNum = accountList.get(i).getAno();
				String num = anoNum.substring(anoNum.indexOf("-")+1); //0000만 추출
				//계좌번호를 전체 입력해서 값을 비교
				if(accountList.get(i).getAno().equals(ano)) {
					account = accountList.get(i);
				}
			}
		}
		
		return account;
	}
	
	
	private static void accountList() {
		// 계좌 리스트 출력
		//계좌가 없으면 출력할 값이 없음.
		if(!isCreate) { //계좌생성의 변수 값이 false라면...
			//(조건)이 true라면 하단 실행문을 실행
			System.out.println("계좌등록이 되지 않았습니다.");
			return;
		}
		for(Account tmp : accountList) {
			System.out.println(tmp); //클래스의 toString 호출
		}
		
		
	}

	private static void createAccount() throws IOException {
		// 계좌 생성 Bank-0001, 홍길동, 100000
		//String tmp = "Bank-"+String.format(new 
		//		 DecimalFormat("0000").format(증가변수));
		String ano = PREFIX+String.format(
				new DecimalFormat("0000").format(++seq)); //++seq : 증가 후 담기
		System.out.println("소유주명 >");
		String owner = br.readLine();
		System.out.println("입금액 > ");
		int amount = Integer.parseInt(br.readLine()); //초기입금액
		accountList.add(new Account(ano, owner, amount)); //객체 생성 후 리스트에 추가
		System.out.println("계좌등록 성공~!!");
		isCreate= true;
	}
	
	
	

}
