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
		System.out.print("인원수>>");
		int count = scanner.nextInt();
		
		Phone[] people = new Phone[count];
		for(int i=0;i<people.length;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			people[i] = new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String search = scanner.next();
			if(search.equals("그만")) break;
			
			for(int i=0;i<people.length;i++) {
				if(search.equals(people[i].getName())) {
					System.out.println(search+"의 번호는 "+people[i].getTel()+" 입니다.");
					break;
				}
				else if(i==people.length-1)
					System.out.println(search+"이(가) 없습니다.");
			}
		}
		scanner.close();
	}
}
