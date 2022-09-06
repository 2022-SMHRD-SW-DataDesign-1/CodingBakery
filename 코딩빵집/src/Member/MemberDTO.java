package Member;

public class MemberDTO {

	private String name;
	int phone;

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

	public MemberDTO(String name, int phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public MemberDTO(int phone) {
		super();
		this.phone = phone;
	}

}
