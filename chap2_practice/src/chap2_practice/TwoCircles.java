package chap2_practice;

import java.util.Scanner;

public class TwoCircles {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int centerX1 = scanner.nextInt();
		int centerY1 = scanner.nextInt();
		double radius1 = scanner.nextDouble(); //이후 실수와 값을 비교할 것을 고려하여 실수로 입력을 받음
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int centerX2 = scanner.nextInt();
		int centerY2 = scanner.nextInt();
		double radius2 = scanner.nextDouble();
		
		double length = Math.sqrt((centerX1-centerX2)*(centerX1-centerX2) 
								+ (centerY1-centerY2)*(centerY1-centerY2));
		
		if(length <= (radius1 + radius2))
			System.out.println("두 원은 서로 겹친다.");
		else System.out.println("두 원은 서로 겹치지 않는다.");
		
		scanner.close();
	}

}
