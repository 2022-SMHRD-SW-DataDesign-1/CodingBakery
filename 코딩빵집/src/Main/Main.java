package Main;

import java.sql.Connection;
import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import Quiz.QuizDAO;
import Rank.RankDAO;
import Rank.RankDTO;
import Rank.Rankview;


import topping.image;
import topping.story;

import Controller.Controller;

import topping.image;
import topping.story;

public class Main {

	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		Rankview rank = new Rankview();

		RankDAO rdao = new RankDAO();
		RankDTO rdto;
		Controller lm = new Controller();
		
		

		Scanner sc = new Scanner(System.in);
		story title = new story();

		QuizDAO qdao = new QuizDAO();
		
		
		int cnt = 0;

		title.title(); // �ڵ����� Ÿ��Ʋ ���

		while (true) {
			int score = 0;

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
				System.out.print("[1]����Ļ� [2]���� ");
				int order = sc.nextInt();

				if (order == 1) { // ����Ļ�
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ ");
					int menu = sc.nextInt();
					if (menu == 1) { // ��ǰ
						extracted(sc, qdao);
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						extracted(sc, qdao);
					}
				} else { // ����
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ ");
					int menu = sc.nextInt();
					if (menu == 1) { // ��ǰ
						extracted(sc, qdao);
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						extracted(sc, qdao);
					}
					cnt = rdao.rankInsert(phone, score);
				}

			} else if (choice == 2) { 
				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int phone = sc.nextInt();
				lm.LoginCon(phone, name);
				System.out.println();
				System.out.println("�ֹ� �Ͻðڽ��ϱ�? ");
				System.out.print("[1]����Ļ� [2]���� ");
				int order = sc.nextInt();
				System.out.println();
				if (order == 1) { // ����Ļ�
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ ");
					int menu = sc.nextInt();
					if (menu == 1) { // ��ǰ
						extracted(sc, qdao);
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						extracted(sc, qdao);
					}
				} else { // ����
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ ");
					int menu = sc.nextInt();
					if (menu == 1) { // ��ǰ
						extracted(sc, qdao);
					} else { // ��Ʈ
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						// �� ����ϱ�
						extracted(sc, qdao);
						// ���� ����ϱ�
						// ���� ����ϱ�
					}
					cnt = rdao.rankInsert(phone, score);
					System.out.println();
				}
			} else if (choice == 3) {
				System.out.println("��ŷ�� ��ȸ�մϴ�.");
				rank.rankView();
			} else if (choice == 4) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�߸� �������ϴ�.");
				System.out.println();
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

	public static void extracted(Scanner sc, QuizDAO qdao) {
		while (true) {
			System.out.println("�� ������ �߰��Ͻðڽ��ϱ�?");
			System.out.println("[1]�� [2]ġ�� [3]��ä [4]�ҽ� [5]�߰�����");

			int add = sc.nextInt();

			if (add > 0 && add < 5) {
				System.out.println("����� ������ �˳��� Ÿ��~~��");
				System.out.println();
				qdao.getQuiz(0);
				System.out.println();
				System.out.println("���� �Է� >> ");
				String inputAnswer = sc.next();
				qdao.isCorr(inputAnswer);
			} else {
				System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
				System.out.println();
				break;
			}
		}
	}
	
	
	
}