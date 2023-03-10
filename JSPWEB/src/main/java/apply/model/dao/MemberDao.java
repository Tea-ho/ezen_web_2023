package apply.model.dao;

import java.util.ArrayList;

import apply.model.dto.MemberDto;

public class MemberDao extends Dao {
	
	private static MemberDao dao = new MemberDao();
	private MemberDao() {}
	public static MemberDao getInstance() { return dao; }
	
	// 1. 회원가입
	public boolean signup( MemberDto dto ) {
		
		String sql = "insert into member(mid,mpw,mimg,memail)values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getMid());
			ps.setString(2, dto.getMpw());
			ps.setString(3, dto.getMimg());
			ps.setString(4, dto.getMemail());
			ps.executeUpdate(); return true;
		} catch (Exception e) { System.out.println("예외 발생: " + e); }
		return false;
	}
	
	// 2. 모든 회원 출력
	public ArrayList<MemberDto> mList(){
		ArrayList<MemberDto> list = new ArrayList<>();
		String sql = "select * from member";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto(
									rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)
								);
				list.add(dto);
			}
		} catch (Exception e) { System.out.println("예외 발생: " + e); }
		return list;
	}
	
	// 3. 아이디 중복검사
	public boolean idCheck( String mid ) {
		String sql = "select * from member where mid = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , mid );
			rs = ps.executeQuery();
			if ( rs.next() ) { return true;}
		} catch(Exception e) { System.out.println( "예외발생: " + e); }
		return false;
	}
	
	// 4. 로그인
	public boolean login( String mid, String mpw) {
		
		String sql = "select * from member where mid =? and mpw =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, mpw);
			rs = ps.executeQuery();
			
			if ( rs.next() ) { return true; }
		} catch(Exception e) { System.out.println( "예외발생: " + e); }
		return false;
	}
	
	// 5. 회원 정보 전송
	public MemberDto getMember( String mid ) {
		
		String sql = "select * from member where mid =?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			rs = ps.executeQuery();
			if( rs.next() ) {
				MemberDto dto = new MemberDto( rs.getInt(1), rs.getString(2), null, rs.getString(4), rs.getString(5) );  
				return dto;
			} 
		} catch(Exception e) { System.out.println( "예외발생: " + e); }
		return null;
	}
	
	// 6. 아이디 찾기
	public String findID( String memail ) {
		
		String sql = "select mid from member where memail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
			rs = ps.executeQuery();
			if( rs.next() ) { return rs.getString(1); }
		} catch(Exception e) { System.out.println( "예외발생: " + e); }
		return "false";
	}
	
	
	// 7. 비밀번호 찾기
	public String findPW( String mid, String memail, String updatePW ) {	
		String sql = "select mno from member where mid = ? and memail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, memail);
			rs = ps.executeQuery();
			if( rs.next() ) { 
				
				sql = "update member set mpw = ? where mno = ? ";
				ps = con.prepareStatement(sql);
				ps.setString(1, updatePW);
				ps.setInt(2, rs.getInt(1));
				int result = ps.executeUpdate();
				if ( result == 1 ) {
					
					// 실제 이메일 활용할 경우 코드
					// new MemberDto().sendEmail(memail, updatePW);
					// return "true";
					
					return updatePW;
					
				}
			}
		} catch(Exception e) { System.out.println( "예외발생: " + e); }
		return "false";
	}
}
