package ³Í¼¾½ºÄûÁî;

public class QuizDTO {
	private int Qnum;
	private String Quiz;
	private String answer;

	public int getQnum() {
		return Qnum;
	}

	public String getQuiz() {
		return Quiz;
	}

	public String getAnswer() {
		return answer;
	}

	public QuizDTO(int qnum, String quiz, String answer) {
		super();
		this.Qnum = qnum;
		this.Quiz = quiz;
		this.answer = answer;
	}

}
