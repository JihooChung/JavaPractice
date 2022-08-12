package chap3_practice;

import java.util.Scanner;
public class ForFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int count = scanner.nextInt();
		
		while(count>0) { //이 친구도 for로 바꾸는게 더 예쁘겠지?
			for(int i=0;i<count;i++) {
				System.out.print("*");
			}
			System.out.println();
			count--;
		}
		
		scanner.close();
	}

}
