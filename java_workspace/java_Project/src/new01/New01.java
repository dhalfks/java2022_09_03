package new01;

public class New01 {

	public static void main(String[] args) {
		//홍길동의 주민등록번호는 881112-1234567이다.
		//출력형태 : 생년월일 : 881112 , 성별 : 남
		
		String pin = "881112-1234567";
		String birth = pin.substring(0, pin.indexOf("-"));
		System.out.print("생년월일 : "+birth+", ");
		char ch = pin.charAt(pin.indexOf("-")+1);
//		System.out.println(ch);
		if(ch == '1' || ch=='3') {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("성별 : 여자");
		}
	}

}
