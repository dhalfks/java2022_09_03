package new02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 출력
		HashMap<String, String> map;
		map = make();  //메서드 결과를 map에 담기
		System.out.println(map);
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();  //key
			String mean = map.get(word); //value
			System.out.println("단어:"+word+", 의미:"+mean);
		}

	}
	//단어:의미를 입력받아서 map으로 구성
	//리턴 : map
	//매개변수 :X
	public static HashMap<String, String> make(){
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("입력받을 단어의 개수:");
		int size = scan.nextInt();
		
		while(map.size()<size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			String mean = scan.next();
			map.put(word, mean);
		}
		return map;
	}
}
