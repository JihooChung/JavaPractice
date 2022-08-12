package chap8_practice;
import java.io.*;
import java.util.Scanner;

public class LineNumbering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\windows\\system.ini");
		
		try {
			System.out.println(f.getPath() + " 파일을 읽어 출력합니다.");	
			Scanner fScanner = new Scanner(new FileReader(f.getPath()));
			int i = 1;
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.printf("%4d"+ ": " + line + "\n", i);
				i++;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
