package chap6_practice;
import java.util.*;

public class TimeGame {
	private Player[] player = new Player[2];
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����ð��� ���ߴ� �����Դϴ�.");
		System.out.println("������ �� �� ����� �̸��� ���ʴ�� �Է��ϼ��� >> ");
		
		String name;
		for(int i =0; i<player.length; i++)
		{
			name = scanner.next();
			player[i] = new Player(name);
			
		}
		
		for(int i = 0; i<player.length;i++)
			player[i].play();
		
		for(int i = 0; i<player.length;i++)
		{
			System.out.print(player[i].getName() + "�� ��� " + player[i].getDiff() + ",");
		}
		if(player[0].getDiff()<player[1].getDiff())
			System.out.println(player[0].getName() + " is WINNER!");
		else System.out.println(player[1].getName() + " is WINNER!");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeGame practice = new TimeGame();
		practice.run();
	}

}
