package Main;

import java.sql.Connection;
import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import Rank.RankDAO;
import Rank.Rankview;
import topping.image;
import topping.story;
import Controller.Controller;

public class Main {

	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		Rankview rank = new Rankview();
		RankDAO rdao = new RankDAO();
		Controller lm = new Controller();
		image img = new image();
		Scanner sc = new Scanner(System.in);
		story title = new story();

		int score = 0;

		title.title(); // �ڵ����� Ÿ��Ʋ ���

		while (true) {
			System.out.println("�����Ͻÿ�");
			System.out.print("[1]ȸ�����  [2]�α���  [3]��ŷ��ȸ  [4]����  ");
			int choice = sc.nextInt();

			if (choice == 1) { // ȸ�����
				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int phone = sc.nextInt();

				lm.InsertCon(phone, name);
				System.out.println();

				System.out.println("�ֹ� �Ͻðڽ��ϱ�? ");
				System.out.println("[1]����Ļ� [2]����");
				int order = sc.nextInt();

				if (order == 1) { // ����Ļ�
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int menu = sc.nextInt();

					if (menu == 1) { // ��ǰ
						// �� ����ϱ�
						System.out.println("����� ������ �˳��� Ÿ��~~��");
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						// ���� ����ϱ�
						// ���� ����ϱ�
					}
				} else { // ����
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int menu = sc.nextInt();

					if (menu == 1) { // ��ǰ
						// �� ����ϱ�
						System.out.println("����� ������ �˳��� Ÿ��~~��");
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						// ���� ����ϱ�
						// ���� ����ϱ�
					}
				}
			} else if (choice == 2) {
				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int phone = sc.nextInt();

				lm.LoginCon(phone, name);
				System.out.println();

				System.out.println("�ֹ� �Ͻðڽ��ϱ�? ");
				System.out.println("[1]����Ļ� [2]����");
				int order = sc.nextInt();

				if (order == 1) { // ����Ļ�
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int menu = sc.nextInt();

					if (menu == 1) { // ��ǰ
						// �� ����ϱ�
						System.out.println("����� ������ �˳��� Ÿ��~~��");
						// ���� ����ϱ�
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						// ���� ����ϱ�
						// ���� ����ϱ�
					}
				} else { // ����
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int menu = sc.nextInt();

					if (menu == 1) { // ��ǰ
						// �� ����ϱ�
						System.out.println("����� ������ �˳��� Ÿ��~~��");
						// ���� ����ϱ�
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						// ���� ����ϱ�
						// ���� ����ϱ�
					}
					rdao.rankInsert(phone, score);
				}
			} else if (choice == 3) {
				System.out.println("��ŷ�� ��ȸ�մϴ�.");
				rank.rankView();
			} else if (choice == 4) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�߸� �������ϴ�.");
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
