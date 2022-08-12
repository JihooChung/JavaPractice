package chap6;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ObjectPropertyEX {

	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2,3);
		print(p);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "¿‘¥œ¥Ÿ.");
	}

}
