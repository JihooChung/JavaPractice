package chap8_practice;
import java.util.Scanner;
import java.io.*;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("전화번호 입력 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
		
		try {
			FileWriter fw = null;
			File phonebook = new File("c:\\temp_java\\phone.txt");
			fw = new FileWriter(phonebook);
		
		
		String info = null;
		while(true) {
			System.out.print("이름 전화번호 >> ");
			info = scanner.nextLine();
			if(info.equals("그만")) break;		
			fw.write(info + "\r\n");	
		}
		
		System.out.println(phonebook.getPath() + "에 저장하였습니다.");
		fw.close();
		scanner.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
