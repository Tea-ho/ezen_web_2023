package 과제.과제09_상속_인터페이스.상속.게임;

public class 전사 extends Character {

	@Override
	public void create(String name, String job) {
		// TODO Auto-generated method stub
		super.create(name, job);
	}

	@Override
	public void delete(boolean choice) {
		// TODO Auto-generated method stub
		super.delete(choice);
	}

	@Override
	public void attackBasic(String spacebar) {
		// TODO Auto-generated method stub
		super.attackBasic(spacebar);
	}
	
	@Override
	public void attackJob(String key) {
		if( key == "z" ) {
			System.out.println("데미지 흡수");
		}
	}
}
