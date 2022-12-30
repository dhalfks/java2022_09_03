package day11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class MapEx02 {

	public static void main(String[] args) {
		/* 단어장  단어:의미 => hello:안녕
		 * 5 => 5개의 단어를 입력
		 * */
		//1.Map생성(스케너 열기)
		TreeMap<String, String> map = new TreeMap<String, String>();
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
		
		//4. 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next(); // key반환
			String mean = map.get(word); //value반환
			System.out.println("단어:"+word+", 의미:"+mean);
		}

	}

}
