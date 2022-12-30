package day07;

public class Ezen출력 {

	public static void main(String[] args) {
//		EzenComputer ez = new EzenComputer("홍길동","010-1111-1111");
//		ez.printCompany();
//		ez.printInfo();
//		ez.insertCourse("java", "1개월");
//		ez.insertCourse("db", "1개월");
//		ez.printCourse();
		/* 5명의 학생 등록 후 
		 * 학생이름으로 검색
		 * 지점명으로 검색
		 * */
		EzenComputer[] std = new EzenComputer[5];
		std[0]=new EzenComputer("홍길동", "010-1111-1111","인천");
		std[1]=new EzenComputer("이순신", "010-2222-2222","부천");
		std[2]=new EzenComputer("강감찬", "010-2222-3333","시흥");
		std[3]=new EzenComputer("유관순", "010-2222-4444","인천");
		std[4]=new EzenComputer("임꺽정", "010-2222-5555","인천");
		
		String searchName="유관순";
		for(EzenComputer tmp : std) {
			if(tmp != null && tmp.getName().
					equals(searchName)) {
				//System.out.println("----------");
				tmp.printInfo(); //== 주소가비교
			}
		}
		/* String은 == 비교할 수 없음.(참조변수) equels로 비교
		 * */
		String searchBranch="인천";
		for(int i=0; i<std.length; i++) {
			if(std[i]!=null && std[i].getBranch().
					equals(searchBranch)) {
				std[i].printInfo();
				std[i].printCompany();
			}
		}
		

	}

}
