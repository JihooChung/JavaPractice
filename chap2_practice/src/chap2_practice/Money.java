package chap2_practice;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.print("금액을 입력하시오>>");
	Scanner money = new Scanner (System.in);
	
	int total = money.nextInt();
	
	if(total>=50000)
	{
		System.out.println("오만원권 " + (total/50000) + "매");
		total%=50000;
	}
	if(total>=10000)
	{
		System.out.println("만원권 " + (total/10000) + "매");
		total%=10000;
	}
	if(total>=1000)
	{
		System.out.println("천원권 " + (total/1000) + "매");
		total%=1000;
	}
	if(total>=100)
	{
		System.out.println("백원 " + (total/100) + "개");
		total%=100;
	}
	if(total>=50)
	{
		System.out.println("오십원 " + (total/50) + "개");
		total%=50;
	}
	if(total>=10)
	{
		System.out.println("십원 " + (total/10) + "개");
		total%=10;
	}
	if(total>=1)
	{
		System.out.println("일원 " + total + "개");
	}
	
	money.close();
	}

}
