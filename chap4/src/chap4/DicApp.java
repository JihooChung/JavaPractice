package chap4;

import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng (String word){
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				if(i%2 == 1)
				 System.out.print(word + "�� ");
				else System.out.print(word + "�� ");
				return eng[i];
			}	
		}
		return "none";
	}
}

public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String korean = scanner.next();
			
			if(korean.equals("�׸�")) break;
			
			String english = Dictionary.kor2Eng(korean);
			if(english.equals("none"))
				System.out.println(korean + "��(��) ���� ������ �����ϴ�.");
			else 
				System.out.println(english);
		}
		scanner.close();
	}

}
