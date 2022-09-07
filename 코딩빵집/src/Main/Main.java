package Main;

import java.util.Scanner;

import Controller.Controller;
import Member.MemberDAO;
import Member.MemberDTO;
import Quiz.QuizDAO;
import Rank.RankDAO;
import Rank.RankDTO;
import Rank.Rankview;
import Title.title;

public class Main {

	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		Rankview rank = new Rankview();
		RankDAO rdao = new RankDAO();
		RankDTO rdto;
		Controller lm = new Controller();
		title story = new title();
		QuizDAO qdao = new QuizDAO();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("������ �����Ͻðڽ��ϱ�?");
			System.out.print("[1]���� [2]���� :\t");
			int game = sc.nextInt();

			if (game == 1) { // ���ӽ���
				// title()
				System.out.println("�����Ͻÿ�");
				System.out.print("[1]ȸ����� [2]�α��� [3]��ŷ��ȸ :\t");
				int choice = sc.nextInt();

				if (choice == 1) { // ȸ�����
					System.out.print("�̸� �Է� : ");
					String name = sc.next();
					System.out.print("����ȣ �Է� : ");
					int phone = sc.nextInt();
					int Join = lm.InsertCon(phone, name);

					if (Join > 0) {
						System.out.println();
						System.out.println("4���� ���� �� �ϳ��� Ǯ�� ��������");
						System.out.print("[1]�ͼ��� [2]���ڼ��� [3]�ʼ����� [4]����ܾ� : \t");
						int quiz = sc.nextInt();

						if (quiz == 1) { // �ͼ���
							System.out.println("����� ������ �˳��� Ÿ��~~��!");
							// �ͼ��� ������ ���

							while (true) {
								System.out.println("����� Ǫ�ðڽ��ϱ�?");
								int num = sc.nextInt();
								// �´� ���̺� ��������
								// ���� ���
								System.out.println();
								System.out.println("���� �Է� >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
								} else {
									System.out.println("��!!!!!!!");
								}
								// ������ ������ 3���� �Ǹ� ����
								break;
							}

						} // �ͼ��� ����
						else if (quiz == 2) { // ���ڼ���
							System.out.println("����� ������ �˳��� Ÿ��~~��! ");
							// ���ڼ��� ������ ���
							while (true) {
								System.out.println("����� Ǫ�ðڽ��ϱ�?");
								int num = sc.nextInt();
								// �´� ���̺� ��������
								// ���� ���
								System.out.println();
								System.out.println("���� �Է� >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
								} else {
									System.out.println("��!!!!!!!");
								}
								// ������ ������ 3���� �Ǹ� ����
								break;
							}

						} // ���ڼ��� ����

						else if (quiz == 3) { // �ʼ�����
							System.out.println("��ǻ���� ������ �д� Ÿ��~~��!");
							// �ʼ����� ������ ���
							while (true) {
								System.out.println("����� Ǫ�ðڽ��ϱ�?");
								int num = sc.nextInt();
								// �´� ���̺� ��������
								// ���� ���
								System.out.println();
								System.out.println("���� �Է� >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
								} else {
									System.out.println("��!!!!!!!");
								}
								// ������ ������ 3���� �Ǹ� ����
								break;
							}

						} // �ʼ����� ����

						else if (quiz == 4) { // ��������
							System.out.println("��ġ������ Ǯ���ִٴ� ���ܾ�Ǯ�� Ÿ��~~��!");
							while (true) {
								System.out.println("����� Ǫ�ðڽ��ϱ�?");
								int num = sc.nextInt();
								// �´� ���̺� ��������
								// ���� ���
								System.out.println();
								System.out.println("���� �Է� >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
								} else {
									System.out.println("��!!!!!!!");
								}
								// ������ ������ 3���� �Ǹ� ����
								break;
							}

						} // �������� ����

						else { // �߸�������
							System.out.println("�ٽ� �����ϼ���!!!");

						} // ����
					}
				} else if (choice == 2) {
					System.out.print("�̸� �Է� : ");
					String name = sc.next();
					System.out.print("����ȣ �Է� : ");
					int phone = sc.nextInt();
					boolean Login = lm.LoginCon(phone, name);
					if (Login == true) {
						System.out.println();
						System.out.println("4���� ���� �� �ϳ��� Ǯ�� ��������");
						System.out.print("[1]�ͼ��� [2]���ڼ��� [3]�ʼ����� [4]����ܾ� : \t");
						int quiz = sc.nextInt();

						if (quiz == 1) { // �ͼ���
							System.out.println("����� ������ �˳��� Ÿ��~~��!");
							// �ͼ��� ������ ���
							while (true) {
								System.out.println("����� Ǫ�ðڽ��ϱ�?");
								int num = sc.nextInt();
								// �´� ���̺� ��������
								// ���� ���
								System.out.println();
								System.out.println("���� �Է� >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
								} else {
									System.out.println("��!!!!!!!");
								}
								// ������ ������ 3���� �Ǹ� ����
								break;
							}

						} // �ͼ��� ����
						else if (quiz == 2) { // ���ڼ���
							System.out.println("����� ������ �˳��� Ÿ��~~��! ");
							// ���ڼ��� ������ ���
							while (true) {
								System.out.println("����� Ǫ�ðڽ��ϱ�?");
								int num = sc.nextInt();
								// �´� ���̺� ��������
								// ���� ���
								System.out.println();
								System.out.println("���� �Է� >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
								} else {
									System.out.println("��!!!!!!!");
								}
								// ������ ������ 3���� �Ǹ� ����
								break;
							}

						} // ���ڼ��� ����

						else if (quiz == 3) { // �ʼ�����
							System.out.println("��ǻ���� ������ �д� Ÿ��~~��!");
							// �ʼ����� ������ ���
							while (true) {
								System.out.println("����� Ǫ�ðڽ��ϱ�?");
								int num = sc.nextInt();
								// �´� ���̺� ��������
								// ���� ���
								System.out.println();
								System.out.println("���� �Է� >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
								} else {
									System.out.println("��!!!!!!!");
								}
								// ������ ������ 3���� �Ǹ� ����
								break;
							}
						} // �ʼ����� ����

						else if (quiz == 4) { // ��������
							System.out.println("��ġ������ Ǯ���ִٴ� ���ܾ�Ǯ�� Ÿ��~~��!");
							while (true) {
								System.out.println("����� Ǫ�ðڽ��ϱ�?");
								int num = sc.nextInt();
								// �´� ���̺� ��������
								// ���� ���
								System.out.println();
								System.out.println("���� �Է� >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
								} else {
									System.out.println("��!!!!!!!");
								}
								// ������ ������ 3���� �Ǹ� ����
								break;
							}

						} // �������� ����

						else { // �߸�������
							System.out.println("�ٽ� �����ϼ���!!!");

						} // ����
					}
				} else if (choice == 3) {
					System.out.println("��ŷ�� ��ȸ�մϴ�.");
					rank.rankView();
					System.out.println();
				} else {
					System.out.println("�߸� �������ϴ�.");
					System.out.println();
				}
			}
			System.out.println("���� ����");
		}
	}
}