package Member;

public class MemberDTO {

	// �ʵ�
	private String name;
	private int num;

	// get, set �޼ҵ�
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

	// ȸ����� �޼ҵ�
	public MemberDTO(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	// �α��� �޼ҵ�
	public MemberDTO(int num) {
		super();
		this.num = num;
	}

}
