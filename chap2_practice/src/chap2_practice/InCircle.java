package chap2_practice;

import java.util.Scanner;

public class InCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>> ");
		Double centerx = scanner.nextDouble();
		Double centery = scanner.nextDouble();
		Double radius = scanner.nextDouble();
		
		System.out.print("�� �Է�>> ");
		Double x = scanner.nextDouble();
		Double y = scanner.nextDouble();
		
		if((x-centerx)*(x-centerx) +(y-centery)*(y-centery)<=radius*radius)
			System.out.println("�� (" + x + "," + y + ")�� �� �ȿ� �ִ�.");
		else System.out.println("�� (" + x + "," + y + ")�� �� �ۿ� �ִ�.");
			
		scanner.close();
	}

}
