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
		
		if(temp.equals("�׸�")) {
			System.out.println("��Ű �׸��׸�"); break;
		}
		
		String words[] = temp.split(" ");
		System.out.println("���� ������ " + words.length);

		
		//StringTokenizer words = new StringTokenizer(temp, " ");
		//System.out.println("���� ������ " + words.countTokens());
		
		}
		
		scanner.close();
	}

}
