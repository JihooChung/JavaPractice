package chap2_practice;

import java.util.Scanner;

public class CalcSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����>>");
		int num1 = scanner.nextInt();
		String calc = scanner.next();
		int num2 = scanner.nextInt();
		
		switch(calc) {
		case "+":
			System.out.println(num1 + calc + num2 + "�� ��� ����� " + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + calc + num2 + "�� ��� ����� " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + calc + num2 + "�� ��� ����� " + (num1*num2));
			break;
		case "/":
			if(num2 == 0) System.out.println("0���� ���� �� �����ϴ�.");
			else System.out.println(num1 + calc + num2 + "�� ��� ����� " + (num1/num2));
			break;
		default: System.out.println("�߸��� ������ �Դϴ�.");
		}
		scanner.close();
	}
}
