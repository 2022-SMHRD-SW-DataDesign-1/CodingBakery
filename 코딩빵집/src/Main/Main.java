package Main;

import java.sql.Connection;
import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import Rank.RankDAO;
import Rank.Rankview;

import Controller.Controller;

import ����.image;
import ����.story;

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
		int score = 100;
		title.title();

		while (true) {
			System.out.println("�����Ͻÿ�");
			System.out.print("[1]ȸ�����  [2]�α���  [3]��ŷ��ȸ  [4]����  ");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int number = sc.nextInt();

				lm.InsertCon(number, name);
				System.out.println("�ֹ� �Ͻðڽ��ϱ�? ");
				System.out.println("[1]����Ļ� [2]����");
				int number2 = sc.nextInt();
				if (number2 == 1) {
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int number3 = sc.nextInt();
					if (number3 == 1) {
						System.out.println("��� ���� �����߰�");
						rdao.rankInsert(number, score);
					} else {
						System.out.println("��� ���� �����߰�");
						rdao.rankInsert(number, score);
					}
				} else {
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int number3 = sc.nextInt();
					if (number == 2) {
						System.out.println("��� ���� �����߰�");
						rdao.rankInsert(number, score);
					} else {
						System.out.println("��� ���� �����߰�");
						rdao.rankInsert(number, score);
					}
				}
			} else if (choice == 2) {
				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int number = sc.nextInt();

				lm.LoginCon(number, name);

				System.out.println("�ֹ� �Ͻðڽ��ϱ�? ");
				System.out.println("[1]����Ļ� [2]����");
				int number2 = sc.nextInt();
				if (number2 == 1) {
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int number3 = sc.nextInt();
					if (number3 == 1) {
						System.out.println("��� ���� �����߰�");
						rdao.rankInsert(number, score);
					} else {
						System.out.println("��� ���� �����߰�");
						rdao.rankInsert(number, score);
					}
				} else {
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int number3 = sc.nextInt();
					if (number == 2) {
						System.out.println("��� ���� �����߰�");
						rdao.rankInsert(number, score);
					} else {
						System.out.println("��� ���� �����߰�");
						rdao.rankInsert(number, score);
					}
				}
			} else if (choice == 3) {
				System.out.println("��ŷ�� ��ȸ�մϴ�.");
				rank.rankView();

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
