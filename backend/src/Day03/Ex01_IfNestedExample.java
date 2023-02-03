package Day03;

public class Ex01_IfNestedExample { // c S
	public static void main(String[] args) { // m S
		
		int score = (int)(Math.random()*20)+81;
		// 변수 score 선언 (초기값: 난수, 범위: 81~100)
		System.out.println("점수: " + score);
		
		
		String grade;
		// 변수 grade 선언 (초기값: x)
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			}
			else {
				grade = "A";
			}
		}
		else {
			if(score>=85) {
				grade = "B+";
			}
			else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
		
	} // m E
} // c E
