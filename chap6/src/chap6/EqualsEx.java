package chap6;

public class EqualsEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(2,3);
		Rect c = new Rect(3,4);
		
		if(a.equals(b)) System.out.println("a == b");
		if(a.equals(c)) System.out.println("a == c");
		if(b.equals(c)) System.out.println("c == b");
	}
}
