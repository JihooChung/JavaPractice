package chap8_practice;
import java.io.*;

public class ToCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		File f = new File("c:\\windows\\system.ini");
		
		try {
			System.out.println(f.getPath() + "������ �о� �빮�ڷ� ����մϴ�.");	
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
