package chap2_practice;
import java.util.Scanner;

public class Exchange {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		Scanner price = new Scanner(System.in);
		
		int won = price.nextInt();
		double dollar = (double)won/(double)1100;
		
		System.out.println(won + "���� $" + dollar + "�Դϴ�.");

		price.close();
	}

}
