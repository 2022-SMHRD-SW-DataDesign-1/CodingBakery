package Quiz;

public class Quiz55 extends QuizDAO {


	public boolean isCorr(String input) {
		this.result = input.equals(answer);
		return result;
	}

	public void qarr() {
		for (int i = 0; i < Qarr.length; i++) {
			for (int j = 0; j < Qarr[i].length; j++) {
				if (result == true) {
					System.out.println("O\t");
				} else {
					System.out.println("X\t");
				}
			}
			System.out.println("");
		}

	}

}
