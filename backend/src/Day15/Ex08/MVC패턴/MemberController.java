package Day15.Ex08.MVC패턴;

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
	
	public void list() {
		
	}
	
	
}
