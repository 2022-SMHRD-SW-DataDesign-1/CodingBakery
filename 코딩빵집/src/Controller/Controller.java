package Controller;

import Member.MemberDAO;
import Member.MemberDTO;

public class Controller {



	MemberDAO dao = new MemberDAO();

	MemberDTO dto;

	public boolean LoginCon(int phone, String name) {

		boolean result = dao.login(phone, name);

		if (result) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
		return result;
	}

	public int InsertCon(int phone, String name) {
		dto = new MemberDTO(phone, name);

		int cnt = 0;
		cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}
		return  cnt;
	}
	
	

}
