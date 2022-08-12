package chap3_practice;

import java.util.Scanner;

public class RandomIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇개?");
		int count = scanner.nextInt();
		int[] array = new int[count]; 
		
		for(int i = 0; i<array.length ; i++){
			array[i] = (int)(Math.random()*100+1);
			
			for(int j = 0; j<i ; j++){
				if(array[j] == array[i]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i<array.length ; i++) {
			System.out.print(array[i] + " ");
			if(i%10==9) System.out.println();
		}
		scanner.close();
	}

}
