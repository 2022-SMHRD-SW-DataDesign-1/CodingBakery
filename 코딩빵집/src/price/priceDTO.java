package price;

public class priceDTO {
	private int Pnum;
	private int price;
	


	public priceDTO(int pnum, int price) {
		super();
		this.Pnum = pnum;
		this.price = price;
	}



	public int getPrice() {
		return price;
	}

}
