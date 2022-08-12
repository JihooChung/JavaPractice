import java.util.Scanner;

public class WordGameApp {
	
	private Scanner scanner;
	private String startWord = "�ƹ���";
	private Player[] players; //�̰� Ŭ�����ϱ� �޼ҵ� ���� Ŭ������ ����������
	
	public WordGameApp(int time) {
		System.out.println("<<�� "+ time + " ȸ �����ձ� ����>>");
	}
	
	public void createPlayers(){
		scanner = new Scanner(System.in);
		
		System.out.print("�����ڴ� �� ���ΰ���?");
		int num = scanner.nextInt();
		
		players = new Player[num];
		for(int i = 0;i<num; i++) {
			System.out.print((i+1)+"�� �������� �̸��� �Է��ϼ���.");
			String name = scanner.next();
			players[i] = new Player(name);
		}
	}
	
	public void run() {
		System.out.println("�����ձ� ������ �����ҰԿ� ~_~");
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
		
		System.out.print("���� ��� �Ͻǰſ���?");
		int time = scan.nextInt();
		
		for(int num = 1 ; num<=time;num++){
			System.out.println();
			WordGameApp game = new WordGameApp(num);
			game.run();
		}
		scan.close();
	}

}
