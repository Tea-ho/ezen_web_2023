package 과제.과제07_상속응용.Account;

public class SinhanBank extends Account {
	
	// 필드 영역
	final String bankCode = "03";

	// 생성자 영역
	public SinhanBank() {
		// TODO Auto-generated constructor stub
	}

	public SinhanBank(String accountNo, String accountName, int accountPW, int balance) {
		super(accountNo, accountName, accountPW, balance);
		// TODO Auto-generated constructor stub
	}

	// 메소드 영역
	// 1-1. 계좌생성
	@Override
	public String createAccount( Account account ) {
		
		// 기능1: 계좌번호 생성
		int acNo1 = creatNo();	int acNo2 = creatNo();
		
		this.accountNo = (bankCode + "-" + acNo1 + "-" + acNo2);
		return accountNo;
	}
	
	// 1-2 계좌 생성 완료 후 메시지 생성
	@Override
	public void complete(Account account) {
		System.out.println("신한은행 계좌 만들어주셔서 감사합니다.");
	}
}
	

