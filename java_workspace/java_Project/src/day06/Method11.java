package day06;

public class Method11 {

	public static void main(String[] args) {
		/* 가변인자 메서드
		 * - 매개변수의 개수가 고정되어있지 않는 경우
		 * */
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6,7));
		System.out.println(sum(1,5,4,7,8,9,6,1,2,3,5,9,4));

	}
	public static int sum(int...num) { // num가 배열처럼 사용됨.
		int res=0;
		for(int tmp:num) {
			res+=tmp;
		}
		return res;
	}
	

}
