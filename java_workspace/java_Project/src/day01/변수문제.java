package day01;

public class 변수문제 {

	public static void main(String[] args) {
		//국어(kor), 영어(eng), 수학(math)
		//세 값의 합계와 평균을 구하려고 합니다. 
		//필요한 변수와 값을 넣어주세요. 
		//출력.
		int kor, eng, math;
		kor = 70;
		eng=89;
		math=71;
		int sum=0; //초기값
		sum = kor+eng+math;
		int count = 3;
		double avg = (double)sum/count;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// 정수 / 정수 = 정수
		// 값 / 0 = 예외발생(infinity)
	}

}
