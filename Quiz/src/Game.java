import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------");
		System.out.println("��ȭ���ڴ��б� ��ǻ������ 2117032 ������");
		System.out.println("-------------------------------------");
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� >> ");
		String younga = scanner.next();
		
		System.out.print("��ȭ >> ");
		String ewha = scanner.next();
		
		// ���� ��� ��츦 �ϰ������� �Ǵ� �� ��캰 ���� �Ǵ�
		
		if(younga.equals(ewha))
			System.out.println("�����ϴ�."); 
		
		else if(younga.equals("����"))
		{
			if(ewha.equals("����"))
				System.out.println("��ȭ�� �̰���ϴ�.");
			else if(ewha.equals("��"))
				System.out.println("���ư� �̰���ϴ�.");
		}
		else if(younga.equals("����"))
		{
			if(ewha.equals("����"))
				System.out.println("���ư� �̰���ϴ�.");
			else if(ewha.equals("��"))
				System.out.println("��ȭ�� �̰���ϴ�.");
		}
		else if(younga.equals("��"))
		{
			if(ewha.equals("����"))
				System.out.println("��ȭ�� �̰���ϴ�.");
			else if(ewha.equals("����"))
				System.out.println("���ư� �̰���ϴ�.");
		}
			
		scanner.close();
	}

}
