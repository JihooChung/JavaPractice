package chap5;

public class InheritanceEx {
	public static void main(String[] args) {
		
		/*
		Person ahn = new Person();
		ahn.setWeight(50);
		System.out.println("ahn.getWeight = " + ahn.getWeight());
		
		// ahn.weight = 700; private ���ٺҰ�!
		ahn.age = 20;
		System.out.println("ahn.age = " + ahn.age);
		
		ahn.height = 200; //protected�ε� public�����̳�
		System.out.println("ahn.height = " + ahn.height);
		*/
		Student young = new Student();
		young.set();
		young.setWeight(777);
		
		young.age = 88;
		young.height = 180; // protected�ϱ� ������
		
	}
}
