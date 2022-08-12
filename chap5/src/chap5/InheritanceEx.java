package chap5;

public class InheritanceEx {
	public static void main(String[] args) {
		
		/*
		Person ahn = new Person();
		ahn.setWeight(50);
		System.out.println("ahn.getWeight = " + ahn.getWeight());
		
		// ahn.weight = 700; private 접근불가!
		ahn.age = 20;
		System.out.println("ahn.age = " + ahn.age);
		
		ahn.height = 200; //protected인데 public느낌이네
		System.out.println("ahn.height = " + ahn.height);
		*/
		Student young = new Student();
		young.set();
		young.setWeight(777);
		
		young.age = 88;
		young.height = 180; // protected니까 괜차나
		
	}
}
