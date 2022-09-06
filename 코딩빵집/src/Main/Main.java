package Main;

import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import Rank.Rankview;
import 토핑.image;
import 토핑.story;


public class Main {

	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		Rankview rank = new Rankview();
		image img = new image();
		Scanner sc = new Scanner(System.in);
		story title = new story();
		
		title.title();
		
		while (true) {
			System.out.println("선택하시오");
			System.out.print("[1]회원등록  [2]로그인  [3]랭킹조회  [4]종료");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("폰번호 입력 : ");
				int number = sc.nextInt();

				lm.InsertCon(name, number);

			} else if (choice == 2) {
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("폰번호 입력 : ");
				int number = sc.nextInt();

				lm.LoginCon(name, number);
			} else if (choice == 3) {
				System.out.println("랭킹을 조회합니다.");
				System.out.print("조회할 폰넘버");
				int number = sc.nextInt();

				lm.SelectCon(number);
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
