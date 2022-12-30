package studentManager;

import java.util.Arrays;

/* 3. 학생클래스(별도생성)
 * 학생클래스 : 한 학생의 정보를 나타내는 클래스
 * 멤버변수 : 학번(studentNum), 이름(name), 주민번호(regidentNum), 
 * 			학부(faculty), 학과(major), 수강과목s (과목클래스 배열생성)
 * 			수강번지(subCount)
 * 멤버메서드 
 * getter/setter
 * tostring(), print() - 한학생의 정보출력
 * 수강과목추가 - 배열이 다 찼다면 늘려주기
 * 수강과목삭제
 * 생성자
 * */
public class Student {
	private String studentNum; 
	private String name;
	private String regidentNum;
	private String faculty;
	private String major;
	private Subject[] subjectList; //Subject클래스를 과목의 배열로 선언
	private int subCount; //과목의 번지를 나타내기 위한 변수
	
	//기본생성자
	public Student() {}
	
	//전체 요소를 받는 생성자
	public Student(String studentNum, String name, String regidentNum, String faculty, String major) {
		
		this.studentNum = studentNum;
		this.name = name;
		this.regidentNum = regidentNum;
		this.faculty = faculty;
		this.major = major;
		subjectList = new Subject[5];
	}

	//메서드 
	public void stdPrint() {
		System.out.println("학생명:"+name);
		System.out.println("주민번호:"+regidentNum);
		System.out.println("학번:"+studentNum);
		System.out.println("학부(학과):"+faculty+"("+major+")");
	}
	
	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", name=" + name 
				+ ", regidentNum=" + regidentNum + ", faculty="
				+ faculty + ", major=" + major + ", 수강과목수="
				+ subCount + "]";
	}
	
	//수강과목(앞에서 추가한 수강과목)을 print메서드
	public void print() {
		if(subCount==0) {
			System.out.println("--수강중인 과목이 없습니다.--");
		}
		for(int i=0; i<subCount; i++) {
			System.out.println(subjectList[i]);  //toString이용하여 출력
			//subjectList[i].subPrint(); //subPrint메서드 호출하여 출력
		}
	}
	
	//수강과목 추가
	//매개변수 : subject subName
	//리턴타입 : void
	public void insertSubject(Subject subName) {
		//수강과목의 배열이 꽉 찼다면 배열을 늘려주는 작업
		if(subCount == subjectList.length) {
			//new 배열 생성
			Subject[] tmp = new Subject[subCount+5];
			//배열복사 System.Arraycopy(구배열,시작번지,신배열,시작번지,총개수)
			System.arraycopy(subjectList, 0, tmp, 0, subjectList.length);
			//새로만든 배열로 연결
			subjectList = tmp;  //주소 연결
		}
		subjectList[subCount]= subName;
		subCount++;
	}
	
	//수강과목삭제
	//매개변수 : subName
	//리턴타입 : void
	public void deleteSubject(String subName) {
		int index=-1; //찾는 과목의 위치
		//만약 매개변수의 과목이 없다면 return
		if(subName==null) {
			return;
		}
		//subName subjectList에 있는지 확인
		for(int i=0; i<subCount; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				index = i; 
				break;
			}
		}
		//만약 찾는 과목이 배열에 없다면 return
		if(index == -1) {
			return;
		}
		//찾는 위치부터 뒷번지 과목을 앞번지로 옮기는 작업 (삭제방법)
		for(int i=index; i<subCount-1;i++) {
			//뒷번지의 값을 앞번지로 덮어씀
			subjectList[i] = subjectList[i+1];
		}
		//복사후 마지막 번지는 null
		subjectList[subCount-1] = null;
		subCount--;  //과목개수(번지수) 감소
	}

	//getter/setter
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegidentNum() {
		return regidentNum;
	}
	public void setRegidentNum(String regidentNum) {
		this.regidentNum = regidentNum;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Subject[] getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}
	public int getSubCount() {
		return subCount;
	}
	
	
	
}
