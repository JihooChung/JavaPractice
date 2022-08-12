package chap2_practice;
import java.util.Scanner;

public class NumJudgement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.print("2자리수 정수 입력(10~99)>>");
	Scanner number = new Scanner(System.in);
	
	int num = number.nextInt();
	
	if(num/10 == num%10)
		System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
	else
		System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
	
	number.close();
	}

}
