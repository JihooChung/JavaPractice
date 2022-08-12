package chap4;

import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng (String word){
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				if(i%2 == 1)
				 System.out.print(word + "는 ");
				else System.out.print(word + "은 ");
				return eng[i];
			}	
		}
		return "none";
	}
}

public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("한글 단어?");
			String korean = scanner.next();
			
			if(korean.equals("그만")) break;
			
			String english = Dictionary.kor2Eng(korean);
			if(english.equals("none"))
				System.out.println(korean + "은(는) 저의 사전에 없습니다.");
			else 
				System.out.println(english);
		}
		scanner.close();
	}

}
