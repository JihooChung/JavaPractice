package chap5;

public class B extends A{
	public B() {
		//super();
		super(10);
		System.out.println("생성자B");
	}
	public B(int x) {
		//super();
		super(x);
		System.out.println("매개변수생성자B "+x);
	}
}
