package day01;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력. 
		 * 평균이 80이상이면 합격, 아니면 불합격
		 * */
		int kor, eng, math, sum;
		double avg;
		kor = 78;
		eng = 71;
		math = 59;
		sum = kor+eng+math;
		avg = sum/3.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		if(avg >=80) {
			System.out.println("평가 : 합격");
		}else {
			System.out.println("평가 : 불합격");
		}

	}

}
