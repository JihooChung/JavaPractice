package chap8;
import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\MINE\\SPARK\\SPARK\\CIE.jpg");
		File test = new File("c:\\MINE\\imagetest.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(test);
			
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"�� " + test.getPath() + "�� �����Ͽ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}

}
