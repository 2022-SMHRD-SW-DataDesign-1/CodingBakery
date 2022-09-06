package Main;

import java.sql.Connection;
import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import Rank.RankDAO;
import Rank.Rankview;

import Controller.Controller;

import 토핑.image;
import 토핑.story;

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
			System.out.println("선택하시오");
			System.out.print("[1]회원등록  [2]로그인  [3]랭킹조회  [4]종료  ");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("폰번호 입력 : ");
				int number = sc.nextInt();

				lm.InsertCon(number, name);
				System.out.println("주문 하시겠습니까? ");
				System.out.println("[1]매장식사 [2]포장");
				int number2 = sc.nextInt();
				if (number2 == 1) {
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트");
					int number3 = sc.nextInt();
					if (number3 == 1) {
						System.out.println("퀴즈를 통한 토핑추가");
						rdao.rankInsert(number, score);
					} else {
						System.out.println("퀴즈를 통한 토핑추가");
						rdao.rankInsert(number, score);
					}
				} else {
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트");
					int number3 = sc.nextInt();
					if (number == 2) {
						System.out.println("퀴즈를 통한 토핑추가");
						rdao.rankInsert(number, score);
					} else {
						System.out.println("퀴즈를 통한 토핑추가");
						rdao.rankInsert(number, score);
					}
				}
			} else if (choice == 2) {
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("폰번호 입력 : ");
				int number = sc.nextInt();

				lm.LoginCon(number, name);

				System.out.println("주문 하시겠습니까? ");
				System.out.println("[1]매장식사 [2]포장");
				int number2 = sc.nextInt();
				if (number2 == 1) {
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트");
					int number3 = sc.nextInt();
					if (number3 == 1) {
						System.out.println("퀴즈를 통한 토핑추가");
						rdao.rankInsert(number, score);
					} else {
						System.out.println("퀴즈를 통한 토핑추가");
						rdao.rankInsert(number, score);
					}
				} else {
					System.out.println("메뉴선택");
					System.out.print("[1]빵 단품 [2]빵 세트");
					int number3 = sc.nextInt();
					if (number == 2) {
						System.out.println("퀴즈를 통한 토핑추가");
						rdao.rankInsert(number, score);
					} else {
						System.out.println("퀴즈를 통한 토핑추가");
						rdao.rankInsert(number, score);
					}
				}
			} else if (choice == 3) {
				System.out.println("랭킹을 조회합니다.");
				rank.rankView();

			} else if (choice == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

}
