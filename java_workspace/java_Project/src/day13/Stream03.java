package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream03 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();	
		list.add(new Student("홍길동",90));
		list.add(new Student("강감찬",95));
		list.add(new Student("이순신",100));
		
		List<Student> list2 = Arrays.asList(
			new Student("신사임당",96),
			new Student("퀴리부인",80),
			new Student("세종대왕",100)
		);
	
		Stream<Student> s = list2.stream();
		s.forEach(a->{
			String name = a.getName();
			int score = a.getScore();
			System.out.println(name+":"+score);
		});

		Stream<Student> s1 = list.stream();
		int sum = s1.mapToInt(a->a.getScore()).sum();
		
		Stream<Student> s2 = list.stream();
		long cnt = s2.count();
		System.out.println(cnt+"명"+"합계: "+sum);
	}

}
