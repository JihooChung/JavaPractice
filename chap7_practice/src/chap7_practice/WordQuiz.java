package chap7_practice;

import java.util.*;

public class WordQuiz {
		Vector<Word> v = new Vector<Word>();
	
	void data() {
		
		v.add(new Word("love", "사랑"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("dongurami", "동구래미"));
		v.add(new Word("geuoboggie", "거부기"));
		v.add(new Word("family", "가족"));
		v.add(new Word("painting", "그림"));
		
	}
	
	void run() {
		System.out.println("\"명품 영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() +"개의 단어가 들어 있습니다.");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int question = (int)(Math.random()*v.size());
			System.out.println(v.get(question).getEng() + "?");
			
			String[] answers = new String[4];
			
			
			answers[(int)(Math.random()*3)] = v.get(question).getKor();
			
			for(int i = 0; i<answers.length-1 ; i++) {
				if(answers[i] == null)
					answers[i] = v.get((int)(Math.random()*v.size())).getKor();
				/*for(int j = 0; j<i ; j++) {
					if(answers[i] == answers[j]) break;
				}
				i--;*/
			}
			answers[3] = "오류";
			
			for(int i = 0; i<4 ; i++) {
				System.out.print("(" + (i+1) + ")" + answers[i]);
			}
			
			System.out.print(" : > ");
			int guess = scanner.nextInt();
			if(guess == -1) {
				System.out.println("종료합니다.");
				break;
			}
			
			if(answers[guess-1]== v.get(question).getKor())
				System.out.println("EXCELLENT!!");
			else System.out.println("NOPE");
			}
			
		scanner.close();
		}
	
	public static void main(String[] args) {
		WordQuiz play = new WordQuiz();
		play.data();
		play.run();
	}
}
