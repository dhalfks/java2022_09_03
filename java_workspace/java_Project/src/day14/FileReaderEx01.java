package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FileReaderEx01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		int sum=0;
		while(true) {
			String line = br.readLine(); // 한라인씩 읽기
			if(line == null)break;  //더이상 읽을 라인이 없으면 break;
			String name = line.substring(0, line.indexOf(" "));
			int score = Integer.parseInt(
					line.substring(line.indexOf(" ")+1));
			sum+=score;
			map.put(name, score);
		}
		//System.out.println(map); //한 라인 출력
		for(String tmp : map.keySet()) {
			System.out.println(tmp +" : "+map.get(tmp));
		}
		System.out.println("sum : "+sum);
		System.out.println("avg : "+(sum/map.size()));
		br.close();
		
		//스케너 처럼 데이터를 입력받을 때 (콘솔입력)
		BufferedReader br2 = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("아무 문자나 입력!!");
		String a = br2.readLine();
		System.out.println(a);

	}

}
