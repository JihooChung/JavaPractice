package chap4;

public class ArrayParameterEx {

	public ArrayParameterEx() {
		System.out.println("������ �޼ҵ� ȣ��");
	}
	
	public void replaceSpace(char a[]) {
		for(int i=0; i<a.length;i++)
			if(a[i] == ' ')
				a[i] = ',';
	}
	public void printCharArray(char a[]) {
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayParameterEx ahn;
		ahn = new ArrayParameterEx();
		char letter[] = {'k', 'o', 'r', 'e', 'a',' ', 'e', 'w', 'h', 'a'};
		System.out.print("before : ");
		ahn.printCharArray(letter); //1�� ��� ������Ʈ.�޼ҵ��̸�(2���� ����)
		
		ahn.replaceSpace(letter);
		
		System.out.print("after : ");
		ahn.printCharArray(letter);

		int hap;
		
		hap=ahn.sum(5,6);//2�� ��� ��� = ������Ʈ.�޼ҵ��̸�(�Է�)
		System.out.println("aha.sum(5,6) : " + hap);
	}

}
