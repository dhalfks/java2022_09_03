package day11;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		// HashSet을 구성하고, a,b,c,a,b,c 추가 후 출력
		//중복불가, 순서보장불가 => 정렬도 안됨. (list로 변경 후 정렬)
		Set<String> set = new HashSet<>();
		set.add(new String("a"));
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("b");
		set.add("c");
		System.out.println(set);
		System.out.println(set.size());
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(new Integer(20));
		System.out.println(set2);
	}

}
