package day09;

import java.util.Calendar;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
//		Date d = new Date(); //depercated : 비권장
//		d.getDate();
		/* Calendar 클래스는 추상 클래스 
		 * 따라서 직접 객체를 생성할 수 없다. 
		 * new 연산자를 이용한 객체 구현X
		 * getInstance() 를이용하여 구현한 클래스를 통해 인스턴스를 얻어 옴.
		 * week : 1=일, 2=월, 3=화 .. 7=토
		 * am_pm  am=0, pm=1
		 * 월 0~11 반환 +1
		 * */
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // 0월부터 시작
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);//일
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get((Calendar.SECOND));
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
		
		//2022-09-23(금)
		//오후 2:58:00  출력
		String weekString = null;
		switch(week) {
		case 1: weekString ="일"; break;
		case 2: weekString ="월"; break;
		case 3: weekString ="화"; break;
		case 4: weekString ="수"; break;
		case 5: weekString ="목"; break;
		case 6: weekString ="금"; break;
		case 7: weekString ="토"; break;
		}
		System.out.println(year+"-"+month+"-"+day+"("+weekString+")");
		System.out.println((ampm==0? "오전 ":"오후 ")+hour+":"+minute+":"+second);
	}
}
