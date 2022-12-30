package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class MapEx03 {
	
	static HashMap<String, String> map = new HashMap<String, String>();
	public static void main(String[] args) {
		/* 단어장  단어:의미 => hello:안녕
		 * 5 => 5개의 단어를 입력
		 * */
		//메서드에서 호출 후 맵을 리턴받아 출력
		//메인에서 map을 매개변수로 받아 값을 put
		//HashMap<String, String> map;
		make();
		
		//4. 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next(); // key반환
			String mean = map.get(word); //value반환
			System.out.println("단어:"+word+", 의미:"+mean);
		}
		
		

	}
	/* 기능 : 단어:의미 값을 입력받아 map으로 구성하여 map을 반환
	 * 리턴타입 : map HashMap<String, String>
	 * 매개변수 : X
	 * 메서드명 : make
	 * */
	public static void make(){
		//1.Map생성(스케너 열기)
		Scanner scan = new Scanner(System.in);
		
		//2.입력할 단어 개수 받기
		System.out.println("입력받을 단어의 개수 : ");
		int size = scan.nextInt();
		
		//3. while을 이용하여 입력받은 값 만큼 단어와 뜻을 입력받고 맵에 put
		while(map.size()<size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			String mean = scan.next();
			
			map.put(word, mean); //map.size 증가
		}
		scan.close();
		//return map;
	}
	
    
}
