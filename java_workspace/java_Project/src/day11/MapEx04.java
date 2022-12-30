package day11;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx04 {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static void main(String[] args) {
//		HashMap<String, Integer> map; //1.메서드 객체
//		map = make1();
//		HashMap<String, Integer> map = new HashMap<String, Integer>();//2.
//		make2(map);
		make3(); //3.메서드
		//4. 출력
		int sum=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next(); // key반환
			Integer value = map.get(key); //value반환
			sum+=value;
			System.out.println(key+":"+value);
		}
		System.out.println("합계:"+sum);
		System.out.println("------------");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
	}
	
	/* map에 상품 이름과 값을 추가
	 * map.put("가위",2500)
	 * map.put("크레파스",5000)
	 * ...
	 * 1. 해당 맵을 만들어서 리턴 => main에서 받아서 출력 (합계도 같이)
	 * */
	public static HashMap<String, Integer> make1(){
		HashMap<String, Integer> map = new HashMap<>();
		map.put("가위",2500);
		map.put("크레파스",5000);
		return map;
	}
	
	/* 2. 메인에서 map을 생성 매개변수로 맵을 받아와서
	 * 상품이름과 값을 추가
	 * */
	public static void make2(HashMap<String, Integer> map) {
		map.put("가위2",2500);
		map.put("크레파스2",5000);
	}
	 
	/* 3. 멤버변수에 map을 추가
	 * */
	public static void make3() {
		map.put("가위3",2500);
		map.put("크레파스3",5000);
	}
}
