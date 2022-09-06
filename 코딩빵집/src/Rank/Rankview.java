package Rank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Rankview {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void rankView() {
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
		
		String sql = "select * from (select * from rank order by score desc) where rownum<=10";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			System.out.print("-회원번호-\t-점수-\n");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t\t");
				System.out.println(rs.getString(2) + "\t");
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