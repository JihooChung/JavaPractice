package chap5;

public class Student extends Person {
	public void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		//weight = 99; �̰� private�� ����������
		setWeight(99);
		
		System.out.println("public void set() ȣ��");
	}
}
