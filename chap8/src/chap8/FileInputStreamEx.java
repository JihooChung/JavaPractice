package chap8;
import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("C:\\MINE\\test.out");
			int n = 0, c;
			while((c=fin.read())!=-1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("C:\\MINE\\test.out���� ���� �迭�� ����մϴ�.");
			for(int i = 0; i<b.length;i++) System.out.println(b[i] + " ");
			System.out.println();
			fin.close();
		}
		catch(IOException e) {
			System.out.println("C:\\MINE\\test.out���� ���� ���߽��ϴ�. ��θ��� Ȯ���ϼ���.");
		}
	}

}
