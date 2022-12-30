package day05;

public class Method07_lotto {

	public static void main(String[] args) {
		/* 로또번호 생성 (1~45 랜덤으로 번호를 생성)
		 * 당첨확인
		 * */
		int lotto[] = new int[7];  //당첨번호+보너스번호(마지막번호)
		int user[] = new int[6];
		randomArray(lotto);
		printArray(lotto);
		System.out.println();
		System.out.println("------------");
		randomArray(user);
		printArray(user);
		System.out.println();
		System.out.println("------------");
		
		//등수 출력
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝~!!");
		}else {
			System.out.println(rank + "등 당첨~!!");
		}

	}
	/* 1. 번호 랜덤 생성 기능.
	 * 1~45까지 랜덤 생성
	 * 매개변수 : X
	 * 리턴타입 : int
	 * 메서드명 : random
	 * */
	public static int random() {
		return (int)(Math.random()*45)+1;
	}
	
	/* 2. 배열에 1의 랜덤번호를 저장하는 기능.
	 * 매개변수 : 배열 (int arr[])
	 * 리턴타입 : void 없음. 
	 * 메서드명 : randomArray
	 * */
	public static void randomArray(int arr[]) {
		//중복상관없이 랜덤 배열을 생성
//		for(int i=0; i<arr.length; i++) {
//			int r = random();
//			if(!isContain(arr, r)) {
//				arr[i] = r;
//			}else {
//				i--;
//			}
//			//arr[i] = random();
//		}
		
		//while
		int cnt = 0;
		while(cnt < arr.length) {
			int r = random();
			if(!isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	/* 3. 정수 배열을 콘솔에 출력하는 기능
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 * */
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	/* 4. 같은 값이 있는지 확인
	 * 매개변수 : 생성할 배열(int arr[]), num (random)
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 * */
	public static boolean isContain(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	/* 5. 등수를 알려주는 메서드
	 * 매개변수 :int lotto[], int user[]
	 * 리턴타입 : int
	 * 메서드명 : lottoRank
	 * -- 당첨기준
	 * 6개일치 : 1등
	 * 5개일치+보너스 : 2등
	 * 5개일치 : 3등
	 * 4개일치 : 4등
	 * 3개일치 : 5등
	 * 나머지는 꽝
	 * */
	public static int lottoRank(int lotto[], int user[]) {
		//lotto와 user는 개수가 다름. 
		if(lotto.length <= user.length) { //배열의 순서가 바뀌었거나, 같은 배열을 넣었거나
			return -1;
		}
		int cnt=0;  //맞춘 개수(보너스는 제외)
		for(int i=0; i<user.length; i++) {
			if(isContain(user, lotto[i])) {
				cnt++; 
			}
		}
		
		switch(cnt) {
		case 6: return 1;
		case 5:
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3;
			}
			//return (isContain(user, lotto[lotto.length-1]))? 2: 3;	
		case 4: return 4;
		case 3: return 5;
			default : 
				return -1;
		}
		
	}

}
