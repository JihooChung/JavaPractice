package chap8;
import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7, 51, 3, 4, -1, 24};
		try{
			FileOutputStream fout = new FileOutputStream("C:\\MINE\\test.out");
			for(int i=0;i<b.length;i++)
				fout.write(b[i]);
			fout.close();
		}
		catch(IOException e) {
			System.out.println("C:\\MINE\\test.out에 저장하지 못했습니다. 경로명을 확인해주세요.");
			return;
		}
		System.out.println("C:\\MINE\\test.out을 저장하였습니다.");
	}

}
