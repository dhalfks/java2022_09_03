package new02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Array01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크
		 * - List : 순서보장, 중복가능
		 * - Set : 순서보장X, 중복불가능
		 * - Map : 2가지 데이터를 쌍으로 저장, 순서보장X
		 *   - key(중복불가능), value(중복가능)
		 */
		
		// 리스트를 생성하고, 1부터 10까지 등록한 후 출력
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list);
		for(Integer tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// 정수를 입력받아서 입력받은 정수만큼 오늘의 할일을 입력하고 출력
		//기존 리스트를 비우고, 입력받기
		/*Scanner scan = new Scanner(System.in);
		list.clear();
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt(); //리스트 반복하기 위한 정수
		
		ArrayList<String> list2 = new ArrayList<String>();
		while(list2.size() < num) {
			System.out.println("할일 입력 >> ");
			String str = scan.next(); //할일입력
			list2.add(str);
		}
		
		for(String tmp : list2) {
			System.out.println(tmp);
		} */
		
	 	/*map을 이용하여 이름 : 점수 형태로 입력  3명만 입력.
		해당 값을 출력*/
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("영이", 89);
		map.put("순이", 56);
		map.put("영철", 78);
		
		System.out.println(map);
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) { //boolean
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		System.out.println("----------------");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
		
	}

}
