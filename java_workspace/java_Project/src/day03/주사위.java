package day03;

public class 주사위 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동
		 * 주사위 랜덤으로 (1~6까지 값을 생성)
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 21칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동횟수 : O번.
		 * */
		int random; //주사위 값
		int sum=0; //전진 칸 수
		int count=0; //이동횟수
		int last=50; //최종 목표값
		
		while(sum < last) { //sum이 last가 되기전까지 반복
			random = (int)(Math.random()*6)+1; //1~6 랜덤 생성
			sum = sum+random; //거리합산
			count++;
			System.out.println("주사위 번호 : "+random+", "+sum+"전진~!!");
			System.out.println((last-sum)+"칸 남았습니다.");
			
		}
		System.out.println("도착 ~!!, 총 이동 횟수" + count+"회");

	}

}
