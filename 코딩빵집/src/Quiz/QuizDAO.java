package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class QuizDAO {

	Connection conn;
	PreparedStatement psmt = null;
	ResultSet rs;
	boolean result;
	int ran = 0;
	int iscor = 0;
	Random rd = new Random();

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

	public void getQuiz(int qnum) {
		connect();

		try {

			String sql2 = "select max(qnum) from quiz_list";
			psmt = conn.prepareStatement(sql2);

			rs = psmt.executeQuery();
			while (rs.next()) {
				ran = rs.getInt(1);
			}

			qnum = rd.nextInt(ran) + 1;
			this.iscor = qnum;
			String sql = "select * from quiz_list where qnum = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qnum);

			rs = psmt.executeQuery();

			System.out.println("Quiz");
			while (rs.next()) {
				String quiz = rs.getString(2);

				System.out.printf("%s", quiz);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean isCorr(String answer, int iscor) {
		connect();
		String cor = null;
		try {
			String sql = "select * from quiz_list where qnum = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, iscor);
			rs = psmt.executeQuery();

			System.out.println("Quiz");
			while (rs.next()) {
				cor = rs.getString(3);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cor.equals(answer);
	}

}
