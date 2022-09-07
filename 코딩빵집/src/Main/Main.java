package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Member.MemberDAO;
import Member.MemberDTO;
import Quiz.QuizDAO;
import Rank.RankDAO;
import Rank.RankDTO;
import Rank.Rankview;
import Title.bingo;
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
		bingo pan = new bingo();
		QuizDAO qdao = new QuizDAO();

		Scanner sc = new Scanner(System.in);
		story.title1();
		System.out.println();

		System.out.println();
		System.out.println("게임을 시작하시겠습니까?");
		System.out.print("[1]시작 [2]종료 : ");
		int game = sc.nextInt();
		System.out.println();
		int[][] QuizArr = new int[5][5];
		int ox = 1;
		ArrayList<Integer> selNum = new ArrayList<Integer>();
		while (true) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					QuizArr[i][j] = ox++;
				}
			}

			if (game == 1) { // 게임시작
				System.out.println("선택하시오");
				System.out.print("[1]회원등록 [2]로그인 [3]랭킹조회 : ");
				int choice = sc.nextInt();

				if (choice == 1) { // 회원등록
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("폰번호 입력 : ");
					int phone = sc.nextInt();
					int Join = lm.InsertCon(phone, name);
					System.out.println();

				} else if (choice == 2) {
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("폰번호 입력 : ");
					int phone = sc.nextInt();
					boolean Login = lm.LoginCon(phone, name);
					if (Login == true) {
						System.out.println();
						System.out.println("4가지 퀴즈 중 하나를 풀어 봐봐봐봐");
						System.out.print("[1]넌센스 [2]사자성어 [3]초성퀴즈 [4]영어단어 : ");
						int quiz = sc.nextInt();

						if (quiz == 1) { // 넌센스
							System.out.println("당신의 센스를 뽐내는 타임~~마!");
							pan.bingopan();
							int bingocnt = 0;
							while (true) {
								bingocnt = 0;
								System.out.println("골라골라~~~?");
								int num = sc.nextInt();
								;

								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();

								qdao.getQuizNon(num);
								System.out.println("");

								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 5; j++) {
										if (QuizArr[i][j] == num && qdao.isCorr(inputAnswer) == true) {
											QuizArr[i][j] = 0;
										}
									}
								}

								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 5; j++) {
										if (QuizArr[i][j] == 0) {
											System.out.print("□\t");
										} else {
											System.out.print("■\t");
										}
									}
									System.out.println("");
									// 빙고의 갯수가 3개가 되면 종료
								}

								bingocnt = bingoCnt(QuizArr, bingocnt);

								if (bingocnt == 3) {
									System.out.println("빙고 3줄 성공");
									pan.bingo3();
									break;
								}
							}
						} // 넌센스 종료
						else if (quiz == 2) { // 사자성어
							System.out.println("당신의 지식을 뽐내는 타임~~마! ");
							// 사자성어 빙고판 출력
							pan.bingopan();
							int bingocnt = 0;
							while (true) {
								bingocnt = 0;
								System.out.println("골라골라~~~?");
								int num = sc.nextInt();
								;

								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();

								qdao.getQuizIdi(num);
								System.out.println("");

								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 5; j++) {
										if (QuizArr[i][j] == num && qdao.isCorr(inputAnswer) == true) {
											QuizArr[i][j] = 0;
										}
									}
								}

								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 5; j++) {
										if (QuizArr[i][j] == 0) {
											System.out.print("□\t");
										} else {
											System.out.print("■\t");
										}
									}
									System.out.println("");
									// 빙고의 갯수가 3개가 되면 종료
								}

								bingocnt = bingoCnt(QuizArr, bingocnt);

								if (bingocnt == 3) {
									System.out.println("빙고 3줄 성공");
									pan.bingo3();
									break;
								}
							}

						} // 사자성어 종료

						else if (quiz == 3) { // 초성퀴즈
							System.out.println("컴퓨터의 마음을 읽는 타임~~마!");
							// 초성퀴즈 빙고판 출력
							pan.bingopan();
							int bingocnt = 0;
							while (true) {
								bingocnt = 0;
								System.out.println("골라골라~~~?");
								int num = sc.nextInt();
								;

								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();

								qdao.getQuizCho(num);
								System.out.println("");

								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 5; j++) {
										if (QuizArr[i][j] == num && qdao.isCorr(inputAnswer) == true) {
											QuizArr[i][j] = 0;
										}
									}
								}

								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 5; j++) {
										if (QuizArr[i][j] == 0) {
											System.out.print("□\t");
										} else {
											System.out.print("■\t");
										}
									}
									System.out.println("");
									// 빙고의 갯수가 3개가 되면 종료
								}

								bingocnt = bingoCnt(QuizArr, bingocnt);

								if (bingocnt == 3) {
									System.out.println("빙고 3줄 성공");
									pan.bingo3();
									break;
								}
							}
						} // 초성퀴즈 종료

						else if (quiz == 4) { // 영어퀴즈
							System.out.println("유치원생도 풀수있다는 영단어풀기 타임~~마!");
							pan.bingopan();
							int bingocnt = 0;
							while (true) {
								bingocnt = 0;
								System.out.println("골라골라~~~?");
								int num = sc.nextInt();
								;

								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();

								qdao.getQuizEng(num);
								System.out.println("");

								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 5; j++) {
										if (QuizArr[i][j] == num && qdao.isCorr(inputAnswer) == true) {
											QuizArr[i][j] = 0;
										}
									}
								}

								for (int i = 0; i < 5; i++) {
									for (int j = 0; j < 5; j++) {
										if (QuizArr[i][j] == 0) {
											System.out.print("□\t");
										} else {
											System.out.print("■\t");
										}
									}
									System.out.println("");
									// 빙고의 갯수가 3개가 되면 종료
								}

								bingocnt = bingoCnt(QuizArr, bingocnt);

								if (bingocnt == 3) {
									System.out.println("빙고 3줄 성공");
									pan.bingo3();
									break;
								}
							}
						} // 영어퀴즈 종료

						else { // 잘못누르면
							System.out.println("다시 선택하세요!!!");

						} // 종료
					}
				} else if (choice == 3) {
					System.out.println("랭킹을 조회합니다.");
					rank.rankView();
					System.out.println();
				} else {
					System.out.println("잘못 눌렀습니다.");
					System.out.println();
				}
			} else {
				System.out.println("게임 종료");
				break;
			}
		}
	}

	private static int bingoCnt(int[][] QuizArr, int bingocnt) {
		if (QuizArr[0][0] + QuizArr[0][1] + QuizArr[0][2] + QuizArr[0][3]
				+ QuizArr[0][4] == 0) {
			bingocnt++;
		}
		if (QuizArr[1][0] + QuizArr[1][1] + QuizArr[1][2] + QuizArr[1][3]
				+ QuizArr[1][4] == 0) {
			bingocnt++;
		}
		if (QuizArr[2][0] + QuizArr[2][1] + QuizArr[2][2] + QuizArr[2][3]
				+ QuizArr[2][4] == 0) {
			bingocnt++;
		}
		if (QuizArr[3][0] + QuizArr[3][1] + QuizArr[3][2] + QuizArr[3][3]
				+ QuizArr[3][4] == 0) {
			bingocnt++;
		}
		if (QuizArr[4][0] + QuizArr[4][1] + QuizArr[4][2] + QuizArr[4][3]
				+ QuizArr[4][4] == 0) {
			bingocnt++;
		}
		if (QuizArr[0][0] + QuizArr[1][0] + QuizArr[2][0] + QuizArr[3][0]
				+ QuizArr[4][0] == 0) {
			bingocnt++;
		}
		if (QuizArr[0][1] + QuizArr[1][1] + QuizArr[2][1] + QuizArr[3][1]
				+ QuizArr[4][1] == 0) {
			bingocnt++;
		}
		if (QuizArr[0][2] + QuizArr[1][2] + QuizArr[2][2] + QuizArr[3][2]
				+ QuizArr[4][2] == 0) {
			bingocnt++;
		}
		if (QuizArr[0][3] + QuizArr[1][3] + QuizArr[2][3] + QuizArr[3][3]
				+ QuizArr[4][3] == 0) {
			bingocnt++;
		}
		if (QuizArr[0][4] + QuizArr[1][4] + QuizArr[2][4] + QuizArr[3][4]
				+ QuizArr[4][4] == 0) {
			bingocnt++;
		}
		if (QuizArr[0][0] + QuizArr[1][1] + QuizArr[2][2] + QuizArr[3][3]
				+ QuizArr[4][4] == 0) {
			bingocnt++;
		}
		if (QuizArr[0][4] + QuizArr[1][3] + QuizArr[2][2] + QuizArr[3][1]
				+ QuizArr[4][0] == 0) {
			bingocnt++;
		}
		return bingocnt;
	}
}