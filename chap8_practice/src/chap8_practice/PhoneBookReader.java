package chap8_practice;
import java.io.*;

public class PhoneBookReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		File f = new File("c:\\temp_java\\phone.txt");
		
		try {
			
			System.out.println(f.getPath() + "를 출력합니다.");
			reader = new BufferedReader(new FileReader(f));
			while(true) {
				String phone = reader.readLine();
				if(phone == null)
					break;
				System.out.print(phone+"\n");
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
