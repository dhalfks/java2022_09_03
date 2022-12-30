package day10;

import java.util.*;



public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임웤 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열 대신 사용
		 * 
		 * List
		 * - 값을 하나씩 저장
		 * - 순서를 보장
		 * - 중복을 허용
		 * - 일반적으로 배열대신 가장 많이 사용
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장하지 않음
		 * - 중복 허용 X
		 * 
		 * Map
		 * - 값을 두개 저장, key/Value 값으로 저장
		 * - key는 중복 불가, value는 중복 가능
		 * - key가 중복되면 덮어쓰기 됨.
		 * - 아이디/패스워드 처럼 같이 묶어서 저장해야 할 때 사용
		 * 
		 * */
		/* collection에서는 어떤 데이터를 관리할지 클래스로 지정해야 한다. 
		 * 숫자 형식 => int(x) Integer(O), String(O)
		 * 클래스를 지정해주지 않으면 Object가 자동으로 들어간다.
		 * */
		//List사용방법
		
		//<클래스>안에는 반드시 클래스가 와야 함.
		//List list1 = new List(); //사용불가능
		List list1 = new ArrayList(); //모든 객체 저장 가능
		ArrayList list2 = new ArrayList(); //모든객체 저장 가능
		//문자열만 가능
		ArrayList<String> list3 = new ArrayList<String>();
		//정수형 숫자만 가능
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(1); //.add 요소를 추가
		list4.add(5);
		list4.add(2);
		System.out.println(list4);
		
		list3.add("가");
		list3.add("b");
		list3.add("c");
		System.out.println(list3);
		
		//1~10까지 list5에 저장하고 출력
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list5.add(i);
		}
		System.out.println(list5);
		
		for(int i=1; i<=10; i++) {
			list5.add(i);
		}
		System.out.println(list5);
		System.out.println(list5.size());
		list5.remove(0); //.remove(index) 삭제(index번지의 요소 삭제)
		System.out.println(list5);
		Integer integer = 10;
		list5.remove(integer); //.remove(object) 객체로 넣어주면 해당 값을 삭제
		System.out.println(list5);
		list5.remove(integer);
		System.out.println(list5);
		list5.set(0, 1); //.set(index, 값):index번지의 값을 (값)으로 변경
		System.out.println(list5);
		System.out.println(list5.get(0)); //.get(index):index번지의 값을 가져오기
		for(int i=0; i<list5.size(); i++) {
			System.out.print(list5.get(i)+" ");
		}
		System.out.println();
		for(int tmp : list5) {
			System.out.print(tmp +" ");
		}
		/* Iterator를 이용한 list 값 출력 (번지가 아닌 값을 이용해서 출력)
		 * list는 순서를 보장하기 때문에 get을 이용하여 원하는 번지에 값을 확인가능.
		 * set은 순서를 보장하지 않기 때문에 for문으로 접근할 수 없다.
		 * List : for, Iterator
		 * Set : Iterator
		 * */
		Collections.sort(list5);
		System.out.println();
		Iterator<Integer> it = list5.iterator();
		while(it.hasNext()) { //.hasNext() : 다음 요소에 값이 있다면
			Integer tmp = it.next(); //.next() : 다음 요소 가져오기
			System.out.print(tmp+" "); //출력
		}
		
		System.out.println();
		//indexOf(값) : 값의 위치를 반환, 값이 없으면 -1반환
		integer = 9;
		System.out.println(list5.indexOf(integer));
		
		/* sort(객체)
		 * - 객체 : Comparator인터페이스를 구현한 객체를 넣어야 함.
		 * - 비교(compare)메서드를 가진 객체를 이용하여 정렬
		 * */
		
//		list5.sort(new Comparator<Integer>() {
//		
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// o1-o2 : 오름차순,  o2-o1 : 내림차순
//				return o1 - o2; //오름차순 
//			}
//			
//		});
	}
	

}
