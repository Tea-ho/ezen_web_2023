package Day15.Ex08.MVC패턴;

import java.util.ArrayList;

public class MemberController {
	
	// 싱글톤 적용
	private static MemberController control = new MemberController();
	private MemberController() {}
	public static MemberController getInstance() {
		return control;
	}	
	
	public boolean signup( String mID, String mPW ) {
		// 1. 유효성 검사 pass
		
		// 2. 객체화
		MemberDTO dto = new MemberDTO(0, mID, mPW);
		
		// 3. 해당 객체를 DB에 저장 [ DAO호출 ]
		boolean result = MemberDAO.getInstance().signup(dto);
		return result;
	}
	
	public ArrayList<MemberDTO> list() {
		
		ArrayList<MemberDTO> result = MemberDAO.getInstance().list();
		// 해석: 모든 회원을 호출하는 DAO 메소드 결과 저장
		
		return result;
		// View에 저장된 ArrayList result 전달
	}
	
	public boolean update( int mNo, String mPW ) {
		return MemberDAO.getInstance().update(mNo, mPW);
		// 해석: MemberDAO 클래스의 update 메소드에 매개변수를 전달하고, 반환된 값을 그대로 리턴
	}
	
	public boolean delete( int mNo ) {
		return MemberDAO.getInstance().delete(mNo);
		// 해석: MemberDAO 클래스의 delete 메소드에 매개변수를 전달하고, 반환된 값을 그대로 리턴
	}
}
