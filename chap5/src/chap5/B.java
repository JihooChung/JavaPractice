package chap5;

public class B extends A{
	public B() {
		//super();
		super(10);
		System.out.println("������B");
	}
	public B(int x) {
		//super();
		super(x);
		System.out.println("�Ű�����������B "+x);
	}
}
