package new02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map01 {

	public static void main(String[] args) {
		/* 단어장 
		 * 단어 : 의미 => hello : 안녕
		 * 입력받을 단어의 개수 받아서 그만큼 map에 추가 후 콘솔에 찍기
		 * 
		 * */
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("입력받을 단어개수 : ");
		int size = scan.nextInt();
		
		while(map.size() < size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			String mean = scan.next();
			
			map.put(word, mean);
		}
		
		//출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();  //key
			String mean = map.get(word); //value
			System.out.println("단어:"+word+", 의미:"+mean);
		}

	}

}
