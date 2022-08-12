package chap8_practice;
import java.io.*;
import java.util.*;


public class FileSearch {
	File adress = new File("c:\\");
	File[] subFiles = null;
	
	void showList(File file) {
		File f = file;
		System.out.println("  [" + f.getPath() + "]");
		
		subFiles = f.listFiles();
		for(int i =0; i<subFiles.length;i++) {
			File temp = subFiles[i];
			
			if(temp.isFile()) System.out.print("file");
			else if(temp.isDirectory()) System.out.print("dir");
			
			String size = temp.length() + "바이트";
			System.out.printf("\t %-15s",size);
			System.out.println(temp.getName());			
		}
		
	}
	
	void rename(String original, String change) {
		File orig = new File(adress, original);
		File temp = new File(adress, change);
		
		System.out.println(original+"을 " + change + "로 이름을 변경하였습니다.");
		orig.renameTo(temp);
		showList(adress);
	}
	
	void mkdir(String name) {
		File newdir = new File(adress, name);
		System.out.println(name + " 디렉터리를 생성하였습니다.");
		newdir.mkdir();
		showList(adress);
	}
	
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***** 파일 탐색기입니다. *****");
		
		showList(adress);
		
		while(true) {
					
			System.out.print(">>");
			String command = scanner.nextLine();
			
			StringTokenizer full = new StringTokenizer(command," ");
			String under = full.nextToken();
				
			
			if(under.equals("그만")) break;
			else if(under.equals("..")) {
				adress = new File(adress.getParent());
				showList(adress);
			}
			else if(under.equals("rename")) {
				try {
					String original = full.nextToken();
					String change = full.nextToken();
					rename(original, change);
				} catch(NoSuchElementException e) {
					System.out.println("두 개의 파일명이 주어지지 않았습니다.!");
				}
			}
			else if(under.equalsIgnoreCase("mkdir")) {
				try {
					String dir = full.nextToken();
					mkdir(dir);
				} catch(NoSuchElementException e) {
					System.out.println("디렉터리 생성에 오류가 발생하였습니다.");
				}
			}
			
			else {
				adress = new File(adress, under);
				showList(adress);
			}
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSearch search = new FileSearch();
		search.run();
	}

}
