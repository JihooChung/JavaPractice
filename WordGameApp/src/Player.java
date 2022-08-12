import java.util.Scanner;

public class Player {
	private Scanner scanner = new Scanner(System.in);
	private String name;
	private String word;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	public String getWordFromUser() {
		System.out.print(name + "ÀÇ Â÷·Ê! ");
		word = scanner.next();
		return word;
	}
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length()-1;
		if(lastWord.charAt(lastIndex)==word.charAt(0)) return true;
		else return false;
	}
}
