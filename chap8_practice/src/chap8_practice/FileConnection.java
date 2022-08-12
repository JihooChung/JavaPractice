package chap8_practice;
import java.io.*;
import java.util.Scanner;

public class FileConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String f1name = scanner.next();
		
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String f2name = scanner.next();
		
		File appended = new File("appended.txt");
		
		try {	
			
			FileReader fr1 = new FileReader(f1name);
			FileReader fr2 = new FileReader(f2name);
			FileWriter fw = new FileWriter(appended);
			
			int c;
			while((c=fr1.read())!=-1) fw.write((char)c);
			while((c=fr2.read())!=-1) fw.write((char)c);			
			
			fr1.close();
			fr2.close();
			fw.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("������Ʈ ���� �ؿ� " + appended.getName() + " ���Ͽ� �����Ͽ����ϴ�.");
		scanner.close();
	}

}
