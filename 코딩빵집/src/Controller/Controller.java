package Controller;

import Member.MemberDAO;
import Member.MemberDTO;

public class Controller {



	MemberDAO dao = new MemberDAO();

	MemberDTO dto;

	public boolean LoginCon(int phone, String name) {

		boolean result = dao.login(phone, name);

		if (result) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		return result;
	}

	public int InsertCon(int phone, String name) {
		dto = new MemberDTO(phone, name);

		int cnt = 0;
		cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
		return  cnt;
	}
	
	

}
