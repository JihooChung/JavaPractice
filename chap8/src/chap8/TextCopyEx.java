package chap8;
import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File src = new File("C:\\Windows\\system.ini");
		int c;
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter("C:\\temp_java\\system.txt");
			while((c=fr.read())!=-1) {	fw.write((char)c); }
			fr.close(); fw.close();
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
			
		}
	}

}
