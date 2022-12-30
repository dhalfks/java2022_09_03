package day13;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬) .sorted().toArray()
		 * 중복되는 값 삭제 distinct()
		 * */
		int []arr = {5,6,1,7,9,8,4,6,3,2,2,1,7};
		
		int[]res = Arrays.stream(arr).filter(a->a%2==0).distinct()
				.sorted().toArray();
		
		for(int tmp : res) {
			System.out.println(tmp);
		}
	}

}
