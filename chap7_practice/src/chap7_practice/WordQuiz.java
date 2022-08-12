package chap7_practice;

import java.util.*;

public class WordQuiz {
		Vector<Word> v = new Vector<Word>();
	
	void data() {
		
		v.add(new Word("love", "���"));
		v.add(new Word("baby", "�Ʊ�"));
		v.add(new Word("animal", "����"));
		v.add(new Word("dongurami", "��������"));
		v.add(new Word("geuoboggie", "�źα�"));
		v.add(new Word("family", "����"));
		v.add(new Word("painting", "�׸�"));
		
	}
	
	void run() {
		System.out.println("\"��ǰ ����\"�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� " + v.size() +"���� �ܾ ��� �ֽ��ϴ�.");
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
			answers[3] = "����";
			
			for(int i = 0; i<4 ; i++) {
				System.out.print("(" + (i+1) + ")" + answers[i]);
			}
			
			System.out.print(" : > ");
			int guess = scanner.nextInt();
			if(guess == -1) {
				System.out.println("�����մϴ�.");
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
