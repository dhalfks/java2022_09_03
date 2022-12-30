package day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ListEx02 {

	public static void main(String[] args) {
		/* 두 배열을 하나로 합치는 ArrayList를 구성
		 * arr1 = d,e,f;
		 * arr2 = a,b,c;
		 * list = d,e,f,a,b,c; =>출력
		 * list를 정렬
		 * list = a,b,c,d,e,f; => 출력
		 * Iterator 사용
		 * */
		String arr1[] = new String[] {"d","e","f"};
		String arr2[] = new String[] {"a","b","c"};
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<arr1.length; i++) {
			list.add(arr1[i]);	
		}
		for(int i=0; i<arr2.length; i++) {
			list.add(arr2[i]);	
		}
		System.out.println(list);
		
		//Collections.sort(list);
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
	}

}
