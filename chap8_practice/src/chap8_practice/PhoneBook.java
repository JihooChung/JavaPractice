package chap8_practice;
import java.util.Scanner;
import java.io.*;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		try {
			FileWriter fw = null;
			File phonebook = new File("c:\\temp_java\\phone.txt");
			fw = new FileWriter(phonebook);
		
		
		String info = null;
		while(true) {
			System.out.print("�̸� ��ȭ��ȣ >> ");
			info = scanner.nextLine();
			if(info.equals("�׸�")) break;		
			fw.write(info + "\r\n");	
		}
		
		System.out.println(phonebook.getPath() + "�� �����Ͽ����ϴ�.");
		fw.close();
		scanner.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
