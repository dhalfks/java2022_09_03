package day04;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 1~10까지 배열에 저장하고 출력
		 * */
		int size = 10;
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------");
		/* 10개의 size의 배열을 생성하고, 1~20사이의 랜덤 수를 입력 받은 후 출력
		 * */
		int arr2[] = new int[size];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*20)+1;
			System.out.print(arr2[i]+" ");
		}
		
		/* 랜덤수의 배열을 오름차순정렬 후 출력
		 * */
		for(int i=0; i<arr2.length; i++) {
			for(int j=i; j<arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("--정렬 후 출력--");
		//배열 탐색(출력) - 향상된 for문
		for(int tmp : arr2) {
			System.out.print(tmp+" ");
		}
		

	}

}
