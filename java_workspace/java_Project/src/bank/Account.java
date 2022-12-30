package bank;

public class Account {
//멤버변수 : 계좌번호, 소유주, 잔고 
	private String ano; //계좌번호
	private String owner; //소유주
	private int balance; //잔고
	
	//생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [계좌번호:" + ano + ", 소유주:" + owner + ", 잔액:" + balance + "]";
	}
	
	//입금 => deposit
	//리턴:X, 매개변수:금액
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금 => withdraw
	//리턴 : int , 매개변수:금액
	public int withdraw(int amount) {
		//잔액부족할 경우
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return -1;
		}else {
			balance -= amount;
		}
		return balance;
	}
	
}
