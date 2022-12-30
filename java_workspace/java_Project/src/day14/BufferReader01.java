package day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader01 {

	public static void main(String[] args) throws IOException {
		//BufferedReader : 보조스트림 
		//라인단위로 읽기
		//더이상 읽을 라인이 없을 경우 null을 리턴
		/* 입출력 스트림 구분
		 * 대상 기준 : 입력 스트림 / 출력 스트림
		 * 자료 종류 : 바이트 스트림 / 문자 스트림
		 * 기능 : 기반 스트림 / 보조스트림
		 * 기반 스트림 : 대상에 직접 자료를 읽고 쓰는 기능의 스트림
		 * => XXInput/OutputStream, XXReader/Writer
		 * 보조 스트림 : 직접 읽고 쓰는 기능없이 추가적인 기능을 더해주는 스트림 
		 * 보조스트림은 항상 기반스트림이나 혹은 또 다른 스트림을 생성장의
		 * 매개변수로 포함함.
		 * */
		BufferedReader br = new BufferedReader(
				new FileReader("out.txt"));
		while(true) {
			String line = br.readLine(); // 한라인씩 읽기
			if(line == null)break;  //더이상 읽을 라인이 없으면 break;
			System.out.println(line); //한 라인 출력
		}
		br.close();
	}

}
