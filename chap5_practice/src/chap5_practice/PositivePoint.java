package chap5_practice;

public class PositivePoint extends Point {
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int x, int y) {
		super(x,y);
		if(x<0||y<0) super.move(0, 0);
	}
	
	public void move(int x, int y) {
		if(x>=0&&y>=0) super.move(x,y);
	}
	
	public String toString() {
		return "(" + getX() + "," + getY() + ")의 점";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5,-5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"입니다.");
		
	}

}
