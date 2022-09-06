package Main;

import java.sql.Connection;
import java.util.ArrayList;
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
		image img = new image();

		Scanner sc = new Scanner(System.in);
		story title = new story();

		QuizDAO qdao = new QuizDAO();

		int cnt = 0;
		title.title(); // �ڵ����� Ÿ��Ʋ ���

		int score = 0;
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
				System.out.print("[1]����Ļ� [2]���� ");
				int order = sc.nextInt();

				if (order == 1) { // ����Ļ�
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ ");
					int menu = sc.nextInt();

					System.out.println(img.img1(6));
					if (menu == 1) { // ��ǰ
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
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
									System.out.println("���� ȹ�� ����!!");
									System.out.println("�ƽ�~ 10�� ȹ��!!!");
									score += 10;
									System.out.println(img.img1(add - 1));
								} else {
									System.out.println("��!!!!!!!!!");
									System.out.println("�ٽ� �����ϼ���!");
								}

							} else {
								System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
								System.out.println("������ �ݾ� : ");
								break;
							}

						}
					} else { // ��Ʈ
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						System.out.println(img.img1(6));
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
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
									System.out.println("���� ȹ�� ����!!");
									System.out.println("�ƽ�~ 10�� ȹ��!!!");
									score += 10;
									System.out.println(img.img1(add - 1));
								} else {
									System.out.println("��!!!!!!!!!");
									System.out.println("�ٽ� �����ϼ���!");
								}

							} else {
								System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
								System.out.println("������ �ݾ� : ");
								break;
							}
						}
					}
				} else { // ����
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ ");
					int menu = sc.nextInt();
					if (menu == 1) { // ��ǰ
						System.out.println(img.img1(6));
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
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
									System.out.println("���� ȹ�� ����!!");
									System.out.println("�ƽ�~ 10�� ȹ��!!!");
									score += 10;
									System.out.println(img.img1(add - 1));
								} else {
									System.out.println("��!!!!!!!!!");
									System.out.println("�ٽ� �����ϼ���!");
								}

							} else {
								System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
								System.out.println("������ �ݾ� : ");
								break;
							}
						}
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						System.out.println(img.img1(5));
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
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
									System.out.println("���� ȹ�� ����!!");
									System.out.println("�ƽ�~ 10�� ȹ��!!!");
									score += 10;
									System.out.println(img.img1(add - 1));
								} else {
									System.out.println("��!!!!!!!!!");
									System.out.println("�ٽ� �����ϼ���!");
								}

							} else {
								System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
								System.out.println("������ �ݾ� : ");
								break;
							}

						}
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
						System.out.println(img.img1(6));
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

								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
									System.out.println("���� ȹ�� ����!!");
									System.out.println("�ƽ�~ 10�� ȹ��!!!");
									score += 10;
									System.out.println(img.img1(add - 1));
								} else {
									System.out.println("��!!!!!!!!!");
									System.out.println("�ٽ� �����ϼ���!");
								}

							} else {
								System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
								System.out.println("������ �ݾ� : ");
								break;
							}

						}
					} else { // ��Ʈ
						// �� ����ϱ�
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
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
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
									System.out.println("���� ȹ�� ����!!");
									System.out.println("�ƽ�~ 10�� ȹ��!!!");
									score += 10;
									System.out.println(img.img1(add - 1));
								} else {
									System.out.println("��!!!!!!!!!");
									System.out.println("�ٽ� �����ϼ���!");
								}

							} else {
								System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
								System.out.println("������ �ݾ� : ");
								break;
							}

						}
					}
				} else { // ����
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ ");
					int menu = sc.nextInt();
					if (menu == 1) { // ��ǰ
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
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
									System.out.println("���� ȹ�� ����!!");
									System.out.println("�ƽ�~ 10�� ȹ��!!!");
									score += 10;
									System.out.println(img.img1(add - 1));
								} else {
									System.out.println("��!!!!!!!!!");
									System.out.println("�ٽ� �����ϼ���!");
								}

							} else {
								System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
								System.out.println("������ �ݾ� : ");
								break;
							}
						}
					} else { // ��Ʈ
						System.out.println("���Ѽ��Ѹ� ���� �ʹٸ�?");
						// �� ����ϱ�
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
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("�����Դϴ�!");
									System.out.println("���� ȹ�� ����!!");
									System.out.println("�ƽ�~ 10�� ȹ��!!!");
									score += 10;
									System.out.println(img.img1(add - 1));
								} else {
									System.out.println("��!!!!!!!!!");
									System.out.println("�ٽ� �����ϼ���!");
								}

							} else {
								System.out.println("�ֹ��Ϸ�! �����Ұ�~?");
								System.out.println("������ �ݾ� : ");
								break;
							}

						}
						// ���� ����ϱ�
						// ���� ����ϱ�
					}

					cnt = rdao.rankInsert(phone, score);
					System.out.println();
				}
			} else if (choice == 3) {
				System.out.println("��ŷ�� ��ȸ�մϴ�.");
				rank.rankView();
				System.out.println();

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
}