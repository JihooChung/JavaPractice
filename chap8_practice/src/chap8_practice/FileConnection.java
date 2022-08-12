package chap8_practice;
import java.io.*;
import java.util.Scanner;

public class FileConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String f1name = scanner.next();
		
		System.out.print("두번째 파일 이름을 입력하세요>>");
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
		
		System.out.println("프로젝트 폴더 밑에 " + appended.getName() + " 파일에 저장하였습니다.");
		scanner.close();
	}

}
