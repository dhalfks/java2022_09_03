package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception06 {

	public static void main(String[] args)  {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		try {
			String name = br.readLine();
			System.out.println(name);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
