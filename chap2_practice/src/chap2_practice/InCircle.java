package chap2_practice;

import java.util.Scanner;

public class InCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>> ");
		Double centerx = scanner.nextDouble();
		Double centery = scanner.nextDouble();
		Double radius = scanner.nextDouble();
		
		System.out.print("점 입력>> ");
		Double x = scanner.nextDouble();
		Double y = scanner.nextDouble();
		
		if((x-centerx)*(x-centerx) +(y-centery)*(y-centery)<=radius*radius)
			System.out.println("점 (" + x + "," + y + ")는 원 안에 있다.");
		else System.out.println("점 (" + x + "," + y + ")는 원 밖에 있다.");
			
		scanner.close();
	}

}
