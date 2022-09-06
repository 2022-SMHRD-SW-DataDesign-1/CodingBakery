package Member;

public class MemberDTO {

	// ÇÊµå
	private String name;
	private int phone;

	public MemberDTO(String name, int phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
