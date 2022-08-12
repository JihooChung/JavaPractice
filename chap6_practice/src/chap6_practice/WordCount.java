package chap6_practice;
import java.util.Scanner;
//import java.util.StringTokenizer;

public class WordCount {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.print(">>");
		
		String temp = scanner.nextLine();
		
		if(temp.equals("그만")) {
			System.out.println("오키 그만그만"); break;
		}
		
		String words[] = temp.split(" ");
		System.out.println("어절 개수는 " + words.length);

		
		//StringTokenizer words = new StringTokenizer(temp, " ");
		//System.out.println("어절 개수는 " + words.countTokens());
		
		}
		
		scanner.close();
	}

}
