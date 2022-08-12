package chap4;
import java.util.Scanner;

class Day{
	private String work;
	
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work==null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
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
		System.out.print("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
		System.out.print("날짜(1~30)?");
		int one = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();
		
		day[one].set(work);
	}
	
	void view() {
		System.out.print("날짜(1~30)?");
		int one = scanner.nextInt();
		System.out.print(one + "일의 할 일은 ");
		day[one].show();
	}
	
	void finish() {
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		

	}

}
