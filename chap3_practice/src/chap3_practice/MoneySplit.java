package chap3_practice;

import java.util.Scanner;

public class MoneySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int n : unit){
			if(money/n !=0 )
				System.out.println(n + "�� ¥�� : " + money/n + "��");
			money%=n;
		}
		scanner.close();
	}
}
