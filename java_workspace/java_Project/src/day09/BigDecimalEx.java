package day09;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {
		//BigDecimal값을 초기화하기 위해서는 문자열로 값을 넘겨줘야 함.
		BigDecimal bd = new BigDecimal("10000.1234");
		BigDecimal db2 = new BigDecimal("100");
		//System.out.println(bd);
		
		//사칙연산을 이용하여 연산이 불가능.
		// add, subtract, multiply, divide, remainder
		System.out.println("+ > "+ bd.add(db2) );
		System.out.println("- > "+ bd.subtract(db2));
		System.out.println("* > "+ bd.multiply(db2));
		System.out.println("/ > "+ bd.divide(db2));
		System.out.println("% > "+ bd.remainder(db2));
		
		//비교를 나타낼때 compareTo 앞의 수가 크면 1, 작으면 -1 같으면 0
		System.out.println(db2.compareTo(bd));
		
		BigInteger bi = new BigInteger("123456789");
		System.out.println(bi);
		
		//BigInteger 형변환
		//int -> bigInteger
		BigInteger bi2 = BigInteger.valueOf(100000); //일반 int 
		System.out.println(bi2);
		
		int int_bigNum = bi2.intValue(); // bigInter -> int
		System.out.println(int_bigNum);
		long long_bigNum = bi2.longValue(); 
		String string_bigstr = bi2.toString();
		System.out.println(string_bigstr);
		
	}

}
