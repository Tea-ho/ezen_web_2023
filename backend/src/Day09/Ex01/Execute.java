package Day09.Ex01;

public class Execute {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		System.out.println(member.name);
		
		// System.out.println(member.inputName);
		// 오류 발생: Member클래스 메소드 안에 있는 변수 사용이 불가하기 때문
		
		member.setName();
		
	}
}
