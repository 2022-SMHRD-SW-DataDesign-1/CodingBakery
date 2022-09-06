package Main;

import java.sql.Connection;
import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import Rank.Rankview;

import Controller.Controller;

public class Main {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		Rankview rank = new Rankview();
		Controller lm = new Controller();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�ڵ�����");
		System.out.println("������ġ�� �������� ��, ������ �����!!");
		System.out.println("������ġ�� ������ �߰��ϰ� ������ �ͼ����� ������ ����� �Ѵ�");
		System.out.println("������ ���� ���, ������ġ ���� �԰� �� �����~~~~.");
		while(true) {
			System.out.println("�����Ͻÿ�");
			System.out.print("[1]ȸ�����  [2]�α���  [3]��ŷ��ȸ  [4]����");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
				System.out.print("�̸� �Է� : ");  
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int number = sc.nextInt();
				
				lm.InsertCon(name, number);
				System.out.println("�ֹ� �Ͻðڽ��ϱ�? ");
				System.out.println("[1]����Ļ� [2]����");
				int number2 = sc.nextInt();
				if(number2 == 1) {
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int number3 = sc.nextInt();
					if(number3 == 1) {
						System.out.println("��� ���� �����߰�");
					}else {
						System.out.println("��� ���� �����߰�");
						
					}
				}else {
					System.out.println("�޴�����");
					System.out.print("[1]�� ��ǰ [2]�� ��Ʈ");
					int number3 = sc.nextInt();	
					if(number ==3) {
						System.out.println("��� ���� �����߰�");
					}else {
						System.out.println("��� ���� �����߰�");
					}
				}
			}else if(choice == 2) {
				System.out.print("�̸� �Է� : ");  
				String name = sc.next();
				System.out.print("����ȣ �Է� : ");
				int number = sc.nextInt();
				
				lm.LoginCon(name,number);
				System.out.println("�ֹ� �Ͻðڽ��ϱ�? ");
				System.out.println("[1]����Ļ� [2]����");
			}else if(choice == 3) {
				System.out.println("��ŷ�� ��ȸ�մϴ�.");
				rank.rankView();
			}
			else if(choice == 4) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		
		

	}

}
