package chap2_practice;

import java.util.Scanner;

public class MonthSeason {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("���� �Է��ϼ���(1~12)>>");
	int month = scanner.nextInt();
	
	/*if(3<=month && month<=5)
		System.out.print("��!");
	else if(6<=month && month<=8)
		System.out.print("����!");
	else if(9<=month && month<=11)
		System.out.print("����!");
	else if((month==1 || month==2)|| month==12)
		System.out.print("�ܿ�!");
	else System.out.print("�߸��Է��ϼ̱���");
	*/
	
	switch(month) {
	case 3:
	case 4:
	case 5:
		System.out.print("��");
		break;
	case 6:
	case 7:
	case 8:
		System.out.print("����");
		break;
	case 9:
	case 10:
	case 11:
		System.out.print("����");
		break;
	case 12:
	case 1:
	case 2:
		System.out.print("�ܿ�");
		break;
	default: 
		System.out.print("wrong input");
		break;
	}
	
	scanner.close();
	}

}
