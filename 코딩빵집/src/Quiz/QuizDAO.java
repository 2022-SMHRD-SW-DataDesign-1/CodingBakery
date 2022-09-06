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
	int sleq = 0;
	Random rd = new Random();
	String quiz = null;
	String answer = null;

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
			qnum = rd.nextInt(20) + 1;
			this.sleq = qnum;
			String sql = "select quiz from quiz_list where qnum = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qnum);

			rs = psmt.executeQuery();

			System.out.println("Quiz");
			while (rs.next()) {
				String quiz = rs.getString(2);
				this.quiz = quiz;
				String answer = rs.getString(2);
				this.answer = answer;

				System.out.printf("%s", quiz);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean isCorr(String input) {

		return input.equals(answer);

	}

}
