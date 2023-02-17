package 과제.과제09_상속_인터페이스.상속.게임;

public class 실행 {
	public static void main(String[] args) {
		
		Character ch1 = new Character();
		
		도사 job1 = new 도사();
		도적 job2 = new 도적();
		술사 job3 = new 술사();
		전사 job4 = new 전사();
		
		ch1.create("유저1", "도사");
		
		
		
	}
}
