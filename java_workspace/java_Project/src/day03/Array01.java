package day03;

public class Array01 {

	public static void main(String[] args) {
		/* 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조변수)
		 * - 배열 선언 방법
		 * 타입[] 배열이름;
		 * 타입 배열이름[];
		 * - 선언과 초기화
		 * 타입[] 배열이름 = new 타입[길이]; //가장 많이 사용되는 방식
		 * 타입[] 배열이름 = new 타입[]{값1, 값2, 값3....};
		 * 타입[] 배열이름 = {값1, 값2, 값3,...};  //선언과 동시에 초기화 할 때만 가능.
		 * - 배열의 길이는 0이상이여야 합니다.
		 * - 배열의 0번지시작
		 * - 배열[5] => 0 1 2 3 4
		 * */
		int a = 10;
		int arr1[] = new int[5]; //일반적인 방식
		int arr2[];
		arr2 = new int[5];
		int arr3[] = new int[] {1,2,3,4,5};
		int arr4[]= {1,2,3,4,5}; //선언과 동시에 초기값을 줄때만 
		
		/* 배열을 사용하는 이유
		 * 반복문을 이용할 수 있기 때문에 편리하다.
		 * 배열의 번지는 0부터 총길이의 -1까지
		 * - 배열의 총길이를 구할 때 배열이름.length
		 * */
		System.out.println(arr3[0]); //1
		System.out.println(arr3[1]);
		System.out.println(arr4[2]);
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		arr3[0]=10;
		arr3[1]=21;
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println(arr1[0]);
		
		//arr1배열에 1~5까지 값을 저장하고 출력
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i+1;
			System.out.println(arr1[i]);
		}
	}

}
