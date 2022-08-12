package chap5;

public class ColorPoint extends Point2{
	private String color;
	
	ColorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print("color = " + color + ", ");
		showPoint();
		//x=10; 이건 에러나
	}
}
