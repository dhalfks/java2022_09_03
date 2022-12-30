package day09;

import java.util.StringTokenizer;



public class StringTokenizerEx {

	public static void main(String[] args) {
		String str = "100,200,300,400,500";
		//StringTokenizer(문자열, 구분자 ,true/false); true/false(구분자 포함여부)
		//split(구분자) 문자열분리 배열로 반환
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
			System.out.println(st.countTokens()); //남은 토큰수 반환
		}
		
		String[] num = str.split(","); //배열로 반환
		for(String tmp:num) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("--------");
		String exp = "x=100*(10-a)/3*2";
		StringTokenizer st2 = new StringTokenizer(exp,"x=*(-)/",false);
		while(st2.hasMoreTokens()) {
			System.out.print(st2.nextToken()+" ");
		}
		System.out.println();
		String[] num1 = exp.split("=|/"); //배열로 반환
		for(String tmp:num1) {
			System.out.println(tmp+" ");
		}
	}

}
