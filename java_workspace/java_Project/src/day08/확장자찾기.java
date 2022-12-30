package day08;

import java.util.Scanner;

public class 확장자찾기 {

	public static void main(String[] args) {
		/* 5개 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일명 중 이미지 파일을 검색하여 출력하는 코드를 작성
		 * 이미지 형식 파일 (jpg, png, gif, jpeg)
		 * */
		Scanner scan = new Scanner(System.in);
		String[] fileName = new String[5];
		System.out.println("파일명 5개를 입력해주세요.");
//		String[] fileName = {"java.txt","String.jpg","Method.png",
//				"String.pdf","python.gif"}; // 연습용
		for(int i=0; i<fileName.length; i++) {
			fileName[i] = scan.next();
		}
		String[] img= {"jpg","png","gif","jpeg"};
		
		for(String tmpFile: fileName) {
			String search = tmpFile.substring(tmpFile.indexOf(".")+1);
			if(isContain(img, search)) {
				System.out.println(tmpFile);
			}
		}

	}
	/* 기능 : 배열에서 찾는 문자열이 있는지 없는지 확인해서 알려주는 메서드
	 * 매개변수 : 배열, 찾는 값
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 * */
	public static boolean isContain(String[]arr, String search) {
		if(arr==null || arr.length==0) { //배열이 없는 경우.
			return false;
		}
		if(search == null) { //검색어가 없는 경우
			return false;
		}
		//향상된 for문
		for(String tmp : arr) { //arr의 값을 순차적으로 tmp에 담기
			if(tmp.equals(search)) { //tmp=> img배열, search => 파일의 확장자 
				return true;
			}
		}
		return false;//true 반환이 없다면 마지막에 for 다 돌고 false반환
	}

}
