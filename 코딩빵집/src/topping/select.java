//package topping;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import javax.naming.spi.DirStateFactory.Result;
//
//public class select {
//
//	public static void main(String[] args) {
//
//		Connection conn = null;
//		PreparedStatement psmt = null;
//		Result rs = null;
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			
//			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
//			String db_id = "campus_g_0830_3";
//			String db_pw = "smhrd3";
//			
//			conn = DriverManager.getConnection(url, db_id, db_pw);
//			
//			String sql = "select * from price_list";
//			psmt = conn.prepareStatement(sql);
//			
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				String id = rs.getString(1); // id는 첫번째 컬럼
//				String pw = rs.getString(2);
//				String name = rs.getString(3);
//				int age = rs.getInt(4);
//				System.out.printf("%s\t%s\t%s\t%d\n", id, pw, name, age);
//			}
//
//		} catch (ClassNotFoundException e) {
//			System.out.println("동적 로딩 실패");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// 4. 종료
//			try {
//				if (rs != null) {
//					rs.close();
//				}
//				if (psmt != null) {
//					psmt.close();
//				}
//				if (conn != null) {
//					conn.close();
//				}
//			} catch (Exception e2) {
//				e2.printStackTrace();
//
//			}
//		}
//
//	}
//
//}
