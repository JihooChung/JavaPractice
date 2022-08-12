package chap2_practice;

import java.util.Scanner;

public class ManyThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = -12;
		
		System.out.println((n>5)?n:5);
		
		System.out.println("\"를 출력하려면 \\다음에 \"를 붙여 \\\"과 같이 하시면 됩니다.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 중에 하나를 입력하세요. : ");
			
		String in = scanner.next();
		int temp=0;
		
		switch(in) {
		case "가위": 
			temp=1;
			break;
		case "바위" : 
			temp=2;
			break;
		case "보" : 
			temp=3;
			break;
		default : 
			System.out.println("잘못입력하셨음 삡삡 그래서 temp 변함없음");
			break;		
		}
		System.out.println("temp = " + temp);
		
		scanner.close();
	}

}
