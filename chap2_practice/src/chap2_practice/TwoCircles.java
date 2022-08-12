package chap2_practice;

import java.util.Scanner;

public class TwoCircles {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int centerX1 = scanner.nextInt();
		int centerY1 = scanner.nextInt();
		double radius1 = scanner.nextDouble(); //���� �Ǽ��� ���� ���� ���� ����Ͽ� �Ǽ��� �Է��� ����
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int centerX2 = scanner.nextInt();
		int centerY2 = scanner.nextInt();
		double radius2 = scanner.nextDouble();
		
		double length = Math.sqrt((centerX1-centerX2)*(centerX1-centerX2) 
								+ (centerY1-centerY2)*(centerY1-centerY2));
		
		if(length <= (radius1 + radius2))
			System.out.println("�� ���� ���� ��ģ��.");
		else System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		scanner.close();
	}

}
