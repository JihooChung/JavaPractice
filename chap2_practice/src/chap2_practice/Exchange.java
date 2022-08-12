package chap2_practice;
import java.util.Scanner;

public class Exchange {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner price = new Scanner(System.in);
		
		int won = price.nextInt();
		double dollar = (double)won/(double)1100;
		
		System.out.println(won + "원은 $" + dollar + "입니다.");

		price.close();
	}

}
