package chap2_practice;

import java.util.Scanner;

public class ManyThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = -12;
		
		System.out.println((n>5)?n:5);
		
		System.out.println("\"�� ����Ϸ��� \\������ \"�� �ٿ� \\\"�� ���� �Ͻø� �˴ϴ�.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� �� �߿� �ϳ��� �Է��ϼ���. : ");
			
		String in = scanner.next();
		int temp=0;
		
		switch(in) {
		case "����": 
			temp=1;
			break;
		case "����" : 
			temp=2;
			break;
		case "��" : 
			temp=3;
			break;
		default : 
			System.out.println("�߸��Է��ϼ��� ��� �׷��� temp ���Ծ���");
			break;		
		}
		System.out.println("temp = " + temp);
		
		scanner.close();
	}

}
