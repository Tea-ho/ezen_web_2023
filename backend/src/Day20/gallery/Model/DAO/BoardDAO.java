package Day20.gallery.Model.DAO;

import java.util.ArrayList;

import Day20.gallery.Model.DTO.BoardDTO;
import Day20.gallery.Model.DTO.CategoryDTO;

public class BoardDAO extends DAO {

	private static BoardDAO bdao = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() { return bdao; }
	
	// 카테고리 추가 SQL
	public boolean categoryAdd( String cname ) {
		String sql = "insert into category(cname)value(?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cname);
			ps.executeUpdate();
			return true;

		}catch(Exception e) { System.out.println("예외 발생:" + e); }
		return false;
	}
	
	// 모든 카테고리 호출 SQL
	public ArrayList<CategoryDTO>  categoryPrint() {
		
		ArrayList<CategoryDTO> clist = new ArrayList<>();
		
		String sql = "select * from category";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while( rs.next() ) {
				CategoryDTO dto = new CategoryDTO( rs.getInt(1), rs.getString(2) ); 
				clist.add(dto);
			}
			return clist;
		}catch(Exception e) { System.out.println("예외 발생:" + e); }
		
		return null;
		
	}
	
	// 게시물 등록
	public boolean boardAdd( String btitle, String bcon, int mno, int cNo ) {
		String sql = "insert into board( btitle, bcon, mno, cno) values(?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, btitle);
			ps.setString(2, bcon);
			ps.setInt(3, mno);
			ps.setInt(4, cNo);
			ps.executeUpdate();
			return true;
		} catch(Exception e) { System.out.println("예외 발생:" + e); }
		return false;
	}
	
	// 최신 게시물 3개 출력
	public ArrayList<BoardDTO> boardPrintRecent(){

		ArrayList<BoardDTO> blist = new ArrayList<>();
		
		String sql = "select b.bno, b.btitle, b.bcon, b.bdate, b.bview, m.mid, c.cname\r\n"
				+ "	from board b, member m, category c\r\n"
				+ "    where b.mno = m.mno and b.cno = c.cno\r\n"
				+ "    order by b.bdate desc limit 3";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				BoardDTO dto = new BoardDTO( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7) );
				blist.add(dto);
			}
			return blist;
		}catch(Exception e) { System.out.println("예외 발생:" + e); }
		return null;
	}
	
	// 해당 카테고리의 모든 게시물 출력
	public ArrayList<BoardDTO> boardPrint( int cno ){
		
		ArrayList<BoardDTO> blist = new ArrayList<>();
		
		String sql = "select b.bno, b.btitle, b.bcon, b.bdate, b.bview, m.mid, c.cname\r\n"
				+ "	from board b, member m, category c\r\n"
				+ "    where b.mno = m.mno and b.cno = c.cno\r\n"
				+ "    order by b.bdate desc limit 3";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, cno);
			rs = ps.executeQuery();
			while( rs.next() ) {
				BoardDTO dto = new BoardDTO( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7) );
				blist.add(dto);
			}
			return blist;
		}catch(Exception e) { System.out.println("예외 발생:" + e); }
		return null;
	}
	// 해당 게시물 출력
	
	
	
	
}
