package Member;

public class MemberDTO {

	// 필드
	private String name;
	private int num;

	// get, set 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// 회원등록 메소드
	public MemberDTO(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	// 로그인 메소드
	public MemberDTO(int num) {
		super();
		this.num = num;
	}

}
