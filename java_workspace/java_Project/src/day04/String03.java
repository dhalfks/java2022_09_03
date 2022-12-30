package day04;

public class String03 {

	public static void main(String[] args) {
		/* 이메일에서 ID를 추출 */
		String email = "1234111115@gamil.com";
		String id = email.substring(0, email.indexOf('@')); //0, 5
		System.out.println(id);
		String domain = email.substring(email.indexOf('@')+1);
		System.out.println(domain);
		
		String fileName = "String메서드.jpg";
		String name = fileName.substring(0, fileName.indexOf('.'));
		String suffix = fileName.substring(fileName.indexOf('.')+1);
		
		System.out.println("파일이름: "+name +", 확장자 : "+ suffix);

	}

}
