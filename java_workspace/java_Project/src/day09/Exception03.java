package day09;

public class Exception03 {

	public static void main(String[] args) {
		/* 예외가 발생하면 발생한 시점부터 메서드 종료. (비정상종료)
		 * try~catch문을 활용하여 예외가 발생했을 때 프로그램이 비정상 종료되지 않고
		 * 이어 정상종료 될 수 있도록 처리하는 방법 
		 * 예외발생시점부터 실행은 안됨. 
		 * 
		 * try{
		 * 예외가 발생할 수 있는 실행문;
		 * }catch(예외클래스명1 객체){
		 * 처리문;
		 * }catch(예외클래스명2 객체){
		 * 처리문;
		 * }catch(예외클래스명3 객체){
		 * 처리문;
		 * }
		 * */
		
		double res = 0;
		try {
			res = 1/0; 
			int arr[] = null; //0~4번지구성
			arr[5]=10;
		} catch (ArithmeticException | NullPointerException e) { //둘중 하나가 오면
			System.out.println("예외발생~!!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다. 예외발생~!!");
		} catch (Exception e) {   //Exception 모든 예외의 최고조상 항상 마지막에.
			System.out.println("Exception 발생!!");
		}
		System.out.println("수고하셨습니다.~!!");
	}

}
