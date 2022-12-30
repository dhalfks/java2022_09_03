package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 두개 저장, key값과 value값으로 저장
		 * - key는 중복불가, value는 중복가능
		 * - 아이디/패스워드 처럼 같이 묶어서 저장해야 할 때 사용
		 * HashMap<key,value> map = new HashMap<key,value>()
		 * Map은 Map자체로 Iterator를 사용할 수 없음. 
		 * Map => set으로 바꾸어서 사용
		 * list, set => .add 
		 * map => .put / getKey() getValue()
		 * */
		//아이디 / 패스워드 형태로 저장
		HashMap<String, Integer> map = new HashMap<>();
		map.put("햄버거", 15000);
		map.put("피자", 20000);
//		map.put("aaa111", "abc111");
//		map.put("1111111", "abc");
		System.out.println(map);
		System.out.println("--------");
		System.out.println(map.keySet());
		System.out.println(map.get("피자"));

		
		//Map => Set : entrySet(k,v), keySet(k)
//		Set<Map.Entry<String,String>> set = map.entrySet();
//		Iterator<Map.Entry<String, String>> it = set.iterator();
//		while(it.hasNext()) {
//			Map.Entry<String, String> tmp = it.next();
//			System.out.println("ID:"+tmp.getKey()+", password:"+tmp.getValue());
//		}
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key+":"+map.get(key));
		}
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp+ ":" + map.get(tmp));
			//System.out.println(map.get(tmp));
			
		}
		
		for(Map.Entry<String, Integer>tmp : map.entrySet()) {
			System.out.println(tmp.getKey() +":"+ tmp.getValue());
		}
	}

}
