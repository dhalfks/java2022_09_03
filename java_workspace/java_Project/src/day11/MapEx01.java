package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		//과목과 점수를 입력받아 출력하고, 합계, 평균 출력
		//종료 키워드가 나올 때까지 반복 (0)
		HashMap<String, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int exit = 1; //exit가 0이 되면 종료
		while(exit!=0) {
			System.out.println("과목과 점수를 입력해주세요.");
			String subject = scan.next();
			int score = scan.nextInt();
			map.put(subject, score);
			System.out.println("계속:1, 종료:0");
			exit = scan.nextInt();
		}
		int sum=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			sum += map.get(key);
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("sum:"+sum);
		System.out.println("average:"+((double)sum/map.size()));
		
		scan.close();

	}

}
