package chap2_practice;

import java.util.Scanner;

public class CalcIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("����>>");
	int num1 = scanner.nextInt();
	String calc = scanner.next();
	int num2 = scanner.nextInt();
	
	if(calc.equals("+"))
		System.out.println(num1 + calc + num2 + "�� ��� ����� " + (num1+num2));
	else if(calc.equals("-"))
		System.out.println(num1 + calc + num2 + "�� ��� ����� " + (num1-num2));
	else if(calc.equals("*"))
		System.out.println(num1 + calc + num2 + "�� ��� ����� " + (num1*num2));
	else if(calc.equals("/")) {
		if(num2 == 0)
			System.out.println("0���� ���� �� �����ϴ�.");
		else System.out.println(num1 + calc + num2 + "�� ��� ����� " + (num1/num2));
	}
	else System.out.println("�߸��� ������ �Դϴ�.");
	scanner.close();
	}

}
