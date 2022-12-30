package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class 숙제 {

	public static void main(String[] args) {
		int[] data = {5,6,4,2,3,1,1,2,2,4,4,6,6,7};
		//중복을 제거하고 출력     옵션 => (내림차순으로 출력)
		//스트림사용, 스트림 안쓰고 방법을 찾아보시오. 
		
		HashSet<Integer> dataSet = new HashSet<>();
		for(int i=0; i<data.length; i++) {
			if(data[i] %2 == 0)  //짝수만 저장
			dataSet.add(data[i]);
		}
		System.out.println(dataSet);
		//Set은 정렬되지 않음. => List로 변경 후 정렬 => array로 변환
 		ArrayList<Integer> list = new ArrayList<>(dataSet);
 		//Comparator.naturalOrder() : 오름차순
 		list.sort(Comparator.reverseOrder()); //Comparator.reverseOrder() : 내림차순
 		System.out.println(list);
 		
 		//Integer 리스트를 정수 배열로 변환
 		int[] result = new int[list.size()];
 		for(int i=0; i<list.size(); i++) {
 			result[i] = list.get(i);
 			System.out.print(result[i]+" ");
 		}
 		
 		System.out.println();
 		System.out.println("--------");
 		
 		//역순정렬 (내림차순 정렬) sorted
		int[] resultStream = Arrays.stream(data) //IntStream 생성
				.filter(a->a % 2 ==0) //짝수만 추출
				.distinct() //중복제거
				.boxed() //IntStream => Stream<Integer>로 변경
				.sorted(Comparator.reverseOrder()) //내림차순 정렬
//				.toArray();
				.mapToInt(Integer::intValue) //Stream<Integer> => IntStream 변경
				.toArray(); //int[]로 변환
		for(int tmp : resultStream) {
			System.out.print(tmp+" ");
		}
 		
	}

}
