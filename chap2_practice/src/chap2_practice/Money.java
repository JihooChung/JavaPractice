package chap2_practice;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.print("�ݾ��� �Է��Ͻÿ�>>");
	Scanner money = new Scanner (System.in);
	
	int total = money.nextInt();
	
	if(total>=50000)
	{
		System.out.println("�������� " + (total/50000) + "��");
		total%=50000;
	}
	if(total>=10000)
	{
		System.out.println("������ " + (total/10000) + "��");
		total%=10000;
	}
	if(total>=1000)
	{
		System.out.println("õ���� " + (total/1000) + "��");
		total%=1000;
	}
	if(total>=100)
	{
		System.out.println("��� " + (total/100) + "��");
		total%=100;
	}
	if(total>=50)
	{
		System.out.println("���ʿ� " + (total/50) + "��");
		total%=50;
	}
	if(total>=10)
	{
		System.out.println("�ʿ� " + (total/10) + "��");
		total%=10;
	}
	if(total>=1)
	{
		System.out.println("�Ͽ� " + total + "��");
	}
	
	money.close();
	}

}
