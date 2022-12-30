package day11;

import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		//가장 큰 점수 출력, 가장 작은 점수 출력
		//80점 이상 점수 출력(tailSet), 50점 이하 점수 출력(headSet)
		int[] score = {80,95,78,32,56,12,98,66};
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		System.out.println(set);
		System.out.println(set.last());
		System.out.println(set.first());
		System.out.println(set.headSet(50)); //지정된 객체보다 작은값 출력
		System.out.println(set.tailSet(80)); //지정된 객체보다 큰값 출력
		System.out.println("--------");
		
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("aaa"); set2.add("abc"); set2.add("bbb");
		set2.add("bat"); set2.add("bag"); set2.add("banana");
		set2.add("ccc"); set2.add("car"); set2.add("fan");
		set2.add("dance"); set2.add("apple"); set2.add("can");
		set2.add("abb"); set2.add("disk"); set2.add("ccc");
		System.out.println(set2);
		String from = "abc"; //subSet(시작, 끝(미포함))
		String to = "ccc";
		System.out.println(set2.subSet(from, to));

	}

}
