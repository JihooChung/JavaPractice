package chap3_practice;

import java.util.Scanner;

public class MoneySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int n : unit){
			if(money/n !=0 )
				System.out.println(n + "원 짜리 : " + money/n + "개");
			money%=n;
		}
		scanner.close();
	}
}
