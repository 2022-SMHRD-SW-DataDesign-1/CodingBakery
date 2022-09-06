package Member;

public class MemberDTO {

	// 필드
	private String name;
	private int phone;

	// get, set 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return phone;
	}

	public void setNum(int phone) {
		this.phone = phone;
	}

	// 회원등록 메소드
	public MemberDTO(int num, String name) {
		super();
		this.name = name;
		this.phone = num;
	}

	// 로그인 메소드
	public MemberDTO(int num) {
		super();
		this.phone = num;
	}

}
