package day01;

public class Switch01 {

	public static void main(String[] args) {
		/* switch(변수/식){
		 * case 값1: 
		 * 실행문1; 
		 * break;
		 * case 값2:
		 * 실행문2;
		 * break; 
		 * default:
		 * 실행문3;
		 * break;
		 * }
		 * */
		// (int) (Math.random()*개수)+시작;
		//1~3까지 랜덤수를 추출해서 값이 1인지, 2인지, 3인지 판별
		int random = (int)(Math.random()*3)+1;
		
		switch(random) {
		case 1:
			System.out.println("random수는 1입니다.");
			break;
		case 2:
			System.out.println("random수는 2입니다.");
			break;
		case 3:
			System.out.println("random수는 3입니다.");
			break;
			default:
				System.out.println("잘못된 수입니다.");
				break;
		}
		
		

	}

}
