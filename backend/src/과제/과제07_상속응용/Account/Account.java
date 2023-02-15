package 과제.과제07_상속응용.Account;

import java.util.Random;

public class Account {
	
	// 필드 영역
	protected String bankCode;
	protected String bankName;
	protected String accountNo;
	protected String accountName;
	protected int accountPW;
	protected int Balance;
	
	// 생성자 영역
	public Account() {  }

	public Account(String bankCode, String bankName, String accountNo, String accountName, int accountPW, int balance) {
		super();
		this.bankCode = bankCode;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountPW = accountPW;
		Balance = balance;
	}

	// 메소드 영역
	@Override
	public String toString() {
		return bankName + "\t" + accountNo + "\t" + Balance;
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

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	// 1-1. 계좌생성 (타입 arraylist로 변경 필요)
	public String createAccount( int no ) {
		
		// 기능1: 계좌번호 생성
		int acNo1 = creatNo();	int acNo2 = creatNo();
		
		if( no == 1 ) {
			bankCode = "03";
			addAcount(bankCode);
		}
		if( no == 2 ) {
			bankCode = "04";
			addAcount(bankCode);
		}
		if( no == 3 ) {
			bankCode = "05";
			addAcount(bankCode);
		}
		
		accountNo = (bankCode + "-" + acNo1 + "-" + acNo2);
		return accountNo;
		
	}

	// 1-1 계좌번호 난수 생성 메소드
	public int creatNo( ) {
		Random random = new Random();
		int result = random.nextInt(99)+10;
		return result;
	}
	
	// 1-2 계좌 정보 추가
	public void addAcount( String bankCode ) {
		// 기능1: 은행코드 - 은행이름 매칭
			if( bankCode.equals("03") ) {
				bankName = "신한은행";
			}
			else if( bankCode.equals("04") ) {
				bankName = "국민은행";
			}
			else if( bankCode.equals("05") ) {
				bankName = "우리은행";
			}
		// 기능2: 계좌 정보 저장
		
	}
	
	// 2. 예금
	

}
