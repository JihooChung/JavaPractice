package chap2_practice;

import java.util.Scanner;

public class ClapGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("1~99������ ������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int ten = num/10, one = num%10;
		int count = 0;
		
		if(ten!=0 && ten%3==0) count++;
		if(one!=0 && one%3==0) count++;
		
		if(count == 1) System.out.println("�ڼ�¦");
		else if(count == 2) System.out.println("�ڼ�¦¦");
		else System.out.println("(�ڼ��� ġ�� ����)");
		
		scanner.close();			
	}
}
