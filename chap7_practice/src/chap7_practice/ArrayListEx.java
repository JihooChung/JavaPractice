package chap7_practice;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		
		ArrayList<String> score = new ArrayList<String>(6);
		String temp; 
		
		for(int i=0 ; i<6; i++) {
			temp = scanner.next();
			score.add(temp);
		}
		
		double sum=0;
		
		for(int i=0;i<6;i++) {
			switch(score.get(i)) {
			
			case "A":
				sum += 4.0;
				break;
			case "B":
				sum += 3.0;
				break;
			case "C":
				sum += 2.0;
				break;
			case "D":
				sum += 1.0;
				break;
			case "F":
				sum += 0.0;
				break;
		}}
		
		System.out.println(sum/6);
	}
}
