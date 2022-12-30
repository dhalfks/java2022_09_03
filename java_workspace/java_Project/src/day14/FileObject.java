package day14;

import java.io.File;
import java.util.StringTokenizer;

public class FileObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\java_workspace\\java_Project\\out.txt");
		String fileName = f.getName();
		System.out.println("경로를 제외한 파일 이름 : "+fileName);
		System.out.println("경로를 포함한 파일 이름 : "+f.getPath());
		System.out.println("경로를 포함한 파일 이름 : "+f.getAbsolutePath());
		System.out.println("파일이 속한 폴더(경로만) : "+ f.getParent());
		System.out.println("------------------");
		System.out.println("파일 구분자 : "+File.separator); //자주 사용
		System.out.println("파일 구분 문자 : "+File.separatorChar);
		
		//시스템에서 직접 알아낸 사용자파일의 경로
		System.out.println(System.getProperty("user.dir"));
		
		//f에 대한 경로 (드라이브, 경로, 파일명, 확장자) - 다 쪼개보기 
		String fstr = f.toString(); //f의 경로를 문자열로 변경
		System.out.println("f의 전체 경로 : "+fstr);
		System.out.println("드라이브 : "+fstr.substring(0,fstr.indexOf("\\")));
		System.out.println("파일명 : " + fstr.substring(fstr.lastIndexOf("\\")+1));
		String file = fstr.substring(fstr.lastIndexOf("\\")+1);
		System.out.println(file.substring(0,file.indexOf(".")));
		System.out.println(file.substring(file.lastIndexOf(".")+1));
		
		//StringTokenizer, split 이용 
		String[] str = f.getName().split(File.separator+".");
		System.out.println("파일명 : "+str[0]+", 확장자 : "+str[1]);
		
		StringTokenizer stk = new StringTokenizer(f.getName(),".");
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
		
		//문자열의 추가나 변경등의 작업이 많은 경우 유리
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World~!!");
		sb.insert(0, "JAVA");
		sb.insert(sb.indexOf("H"), " ");
		sb.delete(0, sb.indexOf(" ")+1); //end 미포함
		String a = sb.toString();
		System.out.println(a);
		
		String b="";
		b+= "Hello";
		b+=" ";
		b+="World~!!";
		System.out.println(b);
	}

}
