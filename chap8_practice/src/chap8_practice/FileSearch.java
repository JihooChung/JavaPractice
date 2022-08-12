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
			
			String size = temp.length() + "����Ʈ";
			System.out.printf("\t %-15s",size);
			System.out.println(temp.getName());			
		}
		
	}
	
	void rename(String original, String change) {
		File orig = new File(adress, original);
		File temp = new File(adress, change);
		
		System.out.println(original+"�� " + change + "�� �̸��� �����Ͽ����ϴ�.");
		orig.renameTo(temp);
		showList(adress);
	}
	
	void mkdir(String name) {
		File newdir = new File(adress, name);
		System.out.println(name + " ���͸��� �����Ͽ����ϴ�.");
		newdir.mkdir();
		showList(adress);
	}
	
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***** ���� Ž�����Դϴ�. *****");
		
		showList(adress);
		
		while(true) {
					
			System.out.print(">>");
			String command = scanner.nextLine();
			
			StringTokenizer full = new StringTokenizer(command," ");
			String under = full.nextToken();
				
			
			if(under.equals("�׸�")) break;
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
					System.out.println("�� ���� ���ϸ��� �־����� �ʾҽ��ϴ�.!");
				}
			}
			else if(under.equalsIgnoreCase("mkdir")) {
				try {
					String dir = full.nextToken();
					mkdir(dir);
				} catch(NoSuchElementException e) {
					System.out.println("���͸� ������ ������ �߻��Ͽ����ϴ�.");
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
