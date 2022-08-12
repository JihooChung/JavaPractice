package chap6_practice;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	Circle(int x, int y, int radius){
		this.x = x; this.y = y;
		this.radius = radius;
			
	}
	
	public int getX() { return x;}
	public int getY() { return y;}
	
	@Override
	public String toString() {
		return "Circle (" + x + "," + y + ") ������" + radius; 
	}
	
	public boolean equals(Circle temp) {
		if(this.x==temp.getX() && this.y == temp.getY())
			return true;
		else return false;
	} 
	
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		
		if (a.equals(b)) {System.out.println("���� ��");}
		else {System.out.println("�ٸ� ��");}
	}
	
}
