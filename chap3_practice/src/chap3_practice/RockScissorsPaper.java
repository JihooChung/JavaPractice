package chap3_practice;

import java.util.Scanner;
public class RockScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"����", "����", "��"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			String users = scanner.next();
			
			if(users.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			
			int n = (int)(Math.random()*3);
			System.out.print("����� = " + users + " , ��ǻ�� = " + str[n] + ", ");
			
			if(users.equals(str[n])) {
				System.out.println("�����ϴ�.");
			}
			else if(users.equals("����"))
			{
				if(str[n].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[n].equals("��"))
					System.out.println("����ڰ� �̰���ϴ�.");
			}
			else if(users.equals("����"))
			{
				if(str[n].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if(str[n].equals("��"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(users.equals("��"))
			{
				if(str[n].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[n].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
			}
			scanner.nextLine();				
		}
		scanner.close();

	}

}
