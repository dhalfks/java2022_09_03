package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(스트림) :자료의 대상과 관계없이 동일한 연산을 수행할수 있도록 해주는 반복자
		 * - 한번 생성하면 재사용이 불가능
		 * - 자료대한 스트림을 생성하여 연산을 수행하면 스트림은 소모가됨.
		 * - 다른 연산을 수행하려면 스트림을 다시 생성해야 함.
		 * - 스트림 연산은 기존 자료를 변경하지 않음.
		 * - 중간연산 : filter : 조건에 맞는 요소 추출, map:키에 대한 값을 반환
		 * - 최종연산 : forEach(),sum()
		 * - Arrays.stream => 배열의 값을 이요한 스트림생성
		 * 
		 * */
		int[] arr = {1,2,3,4,5};
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		int sum = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(sum);
		System.out.println(count);
		System.out.println(avg.getAsDouble());
		System.out.println("--------");
		//성적배열 a에서 점수가 70점이상만 합계
		int []a = {20,55,89,79,98,94,95,60,67};
		int sum1 =0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>=70)
			sum1+=a[i];
		}
		System.out.println(sum1);
		System.out.println("-----------");
		int total = Arrays.stream(a).filter(b->b>=70).sum();
		System.out.println(total);
		
		//컬렉션에서 스트림 생성
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Stream<Integer> s = list.stream();
		s.forEach(System.out::println);
		//가변 매개변수
		Stream<Integer> s2 = Stream.of(10,20,30);
		s2.forEach(System.out::println);
		System.out.println("-------");
		//정수 스트림생성 지정한 범위의 연속된 값을 출력
		IntStream s3 = IntStream.rangeClosed(1, 5);
		s3.forEach(System.out::println);
	}

}

