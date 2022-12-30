package day04;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		// 가위바위보게임 만들기
		// 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위,1=바위,2=보)
		// 내가 가위바위보중 하나를 선택해서 입력 (가위, 바위, 보)
		// 승패무의 결과를 출력
		// 조건식 ? 참 : 거짓;
		// 조건식 ? 참 : 조건식? 참 : 거짓;
		
		System.out.println("가위,바위,보 게임 시작 > ");
		Scanner scan = new Scanner(System.in);
		int comNum = (int)(Math.random()*3); //0 1 2
		System.out.println("컴퓨터가 결정을 완료했습니다.");
		System.out.println("가위/바위/보 중 하나를 선택하세요 > ");
		String myChoice = scan.next();  //내 선택
		
		//컴퓨터에의 상태를 String으로 변환
		String comChoice = comNum == 0? "가위" : comNum == 1? "바위":"보";
		System.out.println("com선택 > "+comChoice);
		//비교
		if(comChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "이겼습니다." : "졌습니다.");
			}else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "이겼습니다." : "졌습니다.");
			}else { // 컴퓨터가 "보"를 냈을 때
				System.out.println(myChoice.equals("가위")? "이겼습니다." : "졌습니다.");
			}
		
		}
		System.out.println("게임종료!!");
	}

}
