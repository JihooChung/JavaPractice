package chap6_practice;
import java.util.Scanner;

public class AlphabetHistogram {
	private String text;
	private int[] alphabet = new int[26];
	
	public String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			if(line.equals(";")) break;
			sb.append(line);
		}
		scanner.close();
		return sb.toString();
	}
	
	public void countAlphabet(String text) {
		char c;
		for(int i = 0; i<text.length() ; i++) {
			c=text.charAt(i);
			for(int j = 65; j<=90; j++)
				if((int)c == j || (int)c == j+32) alphabet[j-65]++;
			
		}
	}
	
	public void drawHistogram() {
		System.out.println("히스토그램을 그립니다.");
		
		for(int i = 0; i<alphabet.length; i++){
			System.out.print((char)(i+65));
			for(int j = 0; j<alphabet[i];j++)
				System.out.print("-");
			System.out.println();
		}
	
	}
	
	public void run() {
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		
		countAlphabet(readString());
		drawHistogram();

	}
	
	public static void main(String[] args) {
		AlphabetHistogram sample = new AlphabetHistogram();
		sample.run();
	}

}
