package chap5_practice;
import java.util.Scanner;

public class BearFishGame {
	private String array[][] = new String[10][10];
	private Bear B;
	private Fish F;
	
	public void showMap(){
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<20;j++) {
				if(B.getX() == j && B.getY() == i) B.getShape();
				else if(F.getX() == j && F.getY() == i) F.getShape();
				else System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public void run() {
		
		this.B = new Bear(0,0,1);
		this.F = new Fish((int)(Math.random()*20), (int)(Math.random()*10), 1);
		Scanner scanner = new Scanner(System.in);
		
		while(true) {	
			
			showMap();
			if(B.collide(F)) {
				System.out.println("Bear Wins~!!");
				break;
			}
			
			System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
			String direction = scanner.next();
			B.setDirection(direction);
			F.setDirection();
			
			B.move(); 
			F.move();
		}
		
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		System.out.println("** Bear의 Fish먹기 게임을 시작합니다.**");
		BearFishGame game = new BearFishGame();
		game.run();
		
	}
}
