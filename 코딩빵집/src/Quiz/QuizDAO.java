package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuizDAO {

	Connection conn;
	PreparedStatement psmt = null;
	ResultSet rs;
	boolean result;
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
	public void getQuizNon(int qnum) {
		connect();

		try {
			String sql = "select * from nonsense where n_num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qnum);

			rs = psmt.executeQuery();

			System.out.println("Quiz");
			while (rs.next()) {
				String quiz = rs.getString(2);
				this.quiz = quiz;
				String answer = rs.getString(3);
				this.answer = answer;

				System.out.printf("%s", quiz);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void getQuizCho(int qnum) {
		connect();

		try {
			String sql = "select * from choseong where c_num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qnum);

			rs = psmt.executeQuery();

			System.out.println("Quiz");
			while (rs.next()) {
				String quiz = rs.getString(2);
				this.quiz = quiz;
				String answer = rs.getString(3);
				this.answer = answer;

				System.out.printf("%s", quiz);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void getQuizEng(int qnum) {
		connect();

		try {
			String sql = "select * from eng where eng_num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qnum);

			rs = psmt.executeQuery();

			System.out.println("Quiz");
			while (rs.next()) {
				String quiz = rs.getString(2);
				this.quiz = quiz;
				String answer = rs.getString(3);
				this.answer = answer;

				System.out.printf("%s", quiz);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void getQuizIdi(int qnum) {
		connect();

		try {
			String sql = "select * from idiom where i_num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qnum);

			rs = psmt.executeQuery();

			System.out.println("Quiz");
			while (rs.next()) {
				String quiz = rs.getString(2);
				this.quiz = quiz;
				String answer = rs.getString(3);
				this.answer = answer;

				System.out.printf("%s", quiz);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean isCorr(String input) {
		this.result = input.equals(answer);
		return result;
	}

	
	
	
}

