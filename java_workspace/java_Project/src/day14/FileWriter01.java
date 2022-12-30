package day14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		// 문자 기반 출력스트림
		FileWriter fw = new FileWriter("writer.txt");
		
		for(int i=1; i<=10; i++) {
			String data = i+" test \r\n";
			fw.write(data);
		}
		fw.close();
		
		//파일을 추가모드로 열어라. ("파일명",true)
		FileWriter fw1 = new FileWriter("writer.txt",true);
		for(int i=11; i<=20; i++) {
			String data = i+"test \r\n";
			fw1.write(data);
		}
		fw1.close();
		
		PrintWriter pw = new PrintWriter("writer2.txt");
		for(int i=1; i<=10; i++) {
			String data = i+"Test 입니다.";
			pw.println(data);
		}
		pw.close();
		
		//PrintWriter 객체는 추가모드가 없어서 파일 객체로 생성해서 추가.
		PrintWriter pw2 = 
				new PrintWriter(new FileWriter("writer2.txt", true));
		for(int i=11; i<=20; i++) {
			String data = i+"Test 입니다.";
			pw2.printf(data);
		}
		pw2.close();
	}

}
