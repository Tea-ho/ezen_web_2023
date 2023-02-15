package 과제.과제07_상속응용.view_Control;

import java.util.ArrayList;
import java.util.Scanner;

import 과제.과제07_상속응용.Account.Account;

public class FrontControl {
	
	private static FrontControl front = new FrontControl();
	private FrontControl() {}
	public static FrontControl getInstance() { return front;}
	
	Scanner scanner = new Scanner(System.in);	
	ArrayList<Account> accountList = new ArrayList<>();
	
	
	public void index() {
		while(true) {
			System.out.println("--------------------- 계좌 관리 ---------------------");
			printIndex();
			System.out.print("[메뉴] 1.계좌생성 2.예금");
			int choice = scanner.nextInt();
			
			if( choice == 1 ) { create(choice); }
			else if( choice == 2) {	deposit(choice); }
			else {	System.out.println("번호를 다시 입력해주세요."); }
		}
	}
	
	public void printIndex() {
		System.out.println("은행명\t계좌번호\t예금액");
	}
	
	public void create(int no) {
		System.out.println("--------------------- 계좌 생성 ---------------------");
		System.out.print("[메뉴] 1.신한은행 2.국민은행 3.우리은행");
		int choice = scanner.nextInt();
		
		if( choice == 1) {
			choiceBank(choice);
		}
		else if( choice == 2) {
			choiceBank(choice);
		}
		else if( choice == 3) {
			choiceBank(choice);
		}
		else { System.out.println("번호를 다시 입력해주세요."); }
		
	}
	
	public void choiceBank(int no) {
		
		Account account = new Account();
		String accountNo = account.createAccount(no);
		int Balance = 0;
		
		System.out.println("--------------------- 계좌 정보 입력 ---------------------");
		System.out.println("계좌주: ");	String accountName = scanner.next();
		System.out.println("비밀번호: ");	int accountPW = scanner.nextInt();
		System.out.println("계좌번호: " + accountNo  );	
		System.out.println("잔금: " + Balance);		
		
		account.setAccountName(accountName);
		account.setAccountPW(accountPW);
		account.setAccountNo(accountNo);
		account.setBalance(Balance);
		
		accountList.add(account);
		System.out.println(accountList.get(0));
	}
	
	
	public void deposit(int no) {
		System.out.println("--------------------- 계좌 입금 ---------------------");
		System.out.print("입금할 계좌번호: ");		String accountNo = scanner.next();
		System.out.println("예금액: ");		int Balance = scanner.nextInt();
		
		
		
	}
	
	
	
}
