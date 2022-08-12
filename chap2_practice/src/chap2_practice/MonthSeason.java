package chap2_practice;

import java.util.Scanner;

public class MonthSeason {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("달을 입력하세요(1~12)>>");
	int month = scanner.nextInt();
	
	/*if(3<=month && month<=5)
		System.out.print("봄!");
	else if(6<=month && month<=8)
		System.out.print("여름!");
	else if(9<=month && month<=11)
		System.out.print("가을!");
	else if((month==1 || month==2)|| month==12)
		System.out.print("겨울!");
	else System.out.print("잘못입력하셨군뇨");
	*/
	
	switch(month) {
	case 3:
	case 4:
	case 5:
		System.out.print("봄");
		break;
	case 6:
	case 7:
	case 8:
		System.out.print("여름");
		break;
	case 9:
	case 10:
	case 11:
		System.out.print("가을");
		break;
	case 12:
	case 1:
	case 2:
		System.out.print("겨울");
		break;
	default: 
		System.out.print("wrong input");
		break;
	}
	
	scanner.close();
	}

}
