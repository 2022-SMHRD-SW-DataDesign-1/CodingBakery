package Main;

import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import Rank.Rankview;
import ����.image;
import ����.story;


public class Main {

	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		Rankview rank = new Rankview();
		image img = new image();
		Scanner sc = new Scanner(System.in);
		story title = new story();
		
		title.title();
		
		while (true) {
			System.out.println("�����Ͻÿ�");
			System.out.print("[1]ȸ�����  [2]�α���  [3]��ŷ��ȸ  [4]����");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int number = sc.nextInt();

				lm.InsertCon(name, number);

			} else if (choice == 2) {
				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int number = sc.nextInt();

				lm.LoginCon(name, number);
			} else if (choice == 3) {
				System.out.println("��ŷ�� ��ȸ�մϴ�.");
				System.out.print("��ȸ�� ���ѹ�");
				int number = sc.nextInt();

				lm.SelectCon(number);
			} else if (choice == 4) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}

}
