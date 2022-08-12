package chap2_practice;
import java.util.Scanner;

public class MiddleNumber {

	public static void main(String[] args) {
	
	System.out.print("정수 3개 입력>>");
	Scanner numbers = new Scanner(System.in);
	
	int first = numbers.nextInt();
	int second = numbers.nextInt();
	int third = numbers.nextInt();
	int middle;
	
	if(first>=second)
	{
		if(second>=third)
			middle = second;
		else
		{
			if(first>=third)
				middle = third;
			else 
				middle = first;
		}
	}
	else
	{
		if(first>=third)
			middle = first;
		else
		{
			if(second>=third)
				middle = third;
			else
				middle = second;
		}
	}
	
	System.out.println("중간 값은 " + middle);
	
	numbers.close();
	
	}

}
