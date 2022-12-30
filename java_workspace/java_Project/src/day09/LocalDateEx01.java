package day09;

import java.time.LocalDate;

public class LocalDateEx01 {

	public static void main(String[] args) {
		/* 1.8 이전에는 Date =>deprecated, 
		 * 1.8 이후에는 Calendar, LocalDate, LocalTime, LocalDateTime 사용권장 
		 * */
		LocalDate today = LocalDate.now();
		LocalDate date = LocalDate.of(2009, 9, 30);
		System.out.println(date);
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.plusMonths(1L));
		System.out.println(today.minusYears(2L));

	}

}
