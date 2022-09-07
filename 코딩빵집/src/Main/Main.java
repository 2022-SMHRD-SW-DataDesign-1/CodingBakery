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

		title.title(); // 코딩빵집 타이틀 출력

		while (true) {
			int score = 0;

			System.out.println("선택하시오");
			System.out.print("[1]회원등록  [2]로그인  [3]랭킹조회  [4]종료  ");
			int choice = sc.nextInt();
			if (choice == 1) { // 회원등록
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("폰번호 입력 : ");
				int phone = sc.nextInt();
				lm.InsertCon(phone, name);

				System.out.println();
				System.out.println("주문 하시겠습니까? ");
				System.out.print("[1]매장식사 [2]포장 ");
				int order = sc.nextInt();

				if (order == 1) { // 매장식사
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트 ");
					int menu = sc.nextInt();
					if (menu == 1) { // 단품
						extracted(sc, qdao);
					} else { // 세트
						// 빵 출력하기
						System.out.println("세뚜세뚜를 즐기고 싶다면?");
						extracted(sc, qdao);
					}
				} else { // 포장
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트 ");
					int menu = sc.nextInt();
					if (menu == 1) { // 단품
						extracted(sc, qdao);
					} else { // 세트
						// 빵 출력하기
						System.out.println("세뚜세뚜를 즐기고 싶다면?");
						extracted(sc, qdao);
					}
					cnt = rdao.rankInsert(phone, score);
				}

			} else if (choice == 2) { 
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("폰번호 입력 : ");
				int phone = sc.nextInt();
				lm.LoginCon(phone, name);
				System.out.println();
				System.out.println("주문 하시겠습니까? ");
				System.out.print("[1]매장식사 [2]포장 ");
				int order = sc.nextInt();
				System.out.println();
				if (order == 1) { // 매장식사
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트 ");
					int menu = sc.nextInt();
					if (menu == 1) { // 단품
						extracted(sc, qdao);
					} else { // 세트
						// 빵 출력하기
						System.out.println("세뚜세뚜를 즐기고 싶다면?");
						extracted(sc, qdao);
					}
				} else { // 포장
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트 ");
					int menu = sc.nextInt();
					if (menu == 1) { // 단품
						extracted(sc, qdao);
					} else { // 세트
						System.out.println("세뚜세뚜를 즐기고 싶다면?");
						// 빵 출력하기
						extracted(sc, qdao);
						// 음료 출력하기
						// 가격 출력하기
					}
					cnt = rdao.rankInsert(phone, score);
					System.out.println();
				}
			} else if (choice == 3) {
				System.out.println("랭킹을 조회합니다.");
				rank.rankView();
			} else if (choice == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 눌렀습니다.");
				System.out.println();
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void extracted(Scanner sc, QuizDAO qdao) {
		while (true) {
			System.out.println("빵 토핑을 추가하시겠습니까?");
			System.out.println("[1]햄 [2]치즈 [3]야채 [4]소스 [5]추가안함");

			int add = sc.nextInt();

			if (add > 0 && add < 5) {
				System.out.println("당신의 센스를 뽐내는 타임~~마");
				System.out.println();
				qdao.getQuiz(0);
				System.out.println();
				System.out.println("정답 입력 >> ");
				String inputAnswer = sc.next();
				qdao.isCorr(inputAnswer);
			} else {
				System.out.println("주문완료! 퍽퍽할걸~?");
				System.out.println();
				break;
			}
		}
	}
	
	
	
}