package chap2_practice;
import java.util.Scanner;

public class NumJudgement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
	Scanner number = new Scanner(System.in);
	
	int num = number.nextInt();
	
	if(num/10 == num%10)
		System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
	else
		System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
	
	number.close();
	}

}
