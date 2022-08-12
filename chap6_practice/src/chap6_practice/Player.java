package chap6_practice;
import java.util.*;

public class Player {
	private int difference;
	private String name;
	private Scanner scanner = new Scanner(System.in);
	Player(String name){
		this.name = name;
	}
	
	void play() {
		
		System.out.print(name + " ���� <Enter Ű> >> ");
		scanner.nextLine();
		
		Calendar now = Calendar.getInstance();
		int start = now.get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + start);
		
		
		System.out.print("10�� ���� �� >> ");
		scanner.nextLine();
		
		now = Calendar.getInstance();
		int stop = now.get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + stop);
		
		if(start>stop)
			difference = 10- (stop+60 - start);
		else difference = 10 - (stop - start);
	}
	
	public String getName() {return name;}
	public int getDiff() {return difference;}
}
