package lotto;

import java.util.Scanner;

public class LottoManager implements LottoProgram {
	//당첨번호 List 배열 추가
	LottoE lotto[] = new LottoE[5]; //당첨번호 List
	Lotto user = new Lotto(); //사용자 번호
	int lCount = 0; //당첨번호 생성 개수
	
	//메뉴 출력 
	public void printMenu() {
		System.out.println("--menu--");
		System.out.println("1.로또 번호 생성(수동)");
		System.out.println("2.로또 번호 생성(자동)");
		System.out.println("3.로또 당첨 번호 생성");
		System.out.println("4.로또 당첨 확인");
		System.out.println("5.당첨번호 목록 확인(전체)");
		System.out.println("6.종료");
		System.out.println("-----------------------");
		System.out.println("메뉴를 선택하세요.");
	}
	
	@Override
	public void createLotto(Scanner scan) {
		System.out.println("로또번호를 입력.(중복X, 숫자6개, 1~45범위)");
		int[] tmp = new int[6]; //입력받을 임시 배열
		for(int i=0; i<tmp.length; i++) {
			tmp[i]= scan.nextInt();  //tmp배열에 로또번호 입력받기
		}
		//중복체크 후 insert
		if(isDuplicated(tmp)) {
			System.out.println("오류발생~!! 취소!!");
		}else {
			user.insertNumber(tmp);
			printString("로또번호:"+user);
		}	
	}
	
	//수동으로 입력한 배열안에 같은수가 포함되어있는지 체크 => isDuplicated(int []arr)
	public boolean isDuplicated(int []arr) {
		//중복확인
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		// 범위 넘어가는지 체크
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0 || arr[i]>45) {
				return true;
			}
		}
		return false;
	}
	
	public void printString(String str) {
		System.out.println("--------------");
		System.out.println(str);
	}
	@Override
	public void createLottoAuto() {
		// 오토생성 메서드 호출
		user.randomLotto();
		printString("로또번호 : "+user);
	}
	@Override
	public void insertLotto(Scanner scan) {
		//당첨번호 수동 입력
		System.out.println("당첨번호를 입력.(중복X, 숫자7개, 1~45범위, 보너스번호는 마지막)");
		int tmp[] = new int[7];
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = scan.nextInt();
		}
		//중복확인후 중복발생안되었을때 객체 생성후 insert 호출 
		if(isDuplicated(tmp)) {  //true 케이스 먼저 처리
			System.out.println("오류발생~!! 취소!!");
		}else {
			LottoE tmpLotto = new LottoE();
			tmpLotto.insertNumber(tmp);
			
			lotto[lCount] = tmpLotto;
			//lCount 증가 
			lCount++;
			//당첨번호 찍기
			printString("당첨번호 : "+tmpLotto);
		}	
	}
	//당첨번호 자동 생성 메서드 추가
	public void insertLottoAuto() {
		LottoE tmpLotto = new LottoE();
		tmpLotto.randomLotto(); //자동 로또 생성
		lotto[lCount] = tmpLotto;
		lCount++;
		printString("당첨번호 : "+tmpLotto);
	}
	
	
	@Override
	public void checkLotto() {
		// 당첨확인 메서드
		//사용자가 로또 번호를 입력하지 않았을 경우.(user가 없을 경우)
		if(user.isContain(0)) {
			printString("로또 번호를 입력해주세요.");
			return;
		}
		//당첨번호가 없을 경우
		if(lCount==0) {
			printString("당첨번호가 없습니다.");
			return;
		}
		
		//1.일치하는 개수 count 선언
		int cnt = 0;
		//2. 마지막에 저장된 당첨번호 객체를 가져옴.
		LottoE tmp  = lotto[lCount-1];
		//3. for 문으로 일치갯수 체크
		for(int i=0; i<user.getNumbers().length; i++) {
			//최신당첨번호의 i번지 값 1개를 num에 저장 
			int num = tmp.getNumbers()[i]; //6자리 넘버 (보너스 번호 제외)
			if(user.isContain(num)) {
				cnt++;
			}
		}
		//4. 랭킹 확인 sysout으로 바로 당첨 찍기
		int rank=-1;
		switch(cnt) {
		case 6: rank =1; break;
		case 5:
			if(user.isContain(tmp.getBonus())) {
				rank = 2;
			}else {
				rank = 3;
			}
			break;
		case 4: rank =4; break;
		case 3: rank =5; break;
		
		}
		//5.if이용하여 등수 출력
		if(rank !=-1) {
			System.out.println(rank+"등 당첨~!!");
		}else {
			System.out.println("꽝~!!");
		}
	}
	@Override
	public void printLotto() {
		// 전체 당첨번호 리스트 출력
		//for문 이용해서 lotto배열을 출력
		System.out.println("▷▷▷▷▷▷▷▷▷▷▷▷▷▷▷▷");
		System.out.println("--역대 당첨 번호 리스트--");
		for(int i=0; i<lCount; i++) {
			System.out.println((i+1)+"회차 당첨번호 : "+lotto[i]);
		}
		
	}
	
}
