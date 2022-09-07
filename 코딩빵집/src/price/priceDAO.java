package price;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class priceDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int sleq = 0;
	int price = 0;

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

	public void getPrice(int pnum) {
		connect();
		try {

			String sql = "select * from price_list where pnum=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, pnum);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int price = rs.getInt(3);
				this.price = price;

				System.out.printf("%d", price);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
