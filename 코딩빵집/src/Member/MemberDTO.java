package Member;

public class MemberDTO {

	private String name;
	int phone;

	public String getName() {
		return name;
	}

	public int getPhone() {
		return phone;
	}

	public MemberDTO(int phone, String name) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public MemberDTO(int phone) {
		super();
		this.phone = phone;
	}

}
