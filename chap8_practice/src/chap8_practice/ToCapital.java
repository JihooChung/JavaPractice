package chap8_practice;
import java.io.*;

public class ToCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		File f = new File("c:\\windows\\system.ini");
		
		try {
			System.out.println(f.getPath() + "파일을 읽어 대문자로 출력합니다.");	
			reader = new BufferedReader(new FileReader(f));
			while(true) {
				String line = reader.readLine();
				if(line == null)
					break;
				line = line.toUpperCase();
				System.out.println(line);
		
			}
			reader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
