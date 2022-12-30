package day11;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx01 {

	public static void main(String[] args) {
		// ArrayList를 만들고 1~10까지 저장한 후 출력
		// 출력구문 향상된for로 출력 / Iterator로 출력
		ArrayList<String> list = new ArrayList<>();
		//list.add(10);
		list.add("abc");
		System.out.println(list);
		list.add(0,"aaa");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list2.add(i);
		}
		for(Integer tmp: list2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		Iterator it = list2.iterator();
		while(it.hasNext()) {
			Integer tmp = (Integer)it.next();
			System.out.print(tmp+" ");
		}
		
		String[] arr1 = new String[] {"a","b","c"};
		ArrayList<String> list3 = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) {
			list3.add(arr1[i]);
		}
		System.out.println();
		System.out.println(list3);
	}

}
