package Controller;

public class Controller {

	// Controller의 역할
import model.MemberDAO;
import model.MemberDTO;


public class LoginManagment {

	
	MemberDAO dao = new MemberDAO();

	
	MemberDTO dto; 

	public void LoginCon(int phone, String name) {
		
		boolean result = dao.login(phone, name);

		if (result) { 
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

	public void InsertCon(int phone, String name) {
		dto = new MemberDTO(phone, name);

		int cnt = dao.insert(dto); 

		if (cnt > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}

}


