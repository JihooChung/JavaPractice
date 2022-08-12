package chap4;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
}

public class PhoneBook {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		System.out.print("�ο���>>");
		int count = scanner.nextInt();
		
		Phone[] people = new Phone[count];
		for(int i=0;i<people.length;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			people[i] = new Phone(name,tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String search = scanner.next();
			if(search.equals("�׸�")) break;
			
			for(int i=0;i<people.length;i++) {
				if(search.equals(people[i].getName())) {
					System.out.println(search+"�� ��ȣ�� "+people[i].getTel()+" �Դϴ�.");
					break;
				}
				else if(i==people.length-1)
					System.out.println(search+"��(��) �����ϴ�.");
			}
		}
		scanner.close();
	}
}
