package day03;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 배열크기를 가지고 있음. 
		 * 길이가 정해져 있어서 이후 추가/삭제를 할 수 없음.
		 * 배열의 길이를 늘리거나, 줄이거나 배열 복사를 이용.
		 * */
		int b=20; // 대입 연산자를 이용하여 저장
		int a = 10;
		b = a;
		
		int arr[] = new int[] {1,2,3,4,5};
		int arr1[] = arr; //잘못된 복사 방법 (하나의 객체를 공유)
		System.out.println(arr1[0]);
		arr[0]=100;
		System.out.println(arr1[0]);
		System.out.println("------------------");
		
		arr1 = new int[arr.length]; //기존 복사할 arr의 개수만큼 생성
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = arr[i];  //arr를 arr1로 복사
			System.out.println(arr1[i]); //arr1출력
		}
		System.out.println(arr);
		System.out.println(arr1);
		
		System.out.println("----------");
		
		//arraycopy를 이용
		
		int arr2[] = new int[arr1.length*2]; //arr1의 2배
		//arr1 => arr2로 복사
		//System.arraycopy(복사할배열,시작번지, 새배열,시작번지, 개수);
		System.arraycopy(arr1, 0, arr2, 1, arr1.length);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		

	}

}
