package chap5_practice;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super(0,0);
		this.color = "BLACK";
	}
	
	public ColorPoint(int x, int y) {
		super(x,y);
		this.color = "BLACK";
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void setXY(int x, int y) { move(x,y); }
	
	public void setColor(String c) { color = c; }
	
	public String toString() {
		return color + "���� (" + getX() + "," + getY() + ")�� ��";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ColorPoint cp = new ColorPoint(1,2,"BLUE");
		cp.setXY(5,5);
		cp.setColor("SKY BLUE");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");		
		*/
		
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5,5);
		cp.setColor("GREEN");
		System.out.println(cp.toString() + "�Դϴ�.");
		
	}

}
