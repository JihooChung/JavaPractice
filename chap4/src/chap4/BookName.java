package chap4;

import java.util.Scanner;
public class BookName {

	String title, author;
	
	public BookName(String title) {
		this(title, "�𸥴��");
	}
	
	public BookName(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		BookName books[] = new BookName[3];
		for(int i = 0; i<books.length ; i++) {
			System.out.println("�Է��غ�����(���� �𸣸� �� �Է�)");
			String title = scanner.next();
			String author = scanner.next();
			
			if(author.equals("��")) 
				books[i] = new BookName(title);
			else books[i] = new BookName(title, author);
		}
		for(int i = 0; i<books.length ; i++) {
			System.out.println("���� : " + books[i].title + ", �۰� : " + books[i].author);
		}
		scanner.close();
	}

}
