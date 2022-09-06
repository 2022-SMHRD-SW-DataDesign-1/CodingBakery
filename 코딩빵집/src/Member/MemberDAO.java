package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	Connection conn;
	PreparedStatement psmt = null;
	ResultSet rs;
	boolean result;

	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_g_0830_3";
			String db_pw = "smhrd3";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			System.out.println("로딩실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
	}
	

	public void getClose() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean login(int phone, String name) {

		connect();

		try {
			String sql = "select * From member where name = ? and phone = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setInt(2, phone);

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = true; 
			} else {
				result = false; 
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result; 
	}

	public int insert(MemberDTO dto) { 
		int cnt = 0;

		connect();

		try {
			String name = dto.getName();
			int phone = dto.getPhone();

			String sql = "insert into member values(?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setInt(2, phone);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//	
		return cnt; 
	}
}
