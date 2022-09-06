package Main;

import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import Rank.Rankview;

public class Main {

	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		Rankview rank = new Rankview();
		Scanner sc = new Scanner(System.in);

		System.out.println("코딩빵집");
		System.out.println("샌드위치를 먹으려는 자, 센스를 갖춰라!!");
		System.out.println("샌드위치의 토핑을 추가하고 싶으면 넌센스의 정답을 맞춰야 한다");
		System.out.println("센스가 없는 당신, 샌드위치 빵만 먹게 될 지어다~~~~.");
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
				System.out.print("죄회할 폰넘버");
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
