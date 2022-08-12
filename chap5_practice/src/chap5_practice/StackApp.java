package chap5_practice;
import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = scanner.nextInt();
		
		StringStack stack = new StringStack(size);
		
		while(true) {
			
			System.out.print("���ڿ� �Է� >> ");
			String word = scanner.next();
			
			if(word.equals("�׸�"))
				break;
			
			if(!stack.push(word))
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");	
		}
		
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		
		for(int i = stack.length();i>0;i--) {
			System.out.print(stack.pop() + " ");
		}
		
		scanner.close();
	}

}
