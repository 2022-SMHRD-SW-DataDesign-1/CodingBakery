package Rank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Rankview {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public void rankView() {
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

		String sql = "select * from (select * from rank order by score desc) where rownum<=10";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			System.out.print("      -회원번호-\t-점수-\n");
			while (rs.next()) {
				System.out.print(rs.getString(1)+"\t\t");
				System.out.println(rs.getString(2)+"\t");
			}
		} catch (SQLException e) {
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}

	}
}