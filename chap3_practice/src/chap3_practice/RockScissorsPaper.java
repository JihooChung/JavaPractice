package chap3_practice;

import java.util.Scanner;
public class RockScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"가위", "바위", "보"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String users = scanner.next();
			
			if(users.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			int n = (int)(Math.random()*3);
			System.out.print("사용자 = " + users + " , 컴퓨터 = " + str[n] + ", ");
			
			if(users.equals(str[n])) {
				System.out.println("비겼습니다.");
			}
			else if(users.equals("가위"))
			{
				if(str[n].equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if(str[n].equals("보"))
					System.out.println("사용자가 이겼습니다.");
			}
			else if(users.equals("바위"))
			{
				if(str[n].equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if(str[n].equals("보"))
					System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(users.equals("보"))
			{
				if(str[n].equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println("사용자가 이겼습니다.");
			}
			scanner.nextLine();				
		}
		scanner.close();

	}

}
