package Day20.gallery.Controller;

import Day20.gallery.Model.DAO.MemberDAO;
import Day20.gallery.Model.DTO.MemberDTO;

public class MController {

	private int loginSession = 0;
	
	private static MController mController = new MController();
	private MController() {}
	public static MController getInstance() { return mController; }
	
	// 1-1. 회원가입
	public int signup( String mid, String mpw, String mname, String mphone ) {
		
		if ( MemberDAO.getInstance().idcheck(mid) == 2 ) { return 2; }
		MemberDTO mDTO = new MemberDTO(0, mid, mpw, mname, mphone);
		
		return MemberDAO.getInstance().signup(mDTO);
	}
	
	// 로그인
	public boolean login( String mid, String mpw ) {
		
		int result = MemberDAO.getInstance().login(mid, mpw);
		
		if(result == 0) { return false; }
		else {
			loginSession = result;
			return true;
		}
	}
	
	public int getLoginSession() {
		return loginSession;
	}
	public void setLoginSession(int loginSession) {
		this.loginSession = loginSession;
	}
}
