package Day20.gallery.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class DAO {
	
	// 1. JDBC 인터페이스 3개 선언
	protected Connection con;			// DB 연동
	protected PreparedStatement ps;	// SQL 조작
	protected ResultSet rs;			// SQL 결과 조작
	
	public DAO() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/boardDB", "root", "1234"
					);
		} catch(Exception e) { System.out.println("예외 발생:" + e);}
		
	}
	
	
}
