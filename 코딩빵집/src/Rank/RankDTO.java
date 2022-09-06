package Rank;

public class RankDTO {

	private int phone;
	int score;

	public RankDTO(int phone, int score) {
		super();
		this.phone = phone;
		this.score = score;
	}

	public int getPhone() {
		return phone;
	}

	public int getScore() {
		return score;
	}

}
