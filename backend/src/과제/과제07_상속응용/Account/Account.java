package 과제.과제07_상속응용.Account;

import java.util.Random;

public class Account {
	
	// 필드 영역
	protected String accountNo;
	protected String accountName;
	protected int accountPW;
	protected int Balance;
	
	// 생성자 영역
	public Account() {  }

	public Account(String accountNo, String accountName, int accountPW, int balance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountPW = accountPW;
		this.Balance = balance;
	}

	// 메소드 영역l
	// 1-1. 계좌생성
	public String createAccount( Account account ) {
		
		// 기능1: 계좌번호 생성
		int acNo1 = creatNo();	int acNo2 = creatNo();
		
		this.accountNo = ("은행코드" + "-" + acNo1 + "-" + acNo2);
		return accountNo;
	}

	// 1-1 계좌번호 난수 생성 메소드
	public int creatNo( ) {
		Random random = new Random();
		int result = random.nextInt(89)+10;
		return result;
	}
	
	// 1-2 계좌 생성 완료 후 메시지 생성
	public void complete(Account account) {
		System.out.println("계좌 만들어주셔서 감사합니다.");
	}

	
	// 2. 예금 (getter,setter 이용하여 입력)
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountPW() {
		return accountPW;
	}

	public void setAccountPW(int accountPW) {
		this.accountPW = accountPW;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

}
