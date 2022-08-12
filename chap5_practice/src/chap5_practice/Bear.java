package chap5_practice;

public class Bear extends GameObject{
	private String direction;
	
	public Bear(int x,int y, int d) {
		super(x, y, d);
	}
	
	protected void setDirection(String d) {
		this.direction = d;
	}
	
	protected void move() {
		
		switch(direction) {
		
		case "a":
			if(x == 0) x = 0;
			else x-=distance;
			break;
		case "d":
			if(x == 19) x = 19;
			else x+=distance;
			break;
		case "w":
			if(y == 0) y = 0;
			else y-=distance;
			break;
		case "s":
			if(y == 9) y = 9;
			else y+=distance;
			break;
		}
		
	}
	protected void getShape() {
		System.out.print("B");
	}
}
