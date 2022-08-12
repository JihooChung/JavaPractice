package chap2_practice;

import java.util.Scanner;

public class TwoRect {

	public static boolean inRect(int x, int y) {
		if((x>=100 && x<=200) && (y>=100 && y<=200))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
		int x2 = scanner.nextInt(); 
		int y2 = scanner.nextInt();
		
		boolean judge1 = inRect(x1,y1);
		boolean judge2 = inRect(x1,y2);
		boolean judge3 = inRect(x2,y1);
		boolean judge4 = inRect(x2,y2);
		
		if ((judge1 == true)||(judge2 == true)||(judge3 == true)||(judge4 == true)) 
			System.out.println("입력하신 사각형은 두 점 (100,100), (200,200)으로 이루어진 사각형과 충돌합니다.");
		else System.out.println("입력하신 사각형은 두 점 (100,100), (200,200)으로 이루어진 사각형과 충돌하지 않습니다.");
			
		scanner.close();
	}
}
