package day03;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열 arr를 생성
		 * */
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
		//배열을 섞는 코드
		//방법 : 랜덤함 번지(0~arr.length)를 선택해서 다른 번지와 교환
//		int a= 10;
//		int b = 20;
//		
//		int tmp = b;
//		b=a; //10
//		a=tmp; //20
		
		//random번지 생성
		int min=0; //시작번지 0
		int max = arr.length-1; //끝번지 9
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*max)+min;
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random]=tmp;
		}
		System.out.println();
		System.out.println("---섞은 후-------");
		// 출력코드
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//오름차순, 내림차순
		// 7 9 1 6 8 2 10 3 4 5
		// 1 9 7 6 8 2 10 3 4 5
		// 1 2 9 7 8 6 10 3 4 5
		// 1 2 
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j] ) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("--정렬 후---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
