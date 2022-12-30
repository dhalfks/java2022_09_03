package day09;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx01 {

	public static void main(String[] args) {
		/* \d :숫자, * : 전체, [a-zA-Z] : 영문자 1글자
		 * (02|010)-\d{3,4}-\d{4} => 010-1234-1234
		 * */
		String[] strArr= {"bat","baby","ca","cb","coffee","car","date",
				"disc", "count","banana"};
		Arrays.sort(strArr); 
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		System.out.println("--------------");
		
		Pattern pattern = Pattern.compile("b[a-zA-Z]*");
		for(String str : strArr) {
			Matcher matcher = pattern.matcher(str);
			if(matcher.matches()) { //패턴일치가 되면 true
				System.out.print(str+" ");
			}
		}

	}

}
