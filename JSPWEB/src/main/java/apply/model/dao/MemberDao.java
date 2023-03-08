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
		String sql = "select * from member where mid = '"+mid+"'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if ( rs.next() ) { return true;}
		} catch(Exception e) { System.out.println( "예외발생: " + e); }
		return false;
	}
	
}
