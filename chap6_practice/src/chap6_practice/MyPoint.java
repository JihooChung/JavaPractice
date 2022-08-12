package chap6_practice;

public class MyPoint {
	private int x;
	private int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() { return x;}
	public int getY() { return y;}
	
	public String toString() {
		return "Point (" + x + "," + y + ")";
	} 
	
	public boolean equals(MyPoint temp) {
		if(this.x==temp.getX() && this.y == temp.getY())
			return true;
		else return false;
	} 
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else System.out.println("다른 점");
		
	}
}
