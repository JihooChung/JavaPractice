import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------");
		System.out.println("이화여자대학교 컴퓨터전공 2117032 정지후");
		System.out.println("-------------------------------------");
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("영아 >> ");
		String younga = scanner.next();
		
		System.out.print("이화 >> ");
		String ewha = scanner.next();
		
		// 먼저 비긴 경우를 일괄적으로 판단 후 경우별 승패 판단
		
		if(younga.equals(ewha))
			System.out.println("비겼습니다."); 
		
		else if(younga.equals("가위"))
		{
			if(ewha.equals("바위"))
				System.out.println("이화가 이겼습니다.");
			else if(ewha.equals("보"))
				System.out.println("영아가 이겼습니다.");
		}
		else if(younga.equals("바위"))
		{
			if(ewha.equals("가위"))
				System.out.println("영아가 이겼습니다.");
			else if(ewha.equals("보"))
				System.out.println("이화가 이겼습니다.");
		}
		else if(younga.equals("보"))
		{
			if(ewha.equals("가위"))
				System.out.println("이화가 이겼습니다.");
			else if(ewha.equals("바위"))
				System.out.println("영아가 이겼습니다.");
		}
			
		scanner.close();
	}

}
