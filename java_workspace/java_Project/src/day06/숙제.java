package day06;

public class 숙제 {

	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(5, 1));
		System.out.println(solution(3, 3));
		System.out.println("----------");
		System.out.println(solution2(3, 5));
		System.out.println(solution2(5, 1));
		System.out.println(solution2(3, 3));
	}
	/* 두 정수 a,b가 주어졌을 때 a와 b사이에 속한 모든
	 * 정수의 합을 리턴하는 메서드
	 * 매개변수 : int a, int b
	 * 리턴타입 : 합 => int
	 * 메서드명 : solution
	 * 예) a=3, b=5 => 3+4+5 
	 * 예) a=5, b=1 => 1+2+3+4+5
	 * 예) a=3, b=3 => 3 
	 * */
	public static int solution(int a, int b) {
		if(a >b) {
			int tmp = a;
			a=b;
			b=tmp;
		}
		int res=0;
		for(int i=a; i<=b;i++) {
			res+=i; //res = res + i
		}
		return res;
	}
	
	public static int solution2(int a, int b) {
		int max = Math.max(a, b); //a,b중 큰값
		int min = Math.min(a, b); //a,b중 작은값
		int res=0;
		for(int i=min; i<=max; i++) {
			res+=i;
		}
		return res;
	}

}
