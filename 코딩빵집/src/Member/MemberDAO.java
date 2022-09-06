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

	public boolean login(String name, int phone) {

		connect();

		try {
			String sql = "select * From member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setInt(2, phone);

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = true; // cnt = 1;
			} else {
				result = false; // cnt = 0
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result; // result -> cnt
	}

	public int insert(MemberDTO dto) { // void -> int
		int cnt = 0;// 초반에(insert는 행의 값이 변경 int 타입으로 값 리턴)

		// 1. 동적로딩(선행작업 필요)
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

		return cnt;
	}

	public int update(MemberDTO dto) {
		int cnt = 0; // 얘도 전역변수로 만들어 버리기
		connect();

		try {
			String name = dto.getName();
			int phone = dto.getPhone();

			String sql = "update member set pw = ? where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setInt(2, phone);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return cnt;
	}

	public void selectAll() {
		connect();

		try {
			String sql = "select * from member";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			System.out.println("ID\tPW\tNAME\tAGE");
			while (rs.next()) {
				String name = rs.getString(1);
				int phone = rs.getInt(2);

				System.out.printf("%s\t%d\n", name, phone);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void select(String name) {
		connect();

		try {
			String sql = "select * from member where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			rs = psmt.executeQuery();

			System.out.println("NAME\tP");
			while (rs.next()) {
				String name1 = rs.getString(1);
				int phone = rs.getInt(2);

				System.out.printf("%s\t%d\n", name, phone);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int delete(String name) {
		int cnt = 0;
		connect();

		try {
			String sql = "delete from member where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
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
}
