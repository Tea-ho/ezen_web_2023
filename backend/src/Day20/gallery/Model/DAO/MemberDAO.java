package Day20.gallery.Model.DAO;

import Day20.gallery.Model.DTO.MemberDTO;

public class MemberDAO extends DAO {
	
	private static MemberDAO mdao = new MemberDAO();
	private MemberDAO() {}
	public static MemberDAO getInstance() { return mdao; }
	
	// 아이디 중복체크
	public int idcheck( String mid ) {
		String sql = "selecet * from member where mid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			rs = ps.executeQuery();
			if( rs.next() ) { return 1; }
			else { return 2; }
		}
		catch(Exception e) { System.out.println("예외발생: " + e);}
		return 3;
	}
	
	// 회원가입
	public int signup( MemberDTO mDto ) {
		String sql = "insert into member(mid, mpw, mname, mphone) values (?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mDto.getMid());
			ps.setString(2, mDto.getMpw());
			ps.setString(3, mDto.getMname());
			ps.setString(4, mDto.getMphone());
			ps.executeUpdate();
			return 1;
		}catch(Exception e) { System.out.println("예외발생: " + e); }
		return 3;
	}
	
	public int login( String mid , String mpw ) {
		String sql = "select * from member where mid = ? and mpw = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , mid );
			ps.setString( 2 , mpw );
			rs = ps.executeQuery();
			if( rs.next() ) {
				// 만약에 다음 레코드가 존재하면 [ 로그인 성공 ]
				return rs.getInt( 1 );	// 검색된 레코드에서 첫번째 필드[회원번호] 반환 
			}else {
				// 다음 레코드가 존재하지 않으면 [ 로그인 실패 ] 
				return 0; 
			}
		}catch (Exception e) {System.out.println(e);}
		return 0;
	}
	
}
