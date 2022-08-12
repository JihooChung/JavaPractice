package chap4;
import java.util.Scanner;

class Day{
	private String work;
	
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work==null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class MonthSchedule {
	Scanner scanner;
	Day[] day;
	
	MonthSchedule(int day){
		this.day = new Day[day];
		for(int i=0;i<day;i++)
			this.day[i] = new Day();
		scanner = new Scanner(System.in);
	}
	
	void run(){
		System.out.print("�̹��� ������ ���� ���α׷�.");
		while(true) {
			System.out.println();
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int list = scanner.nextInt();
			
			switch (list) {
			case 1:
				input();
				break;
			case 2:
				view(); 
				break;
			case 3: 
				finish();
				return;
			}
		
		}
	}
	
	void input() {
		System.out.print("��¥(1~30)?");
		int one = scanner.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String work = scanner.next();
		
		day[one].set(work);
	}
	
	void view() {
		System.out.print("��¥(1~30)?");
		int one = scanner.nextInt();
		System.out.print(one + "���� �� ���� ");
		day[one].show();
	}
	
	void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		

	}

}
