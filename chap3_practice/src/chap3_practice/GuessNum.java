package chap3_practice;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int rand = (int)(Math.random()*100);
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������. (0~99)");
			int count = 0;
			int highest = 99, lowest = 0;
			
			while(true){			
				
				count++;
				System.out.print(count+">> ");
				int trial = scanner.nextInt();
				
				if(rand>trial) {
					lowest = trial;
					System.out.println("�� ���� (" + lowest + "~" + highest + ")");
				}
				else if(rand<trial) {
					highest = trial;
					System.out.println("�� ���� (" + lowest + "~" + highest + ")");
				}
				else if(rand == trial){
					System.out.println("�¾ҽ��ϴ�!");
					break;
				}
			}
		
			System.out.print("�ٽ��Ͻðڽ��ϱ�? (yes/no) >> ");
			String answer = scanner.next();
			
			if(answer.equals("no"))
				break;
		
		}

		scanner.close();
	}

}
