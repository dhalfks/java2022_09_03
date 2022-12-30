package day04;

public class String02 {

	public static void main(String[] args) {
		/* String method */
		String str = "Hello World JAVA";
		
		//길이
		System.out.println("---length---");
		int len = str.length();
		System.out.println(len);
		
		System.out.println("--indexOf----");
		//indexOf
		System.out.println(str.indexOf('W')); //단일문자값 인덱스(char)
		System.out.println(str.indexOf("ll")); //일치하는 문자열의 시작 인덱스 반환
		System.out.println(str.indexOf('l', 5)); //지정한 위치부터 찾기
		
		System.out.println("---lastIndexOf---");
		System.out.println(str.lastIndexOf('l')); //뒤에서 부터 찾기
		System.out.println(str.lastIndexOf("World"));
		
		//CharAt(index) : 특정 인덱스의 값 반환 => char
		System.out.println("---CharAt---");
		System.out.println(str.charAt(0));
		
		//contains : 특정 값의 존재여부
		System.out.println("---contains---");
		System.out.println(str.contains("JAVA"));
		
		//equals : 특정값과 동일한지 확인 [문자열을 비교할 때는 반드시 equals로 비교!!]
		//String은 참조자료형이기 때문에 서로 다른 주소값을 가지고 있음. 
		// == 주소의 값만 비교를 하기 때문에 false를 반환
		System.out.println("---equals---");
		System.out.println(str.equals("Hello World JAVA"));
		System.out.println(str.equalsIgnoreCase("hello world java"));
		
		//대소문자 변환 toLowerCase(), toUpperCase()
		System.out.println("---LowerCaseUpperCase--");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println("ABC".toLowerCase());
		
		//비어있는 객체인지 판단 isEmpty()
		System.out.println("---isEmpty---");
		System.out.println(str.isEmpty());
		
		//문자값 대체 replace
		System.out.println(str.replace('o', '0'));
		
		//문자열 분리 후 배열 리턴 split
		System.out.println("---split---");
		String[] strArr = str.split(" "); // "" 한글자씩 자르기
		System.out.println(strArr[0]);
		
		//문자열 추출 substring
		System.out.println("---substring---");
		System.out.println(str.substring(6, 11)); //6번지부터 ~ 11번지 전까지
		System.out.println(str.substring(6)); //6번지부터 끝까지
		
		//양쪽 공백 제거 trim
		System.out.println(str.trim());
		
		//문자값 비교 compareTo
		//대상 값이 비교값보다 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		System.out.println("a".compareTo("b"));
		System.out.println("d".compareTo("a"));
		System.out.println("--------------");
		
		//문자 -> 숫자 , instanceof 자료형이 같은지 체크
		String str1 = "12345";
		int num = Integer.parseInt(str1);
		System.out.println(str1 instanceof String);
		System.out.println(num);
		
		// 숫자 -> 문자
		int num2 = 123456;
		String str2 = String.valueOf(num2);
		System.out.println(str2);
		
		
		
		
		
		
		
		
//		int a=str.indexOf('l');
//		do {
//			System.out.println(a);
//			a = str.indexOf('l', a+1);
//			a=a+1;
//		}while(a != -1);
		
		for(int i=0; i<str.length(); i++) {
			int b = str.indexOf('l',i);
			i = b;
			System.out.println("l의 위치"+b);
			if(b==-1) {
				break;
			}
			
		}
		
	}

}
