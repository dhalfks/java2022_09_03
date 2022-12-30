package day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDictionary {
	/* do 
	 * 1.동사 (어떤 동작이나 행위를) 하다
	 * 2.동사 (앞에서 언급된 대로) 하다
	 * 3.동사 하다[되어 가다](어떤 일의 성공 여부나 진행 상황에 대해 말하거나 물을 때 씀)
	 * 4.조동사 <다른 동사 앞에 쓰여 부정문이나 의문문을 만듦>
	 * 5.조동사 <부가 의문문을 만들 때 쓰임>
	 * */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Word1 w = new Word1();
		Dictionary d = new Dictionary();
		Map<String, ArrayList<String>> words;
		words = w.makeWord(scan, d);
		//System.out.println(words);
		
		Writer fs = new FileWriter("englishWord.txt",true);
		BufferedWriter bw = new BufferedWriter(fs);
		StringBuffer sb = new StringBuffer();
		int cnt=0;
		String data = words.toString();
		sb.append(data);
		sb.append("\r\n"); //줄바꿈용
		String english = sb.toString();
		fs.write(english);
		fs.close();
	}

}
class Dictionary{
	//단어의 값을 가지고 있는 리스트
	ArrayList<String> word = new ArrayList<String>();
}
class Word1{
	
	//word 추가 메서드 생성
	//맵을 생성하여 단어를 추가하고 맵을 리턴
	public Map<String, ArrayList<String>> makeWord
	(Scanner scan, Dictionary d ){
		Map<String, ArrayList<String>> words = new HashMap<>();
		ArrayList<String> list = new ArrayList<>(); //의미
		// y/n
		char is ='y';
		while(is == 'y') {
			System.out.println("단어:");
			String word = scan.next();
			if(d.word.contains(word)) {
				System.out.println("이미 있는 단어입니다.");
				is='n';
			}else {
				d.word.add(word); //dictionary arrayList에 단어 추가
				System.out.println("뜻:");
				scan.nextLine(); //앞에서 입력한 Enter의 값을 가지고 휘발
				String mean = scan.nextLine(); //공백포함.
				list.add(mean);
				System.out.println(word+"에 대한 내용을 추가하시겠습니까? y/n");
				is=scan.next().charAt(0);
				while(is=='y'||is=='Y') {
					System.out.println(word+"에 대한 뜻 추가:");
					scan.nextLine();
					mean = scan.nextLine();
					list.add(mean);
					System.out.println(word+"에 대한 내용을 추가하시겠습니까? y/n");
					is=scan.next().charAt(0);
					if(!(is=='n'||is=='N'||is=='y'||is=='Y')) {
						System.out.println("잘못입력된 값입니다.");
					}
				}
			}
			words.put(word, list);
			System.out.println(word +">>");
		}
		//뜻 출력
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		return words;
	}
}


