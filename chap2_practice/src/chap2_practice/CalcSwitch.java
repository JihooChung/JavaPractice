package chap2_practice;

import java.util.Scanner;

public class CalcSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>>");
		int num1 = scanner.nextInt();
		String calc = scanner.next();
		int num2 = scanner.nextInt();
		
		switch(calc) {
		case "+":
			System.out.println(num1 + calc + num2 + "의 계산 결과는 " + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + calc + num2 + "의 계산 결과는 " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + calc + num2 + "의 계산 결과는 " + (num1*num2));
			break;
		case "/":
			if(num2 == 0) System.out.println("0으로 나눌 수 없습니다.");
			else System.out.println(num1 + calc + num2 + "의 계산 결과는 " + (num1/num2));
			break;
		default: System.out.println("잘못된 연산자 입니다.");
		}
		scanner.close();
	}
}
