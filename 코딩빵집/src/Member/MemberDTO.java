package Member;

public class MemberDTO {

	// �ʵ�
	private String name;
	private int phone;

	// get, set �޼ҵ�
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

	// ȸ����� �޼ҵ�
	public MemberDTO(int num, String name) {
		super();
		this.name = name;
		this.phone = num;
	}

	// �α��� �޼ҵ�
	public MemberDTO(int num) {
		super();
		this.phone = num;
	}

}
