package Day15.Ex01; // Web 개발 시, id/pw 일치 여부 확인 시 자주 사용하는 문법

public class Member {
	
	// 필드 영역
	public String id;
	
	// 생성자 영역
	public Member( String id ) {
		this.id = id;
	}
	
	// 메소드 영역
	@Override
	// boolean equals 메소드 오버라이딩
	public boolean equals(Object obj) {
		
		/* 
		if( obj instanceof Member target) {
			if( id.equals(target.id) ) {
				return true;
			}
		}
		return false;
		*/
		
		if( obj instanceof Member) {
			Member target = (Member)obj;
			if( id.equals(target.id) ) {
				return true;
			} 
		 }
		 return false;		
	}
}
