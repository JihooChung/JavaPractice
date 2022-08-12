package chap2_practice;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.print("정수 3개를 입력하시오>>");
	Scanner length = new Scanner (System.in);
	
	int a = length.nextInt();
	int b = length.nextInt();
	int c = length.nextInt();
	
	if((a<(b+c))&&b<(a+c)&&c<(a+b))
		System.out.println("삼각형이 됩니다.");
	else
		System.out.println("삼각형이 되지 않습니다.");
			
	length.close();
	}

}
