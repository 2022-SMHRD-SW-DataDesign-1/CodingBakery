package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	boolean result;
	
	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "campus_g_0830_3";
			String pw = "smhrd3";
			
			conn = DriverManager.getConnection(url, id, pw);
			
		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
	}
	
	public int insert(MemberDTO dto) {
		int cnt = 0;

		connect();

		try {
			String name = dto.getName();
			int phone = dto.getNum();

			String sql = "insert into member values(?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setInt(2, phone);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cnt;

	}


}
