package 과제.과제07_상속응용.view_Control;

import java.util.ArrayList;
import java.util.Scanner;

import 과제.과제07_상속응용.Account.Account;
import 과제.과제07_상속응용.Account.KookminBank;
import 과제.과제07_상속응용.Account.SinhanBank;
import 과제.과제07_상속응용.Account.WooriBank;

public class FrontControl {
	
	// 
	private static FrontControl front = new FrontControl();
	private FrontControl() {}
	public static FrontControl getInstance() { return front;}
	
	// Scanner 객체 생성
	Scanner scanner = new Scanner(System.in);
	
	Account combine = new Account();
	KookminBank kookmin = new KookminBank();
	WooriBank woori = new WooriBank();
	SinhanBank sinhan = new SinhanBank();
	
	// ArrayList 생성
	ArrayList<Account> accountList = new ArrayList<>();
	
	
	public void index() {
		while(true) {
			System.out.println("--------------------- 계좌 관리 ---------------------");
			printIndex();
			System.out.print("[메뉴] 1.계좌생성 2.예금");
			int choice = scanner.nextInt();
			
			if( choice == 1 ) { choiceBank(choice); }
			else if( choice == 2) {	deposit(choice); }
			else {	System.out.println("번호를 다시 입력해주세요."); }
		}
	}
	
	public void printIndex() {
		System.out.println("은행명\t계좌번호\t\t예금액");
		for( int i = 0; i < accountList.size(); i++ ) {
			if( accountList.get(i) instanceof KookminBank ) {
				System.out.println("국민은행\t" + accountList.get(i).getAccountNo() +"\t" + accountList.get(i).getBalance() );
			}
			if( accountList.get(i) instanceof WooriBank ) {
				System.out.println("우리은행\t" + accountList.get(i).getAccountNo() +"\t" + accountList.get(i).getBalance() );
			}
			
			if( accountList.get(i) instanceof SinhanBank ) {
				System.out.println("신한은행\t" + accountList.get(i).getAccountNo() +"\t" + accountList.get(i).getBalance() );
			}
		}
	}
	
	public void choiceBank(int no) {
		System.out.println("--------------------- 계좌 생성 ---------------------");
		System.out.print("[메뉴] 1.신한은행 2.국민은행 3.우리은행");
		int choice = scanner.nextInt();
		
		if( choice == 1) {
			createAccount(sinhan);
		}
		else if( choice == 2) {
			createAccount(kookmin);
		}
		else if( choice == 3) {
			createAccount(woori);
		}
		else { System.out.println("번호를 다시 입력해주세요."); }
		
	}
	
	public void createAccount(Account account) {
		
		String accountNo = account.createAccount(account);
		
		System.out.println("--------------------- 계좌 정보 입력 ---------------------");
		System.out.println("계좌주: ");	String accountName = scanner.next();
		System.out.println("비밀번호: ");	int accountPW = scanner.nextInt();
		System.out.println("계좌번호: " + accountNo );	
		System.out.println("잔금: 0원" );		
		
		if( account instanceof KookminBank ) {
			Account combine = new KookminBank(accountNo, accountName, accountPW, 0);
			accountList.add(combine);
			combine.complete(account);
			printAccount(combine);
		}
		if( account instanceof WooriBank) {
			Account combine = new WooriBank(accountNo, accountName, accountPW, 0);
			accountList.add(combine);
			combine.complete(account);
			printAccount(combine);
		}
		if( account instanceof SinhanBank) {
			Account combine = new SinhanBank(accountNo, accountName, accountPW, 0);
			accountList.add(combine);
			combine.complete(account);
			printAccount(combine);
		}
	}
	
	public void printAccount(Account account) {
		System.out.println("--------------------- 계좌 생성 완료 ---------------------");
		if( account instanceof KookminBank ) {
			System.out.println("계좌주: " + account.getAccountName());
			System.out.println("계좌번호: " + account.getAccountNo());
			System.out.println("은행: 국민은행");
		}
		if( account instanceof WooriBank ) {
			System.out.println("계좌주: " + account.getAccountName());
			System.out.println("계좌번호: " + account.getAccountNo());
			System.out.println("은행: 우리은행");
		}
		if( account instanceof SinhanBank ) {
			System.out.println("계좌주: " + account.getAccountName());
			System.out.println("계좌번호: " + account.getAccountNo());
			System.out.println("은행: 신한은행");
		}
	}
	
	
	public void deposit(int no) {
		System.out.println("--------------------- 계좌 입금 ---------------------");
		System.out.print("입금할 계좌번호: ");		String accountNo = scanner.next();
		System.out.println("예금액: ");		int Balance = scanner.nextInt();

		for(int i = 0; i < accountList.size(); i++) {
			if( accountList.get(i).getAccountNo().equals(accountNo) ) {
				accountList.get(i).setBalance( accountList.get(i).getBalance()+Balance );
				System.out.println( "예금 완료, 잔고: " + accountList.get(i).getBalance() );
			}
		}
		
	}
	
	
	
}
