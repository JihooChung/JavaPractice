package chap2_practice;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.print("���� 3���� �Է��Ͻÿ�>>");
	Scanner length = new Scanner (System.in);
	
	int a = length.nextInt();
	int b = length.nextInt();
	int c = length.nextInt();
	
	if((a<(b+c))&&b<(a+c)&&c<(a+b))
		System.out.println("�ﰢ���� �˴ϴ�.");
	else
		System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
			
	length.close();
	}

}
