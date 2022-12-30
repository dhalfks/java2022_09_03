package day11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		//TreeSet을 생성하고, 로또번호 6자리 담기
		//1~45까지 랜덤으로
		TreeSet set = new TreeSet();
		for(int i=0; set.size()<6; i++) {
			int num = new Random().nextInt(45)+1;
			set.add(num);
		}
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set);

	}

}
