package chap3_practice;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� �̸�>>");
			String name = scanner.next();
			
			if(name.equals("�׸�")) break;
			
			for(int i = 0; i<5 ; i++){
				if(name.equals(course[i])) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;
				}
				if(i == 4) System.out.println("���� �����Դϴ�.");
			}
		}
		scanner.close();
	}

}
