package Controller;

public class Controller {

	// Controller�� ����
import model.MemberDAO;
import model.MemberDTO;


public class LoginManagment {

	
	MemberDAO dao = new MemberDAO();

	
	MemberDTO dto; 

	public void LoginCon(int phone, String name) {
		
		boolean result = dao.login(phone, name);

		if (result) { 
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
	}

	public void InsertCon(int phone, String name) {
		dto = new MemberDTO(phone, name);

		int cnt = dao.insert(dto); 

		if (cnt > 0) {
			System.out.println("ȸ������ ����");
		} else {
			System.out.println("ȸ������ ����");
		}
	}

}


