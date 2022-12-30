package day07;
/* - 학생기본정보 : 이름, 생년월일, 나이, 전화번호
 * - 학원정보 : 학원이름=Ezen, 지점
 * - 학생수강정보 : 수강과목, 기간 
 * 홍길동, 900101, 33, 010-1111-1111
 * ezen, 인천
 * 자바(1개월), db(2개월), html(1개월)
 * - 기능
 * - 학생의 기본정보 출력
 * - 학생의 학원정보 출력
 * - 학생의 수강정보 출력
 * - 학생의 수강정보를 추가하는 기능.
 * - 생성자
 * */
public class EzenComputer {
	//멤버변수 선언 
	private String name;
	private String birth;
	private int age;
	private String phone;
	final static public String company ="EZEN";
	private String branch;
	private String[] course = new String[5];//수강과목:한명이 여러과목을 수강
	private String[] peroid = new String[5];//수강기간:
	private int courseCount=0;
	
	//생성자
	public EzenComputer() {} //기본생성자
	public EzenComputer(String name, String phone) {
		this.name = name;
		this.phone = phone;
		//this.course = new String[5];
	}
	public EzenComputer(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	//메서드
	public void printInfo() { //학생 기본정보 출력
		 System.out.println("--학생정보--");
		 System.out.println("이름:"+name);
		 System.out.println("전화:"+phone);
		 System.out.println("나이:"+age);
		 System.out.println("생일:"+birth);	
	}
	
	public void printCompany() {
		System.out.println("학원명:"+company);
		System.out.println("지점명:"+branch);
	}
	
	//수강정보 추가
	public void insertCourse(String course, String period) {
		this.course[courseCount]=course;
		this.peroid[courseCount]=period;
		courseCount++;
	}
	
	//수강정보 출력
	public void printCourse() {
		if(course == null || course.length == 0 || courseCount==0) {
			System.out.println("수강이력이 없습니다.");
			return;
		}
		for(int i=0; i<courseCount; i++) {
			System.out.println("과정:"+course[i]+"("+peroid[i]+")");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeroid() {
		return peroid;
	}
	public void setPeroid(String[] peroid) {
		this.peroid = peroid;
	}
	public static String getCompany() {
		return company;
	}
	
}
