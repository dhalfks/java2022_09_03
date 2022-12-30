package day13;

import java.util.HashMap;
import java.util.Map;

public class Lambda02 {

	public static void main(String[] args) {
		/* map을 구성해서 forEach를 이용한 출력
		 * Lambda 형태로 출력
			number.forEach((k)->{
				System.out.print(n+" ");
			});
		*/
		
//		Number add = (x,y)-> {System.out.println(x+y);}; //리턴이 void
//		Number max = (x,y)->(x>=y)?x:y;
//		System.out.println(max.getMax(100, 20));
		
//		Number add1 = (x,y)->x+y;
		Number add1 = Integer::sum;
		System.out.println(add1.add(5, 6));
		Map<String, Integer>map = new HashMap<String,Integer>();
		map.put("영이", 10);
		map.put("순이", 13);
		map.put("철수", 15);
		map.put("영철", 30);
		map.put("바둑이", 20);
		
		//람다식으로 출력
		map.forEach((k,v)-> System.out.println(k+":"+v));
		
	}
	
}


//인터페이스의 메서드가 1개 이상이면 람다식을 사용할 수 없음.
@FunctionalInterface
interface Number{
//	int getMax(int num1, int num2);
	//리턴=> int, 매개변수=>int로 2개
	int add (int a, int b);
}
