package chap8;
import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		
		System.out.println("c:\\MINE\\chap8sample.txt");
		
		try {
			fin = new FileReader("c:\\MINE\\chap8sample.txt");
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류! 삐용삐용");
		}
		//ANSI로 맞춰서 저장해줘야 잘 읽네
	}

}
