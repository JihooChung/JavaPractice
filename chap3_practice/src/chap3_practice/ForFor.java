package chap3_practice;

import java.util.Scanner;
public class ForFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>>");
		int count = scanner.nextInt();
		
		while(count>0) { //�� ģ���� for�� �ٲٴ°� �� ���ڰ���?
			for(int i=0;i<count;i++) {
				System.out.print("*");
			}
			System.out.println();
			count--;
		}
		
		scanner.close();
	}

}
