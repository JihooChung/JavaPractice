package chap8_practice;

import java.io.*;
import java.util.*;

public class PhoneFinding {

	HashMap<String, String> phone = new HashMap <String, String>();
	
	public void reading() {
		
		try {
			Scanner fScanner = new Scanner(new FileReader(new File("c:\\temp_java\\phone2.txt")));
			while(fScanner.hasNext()) {
				String name = fScanner.next();
				String number = fScanner.next(); 
				phone.put(name, number);
			}			
			fScanner.close();	
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("총 " + phone.size() + "개의 전화번호를 읽었습니다.");
	}
	
	public void searching() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름 >> ");
			String name = scanner.next();
			
			if(name.equals("그만")) break;
			else if(phone.get(name)==null) System.out.println("찾는 이름이 없습니다.");
			else System.out.println(phone.get(name));
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneFinding find = new PhoneFinding();
		find.reading();
		find.searching();
	}

}
