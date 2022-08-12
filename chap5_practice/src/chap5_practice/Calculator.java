package chap5_practice;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		
		switch(c) {
		
		case "+":
			Add calcA = new Add();
			calcA.setValue(a,b);
			System.out.println(calcA.calculate());
			break;
		case "-":
			Sub calcS = new Sub();
			calcS.setValue(a,b);
			System.out.println(calcS.calculate());
			break;
		case "*":
			Mul calcM = new Mul();
			calcM.setValue(a,b);
			System.out.println(calcM.calculate());
			break;
		case "/":
			Div calcD = new Div();
			calcD.setValue(a,b);
			System.out.println(calcD.calculate());
			break;
		}
		
		
		scanner.close();
	}

}
