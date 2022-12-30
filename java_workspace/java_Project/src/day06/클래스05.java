package day06;

public class 클래스05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		t.trunOn();
		t.chUp();
		t.chUp();
		t.chUp();
		t.setCh(9);
		t.chUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.chDown();
		t.volDown();
		t.trunOff();
	
		

	}

}
/* 클래스 생성
 * TV
 * - power (전원의 상태)
 * - printPower 
 * - ch 
 * (up : +1씩 증가/down : +1씩 감소) 
 * - vol
 * (up : +1씩 증가/down : +1씩 감소)
 * */
class Tv{
	private boolean power;
	private int ch=1;
	private int vol;
	
	public void trunOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	public void trunOff() {
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}
	
	public void chUp() {
		ch++;
		if(ch==10) {
			ch = 1;
		}
		System.out.println("ch : "+ch);
	}
	public void chDown() {
		ch--;
		if(ch==1) {
			ch=10;
		}
		System.out.println("ch : "+ch);
	}
	public void volUp() {
		vol++;
		if(vol==10) {
			vol = 1;
		}
		System.out.println("vol : "+vol);
	}
	public void volDown() {
		vol--;
		if(vol ==0) {
			vol = 10;
		}
		System.out.println("vol : "+vol);
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
		
}
