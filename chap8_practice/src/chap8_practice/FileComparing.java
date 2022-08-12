package chap8_practice;
import java.io.*;
import java.util.Scanner;

public class FileComparing {

	public static boolean comparing(FileInputStream f1, FileInputStream f2) {

		byte[] f1buf = new byte[1024];
		byte[] f2buf = new byte[1024];
		
		try {
		
			int count1,count2; 
		
			while(true) {
				count1 = f1.read(f1buf, 0, f1buf.length);
				count2 = f2.read(f2buf, 0, f2buf.length);
			
				if(count1 != count2) return false;
			
				for(int i =0;i<count1;i++) {
					if(f1buf[i]!=f2buf[i]) return false;
				}		
			
				if(count1==-1) break;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야합니다.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String f1name = scanner.next();
		
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String f2name = scanner.next();
		
		System.out.println(f1name + "와 " + f2name + "를 비교합니다.");
		
		try {
			FileInputStream f1in = new FileInputStream(f1name);
			FileInputStream f2in = new FileInputStream(f2name);
			
			if(comparing(f1in, f2in))
				System.out.println("파일이 같습니다.");
			else System.out.println("파일이 다릅니다.");
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
