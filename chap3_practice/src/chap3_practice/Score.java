package chap3_practice;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("과목 이름>>");
			String name = scanner.next();
			
			if(name.equals("그만")) break;
			
			for(int i = 0; i<5 ; i++){
				if(name.equals(course[i])) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break;
				}
				if(i == 4) System.out.println("없는 과목입니다.");
			}
		}
		scanner.close();
	}

}
