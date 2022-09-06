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

	public int rankInsert(RankDTO rankdto) {
		int cnt = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		}
		String db = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_g_0830_3";
		String db_pw = "smhrd3";

		try {
			conn = DriverManager.getConnection(db, db_id, db_pw);
		} catch (SQLException e) {
		}

		try {
			int phone = rankdto.getPhone();
			int score = rankdto.getScore();
			String sql = "insert into rank values(?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, phone);
			psmt.setInt(2, score);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
		} finally {
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

			}
		}
		return cnt;
	}

}
