package 과제.과제09_상속_인터페이스.상속.게임;

public class Character {

	// 필드 영역
	private String name;
	private String job;
	
	// 생성자 영역
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Character(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	// 메소드 영역
	public void create(String name, String job) {
		System.out.println("캐릭터 생성");
	}
	
	public void delete( boolean choice ) {
		System.out.println("캐릭터 삭제");
	}
	
	public void attackBasic( String spacebar ) {
		System.out.println("기본 공격");
	}
	
	public void attackJob(String key) {
		System.out.println("직업별 공격");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
