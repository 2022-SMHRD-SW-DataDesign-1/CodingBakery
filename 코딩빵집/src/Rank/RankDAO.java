package Rank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RankDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	RankDTO rdto = null;
	
	public int rankInsert(int a, int b) {
		int cnt = 0;

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

		try {
//			a = rdto.getPhone();
//			b = rdto.getScore();
			String sql = "insert into rank values(?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, a);
			psmt.setInt(2, b);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
