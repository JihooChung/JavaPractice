package chap7;
import java.util.*;

public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("Ȳ����", new Student(1, "010-1111-1111"));
		map.put("���繮", new Student(2, "010-2222-2222"));
		map.put("�賲��", new Student(3, "010-3333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�? ");
			String name = scanner.nextLine();
			if(name.equals("exit")) break;
			Student student = map.get(name);
			if(student == null) System.out.println(name + "�� ���� ����Դϴ�.");
			else System.out.println("id : " + student.getId() + ", ��ȭ : " + student.getTel());
		}

	}
}
