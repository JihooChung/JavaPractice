import java.util.Scanner;

public class WordGameApp {
	
	private Scanner scanner;
	private String startWord = "아버지";
	private Player[] players; //이건 클래스니까 메소드 말고 클래스로 만들어줘야제
	
	public WordGameApp(int time) {
		System.out.println("<<제 "+ time + " 회 끝말잇기 게임>>");
	}
	
	public void createPlayers(){
		scanner = new Scanner(System.in);
		
		System.out.print("참가자는 몇 명인가요?");
		int num = scanner.nextInt();
		
		players = new Player[num];
		for(int i = 0;i<num; i++) {
			System.out.print((i+1)+"번 참가자의 이름을 입력하세요.");
			String name = scanner.next();
			players[i] = new Player(name);
		}
	}
	
	public void run() {
		System.out.println("끝말잇기 게임을 시작할게요 ~_~");
		createPlayers();
		
		String lastWord = players[0].getWordFromUser();
		
		int i=1;
		while(true) {
			
			String newWord = players[i].getWordFromUser();
			if(!players[i].checkSuccess(lastWord)){
				System.out.println(players[i].getName() + "LOSE~~");
				break;
			}
			
			i++;
			i %= players.length;
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("게임 몇번 하실거예요?");
		int time = scan.nextInt();
		
		for(int num = 1 ; num<=time;num++){
			System.out.println();
			WordGameApp game = new WordGameApp(num);
			game.run();
		}
		scan.close();
	}

}
