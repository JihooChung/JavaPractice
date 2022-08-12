package chap5;

public class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		//weight = 99; 이건 private라서 오류난거임
		setWeight(99);
		
		System.out.println("public void set() 호출");
	}
}
