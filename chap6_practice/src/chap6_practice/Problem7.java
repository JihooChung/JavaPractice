package chap6_practice;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "�����ٶ�";
		System.out.println(a=="�����ٶ�");
		
		String b = new String(a);
		System.out.println(a==b); //���ڿ��� equals����� a, b�� ���� �ּҰ��� �������ְ��� ���۷��� ���� �޶�
	}

}
