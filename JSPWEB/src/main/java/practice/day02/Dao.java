package practice.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	private static Dao dao = new Dao();
	public static Dao getInstance() { return dao; }
	
	private Dao() {
		try {
			// 웹서버 작업 시, 해당 mysql 드라이버[라이브러리] 찾기!
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jspweb",
					"root",
					"1234"
					);
			System.out.println("연동 성공");
			
		} catch(Exception e) { System.err.println("예외 발생:" + e); }		
	}
	
	
	public boolean setData(
			String data1, String data2, double data3, int data4, String data5,
			String data6, String data7, boolean data8, String data9, String data10
			) {
		
		String sql = "insert into ex2 values(?,?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, data1);
			ps.setString(2, data2);
			ps.setDouble(3, data3);
			ps.setInt(4, data4);
			ps.setString(5, data5);
			ps.setString(6, data6);
			ps.setString(7, data7);
			ps.setBoolean(8, data8);
			ps.setString(9, data9);
			ps.setString(10, data10);
			ps.executeUpdate(); return true;
		} catch(Exception e) { System.out.println("예외발생:" + e);} return false;
		
		
	}
	
	
}
