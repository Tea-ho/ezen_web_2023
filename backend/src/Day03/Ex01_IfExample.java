package Day03;

public class Ex01_IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		// if문 ex1>
		// 첫번째 if문과 관계없이 두번째 if문이 실행됨
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		// if문 ex2>
		// if문에 부합하면 else문은 실행되지 않는다.
		if(score >= 80) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}
