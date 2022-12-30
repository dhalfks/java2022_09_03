package day14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream01 {

	public static void main(String[] args) throws IOException {
		//파일쓰기 : 바이트기반 출력스트림
		//상대경로
		FileOutputStream output = new FileOutputStream("out.txt");
		//10번 반복해서 test 쓰기
		for(int i=1; i<=10; i++) {
			String data = i+" test \r\n"; // \r\n : 줄바꿈
			output.write(data.getBytes()); //파일에 쓰기
		}
		output.close();
	}

}
