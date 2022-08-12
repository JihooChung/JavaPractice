package chap3_practice;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int rand = (int)(Math.random()*100);
			System.out.println("수를 결정하였습니다. 맞추어 보세요. (0~99)");
			int count = 0;
			int highest = 99, lowest = 0;
			
			while(true){			
				
				count++;
				System.out.print(count+">> ");
				int trial = scanner.nextInt();
				
				if(rand>trial) {
					lowest = trial;
					System.out.println("더 높게 (" + lowest + "~" + highest + ")");
				}
				else if(rand<trial) {
					highest = trial;
					System.out.println("더 낮게 (" + lowest + "~" + highest + ")");
				}
				else if(rand == trial){
					System.out.println("맞았습니다!");
					break;
				}
			}
		
			System.out.print("다시하시겠습니까? (yes/no) >> ");
			String answer = scanner.next();
			
			if(answer.equals("no"))
				break;
		
		}

		scanner.close();
	}

}
