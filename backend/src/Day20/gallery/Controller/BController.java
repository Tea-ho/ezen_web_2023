package Day20.gallery.Controller;

import java.util.ArrayList;

import Day20.gallery.Model.DAO.BoardDAO;
import Day20.gallery.Model.DTO.BoardDTO;
import Day20.gallery.Model.DTO.CategoryDTO;

public class BController {
	
	private static BController bController = new BController();
	private BController() {}
	public static BController getInstance() { return bController; }
	
	public boolean categoryAdd( String cname ) {
		return BoardDAO.getInstance().categoryAdd(cname);
	}
	
	public ArrayList<CategoryDTO>  categoryPrint() {
		return BoardDAO.getInstance().categoryPrint();
		
	}
	
	public boolean boardAdd( String btitle, String bcontent, int mno, int cNo ) {
		return BoardDAO.getInstance().boardAdd(btitle, bcontent, mno, cNo);
	}
	
	public ArrayList<BoardDTO> boardPrintRecent(){
		return BoardDAO.getInstance().boardPrintRecent();
	}
	
	public ArrayList<BoardDTO> boardPrint( int cno ){
		return BoardDAO.getInstance().boardPrint(cno);
	}
	
}
