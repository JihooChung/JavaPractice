package chap4;

import java.util.Scanner;
public class BookName {

	String title, author;
	
	public BookName(String title) {
		this(title, "모른대요");
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
			System.out.println("입력해보세요(저자 모르면 모름 입력)");
			String title = scanner.next();
			String author = scanner.next();
			
			if(author.equals("모름")) 
				books[i] = new BookName(title);
			else books[i] = new BookName(title, author);
		}
		for(int i = 0; i<books.length ; i++) {
			System.out.println("제목 : " + books[i].title + ", 작가 : " + books[i].author);
		}
		scanner.close();
	}

}
