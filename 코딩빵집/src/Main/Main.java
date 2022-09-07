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

			System.out.println("게임을 시작하시겠습니까?");
			System.out.print("[1]시작 [2]종료 :\t");
			int game = sc.nextInt();

			if (game == 1) { // 게임시작
				// title()
				System.out.println("선택하시오");
				System.out.print("[1]회원등록 [2]로그인 [3]랭킹조회 :\t");
				int choice = sc.nextInt();

				if (choice == 1) { // 회원등록
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("폰번호 입력 : ");
					int phone = sc.nextInt();
					int Join = lm.InsertCon(phone, name);

					if (Join > 0) {
						System.out.println();
						System.out.println("4가지 퀴즈 중 하나를 풀어 봐봐봐봐");
						System.out.print("[1]넌센스 [2]사자성어 [3]초성퀴즈 [4]영어단어 : \t");
						int quiz = sc.nextInt();

						if (quiz == 1) { // 넌센스
							System.out.println("당신의 센스를 뽐내는 타임~~마!");
							// 넌센스 빙고판 출력

							while (true) {
								System.out.println("몇번을 푸시겠습니까?");
								int num = sc.nextInt();
								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();
								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								// 빙고의 갯수가 3개가 되면 종료
								break;
							}

						} // 넌센스 종료
						else if (quiz == 2) { // 사자성어
							System.out.println("당신의 지식을 뽐내는 타임~~마! ");
							// 사자성어 빙고판 출력
							while (true) {
								System.out.println("몇번을 푸시겠습니까?");
								int num = sc.nextInt();
								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();
								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								// 빙고의 갯수가 3개가 되면 종료
								break;
							}

						} // 사자성어 종료

						else if (quiz == 3) { // 초성퀴즈
							System.out.println("컴퓨터의 마음을 읽는 타임~~마!");
							// 초성퀴즈 빙고판 출력
							while (true) {
								System.out.println("몇번을 푸시겠습니까?");
								int num = sc.nextInt();
								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();
								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								// 빙고의 갯수가 3개가 되면 종료
								break;
							}

						} // 초성퀴즈 종료

						else if (quiz == 4) { // 영어퀴즈
							System.out.println("유치원생도 풀수있다는 영단어풀기 타임~~마!");
							while (true) {
								System.out.println("몇번을 푸시겠습니까?");
								int num = sc.nextInt();
								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();
								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								// 빙고의 갯수가 3개가 되면 종료
								break;
							}

						} // 영어퀴즈 종료

						else { // 잘못누르면
							System.out.println("다시 선택하세요!!!");

						} // 종료
					}
				} else if (choice == 2) {
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("폰번호 입력 : ");
					int phone = sc.nextInt();
					boolean Login = lm.LoginCon(phone, name);
					if (Login == true) {
						System.out.println();
						System.out.println("4가지 퀴즈 중 하나를 풀어 봐봐봐봐");
						System.out.print("[1]넌센스 [2]사자성어 [3]초성퀴즈 [4]영어단어 : \t");
						int quiz = sc.nextInt();

						if (quiz == 1) { // 넌센스
							System.out.println("당신의 센스를 뽐내는 타임~~마!");
							// 넌센스 빙고판 출력
							while (true) {
								System.out.println("몇번을 푸시겠습니까?");
								int num = sc.nextInt();
								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();
								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								// 빙고의 갯수가 3개가 되면 종료
								break;
							}

						} // 넌센스 종료
						else if (quiz == 2) { // 사자성어
							System.out.println("당신의 지식을 뽐내는 타임~~마! ");
							// 사자성어 빙고판 출력
							while (true) {
								System.out.println("몇번을 푸시겠습니까?");
								int num = sc.nextInt();
								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();
								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								// 빙고의 갯수가 3개가 되면 종료
								break;
							}

						} // 사자성어 종료

						else if (quiz == 3) { // 초성퀴즈
							System.out.println("컴퓨터의 마음을 읽는 타임~~마!");
							// 초성퀴즈 빙고판 출력
							while (true) {
								System.out.println("몇번을 푸시겠습니까?");
								int num = sc.nextInt();
								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();
								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								// 빙고의 갯수가 3개가 되면 종료
								break;
							}
						} // 초성퀴즈 종료

						else if (quiz == 4) { // 영어퀴즈
							System.out.println("유치원생도 풀수있다는 영단어풀기 타임~~마!");
							while (true) {
								System.out.println("몇번을 푸시겠습니까?");
								int num = sc.nextInt();
								// 맞는 테이블 가져오기
								// 문제 출력
								System.out.println();
								System.out.println("정답 입력 >> ");
								String inputAnswer = sc.next();
								qdao.isCorr(inputAnswer);
								if (qdao.isCorr(inputAnswer) == true) {
									System.out.println("정답입니다!");
								} else {
									System.out.println("땡!!!!!!!");
								}
								// 빙고의 갯수가 3개가 되면 종료
								break;
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
			}
			System.out.println("게임 종료");
		}
	}
}