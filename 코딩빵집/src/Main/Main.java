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

		music.m1();
		System.out.println();
		System.out.println("게임을 시작하시겠습니까?");
		System.out.print("[1]시작 [2]종료 : ");
		int game = sc.nextInt();
		System.out.println();
		int[][] QuizArr = new int[5][5];
		int ox = 1;
		int score=0;
		
		while (true) {

			if (game == 1) { // 게임시작
				System.out.println("선택하시오");
				System.out.print("[1]회원등록 [2]로그인 [3]랭킹조회 [4]게임종료 : ");
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
						System.out.print("[1]난센스 [2]사자성어 [3]초성퀴즈 [4]영어단어 : ");
						int quiz = sc.nextInt();

						if (quiz == 1) { // 난센스
							for (int i = 0; i < 5; i++) {
								for (int j = 0; j < 5; j++) {
									QuizArr[i][j] = ox++;
								}
							}
							System.out.println("당신의 센스를 뽐내는 타임~~마!");
							System.out.println("!!!!주의!!!!!");
							System.out.println("정답에 띄어쓰기를 하지 않습니다");
							pan.bingopan();
							int bingocnt = 0;
							while (true) {
								bingocnt = 0;
								System.out.println("골라골라~~~? 원하는 번호를 골라~~~?");
								int num = sc.nextInt();
								System.out.println();

								qdao.getQuizNon(num);
								System.out.println("");

								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
									music.m3();
								} else {
									System.out.println("땡!!!!!!!");
									music.m4();
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
								}

								bingocnt = bingoCnt(QuizArr, bingocnt);

								if (bingocnt == 3) {
									System.out.println("빙고 3줄 성공!!!!! 100점 획득!!!");
									music.m2();
									System.out.println("당신 센스가 좀 넘치는걸~~");
									pan.bingo3();
									score += 100;
									rdao.rankInsert(phone, score);
									break;
								}
							}
						} // 넌센스 종료
						else if (quiz == 2) { // 사자성어
							for (int i = 0; i < 5; i++) {
								for (int j = 0; j < 5; j++) {
									QuizArr[i][j] = ox++;
								}
							}
							System.out.println("당신의 지식을 뽐내는 타임~~마! ");
							System.out.println("생각보다 어려울껄???? 우리는 힌트가 없거든");
							// 사자성어 빙고판 출력
							pan.bingopan();
							int bingocnt = 0;
							while (true) {
								bingocnt = 0;
								System.out.println("골라골라~~~? 원하는 번호를 골라~~~?");
								int num = sc.nextInt();
								System.out.println();
								qdao.getQuizIdi(num);
								System.out.println("");

								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
									music.m3();
								} else {
									System.out.println("땡!!!!!!!");
									music.m4();
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
								}

								bingocnt = bingoCnt(QuizArr, bingocnt);

								if (bingocnt == 3) {
									System.out.println("빙고 3줄 성공!!!!! 100점 획득!!!");
									music.m2();
									System.out.println("넌 정말 똑똑하구나~!~!~!~!");
									pan.bingo3();
									score += 100;
									rdao.rankInsert(phone, score);
									break;
								}
							}

						} // 사자성어 종료

						else if (quiz == 3) { // 초성퀴즈
							for (int i = 0; i < 5; i++) {
								for (int j = 0; j < 5; j++) {
									QuizArr[i][j] = ox++;
								}
							}
							System.out.println("컴퓨터의 마음을 읽는 타임~~마!");
							System.out.println("주제는 음식!! 다 맞춘다면 당신은 쩝쩝박사!!");
							pan.bingopan();
							int bingocnt = 0;
							while (true) {
								bingocnt = 0;
								System.out.println("골라골라~~~? 원하는 번호를 골라~~~?");
								int num = sc.nextInt();
								System.out.println();

								qdao.getQuizCho(num);
								System.out.println("");

								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
									music.m3();
								} else {
									System.out.println("땡!!!!!!!");
									music.m4();
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
								}

								bingocnt = bingoCnt(QuizArr, bingocnt);

								if (bingocnt == 3) {
									System.out.println("빙고 3줄 성공!!!!! 100점 획득!!!");
									music.m2();
									System.out.println("!축! 당신을 쩝쩝박사로 임명합니다");
									pan.bingo3();
									score += 100;
									rdao.rankInsert(phone, score);
									break;
								}
							}
						} // 초성퀴즈 종료

						else if (quiz == 4) { // 영어퀴즈
							for (int i = 0; i < 5; i++) {
								for (int j = 0; j < 5; j++) {
									QuizArr[i][j] = ox++;
								}
							}
							System.out.println("당신의 영어실력을 뽐낼차례! 영단어풀기 타임~~마!");
							System.out.println("생각보다 어려울 수 이써요~~");
							pan.bingopan();
							int bingocnt = 0;
							while (true) {
								bingocnt = 0;
								System.out.println("골라골라~~~? 원하는 번호를 골라~~~?");
								int num = sc.nextInt();
								System.out.println();

								qdao.getQuizEng(num);
								System.out.println("");

								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
									music.m3();
								} else {
									System.out.println("땡!!!!!!!");
									music.m4();
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
								}

								bingocnt = bingoCnt(QuizArr, bingocnt);

								if (bingocnt == 3) {
									System.out.println("빙고 3줄 성공!!!!! 100점 획득!!!");
									System.out.println("꽤 많이 알고있네요*^^*");
									music.m2();
									pan.bingo3();
									score += 100;
									rdao.rankInsert(phone, score);
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
				} else if(choice ==4) {
					System.out.println("게임 종료.");
					System.out.println();
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.");
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