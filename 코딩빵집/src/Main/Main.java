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

		title.title(); // 코딩빵집 타이틀 출력

		while (true) {
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
				System.out.println("[1]매장식사 [2]포장");
				int order = sc.nextInt();

				if (order == 1) { // 매장식사
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트");
					int menu = sc.nextInt();

					if (menu == 1) { // 단품
						// 빵 출력하기
						System.out.println("당신의 센스를 뽐내는 타임~~마");
					} else { // 세트
						// 빵 출력하기
						System.out.println("세뚜세뚜를 즐기고 싶다면?");
						// 음료 출력하기
						// 가격 출력하기
					}
				} else { // 포장
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트");
					int menu = sc.nextInt();

					if (menu == 1) { // 단품
						// 빵 출력하기
						System.out.println("당신의 센스를 뽐내는 타임~~마");
					} else { // 세트
						// 빵 출력하기
						System.out.println("세뚜세뚜를 즐기고 싶다면?");
						// 음료 출력하기
						// 가격 출력하기
					}
				}
			} else if (choice == 2) {
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("폰번호 입력 : ");
				int phone = sc.nextInt();

				lm.LoginCon(phone, name);
				System.out.println();

				System.out.println("주문 하시겠습니까? ");
				System.out.println("[1]매장식사 [2]포장");
				int order = sc.nextInt();

				if (order == 1) { // 매장식사
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트");
					int menu = sc.nextInt();

					if (menu == 1) { // 단품
						// 빵 출력하기
						System.out.println("당신의 센스를 뽐내는 타임~~마");
						// 가격 출력하기
					} else { // 세트
						// 빵 출력하기
						System.out.println("세뚜세뚜를 즐기고 싶다면?");
						// 음료 출력하기
						// 가격 출력하기
					}
				} else { // 포장
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트");
					int menu = sc.nextInt();

					if (menu == 1) { // 단품
						// 빵 출력하기
						System.out.println("당신의 센스를 뽐내는 타임~~마");
						// 가격 출력하기
					} else { // 세트
						// 빵 출력하기
						System.out.println("세뚜세뚜를 즐기고 싶다면?");
						// 음료 출력하기
						// 가격 출력하기
					}
					rdao.rankInsert(phone, score);
				}
			} else if (choice == 3) {
				System.out.println("랭킹을 조회합니다.");
				rank.rankView();
			} else if (choice == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 눌렀습니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
