package chap3_practice;

import java.util.Scanner;

public class Integer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[10];
		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		
		for(int i=0;i<array.length;i++) array[i] = scanner.nextInt();

		System.out.print("3�� ����� ");
		
		for(int i=0;i<array.length;i++){
			if(array[i]%3 == 0)
				System.out.print(array[i] + " ");
		}
		scanner.close();
	}

}
