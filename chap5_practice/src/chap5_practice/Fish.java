package chap5_practice;

public class Fish extends GameObject{
	private int direction;
	public Fish(int x, int y, int d){
		super(x,y,d);
	}
	
	protected void setDirection() {
		this.direction = (int)(Math.random()*20+1);
	}
	
	protected void move() {
		
		switch(direction) {
		
		case 1:
			if(x == 0) x = 0;
			else x-=distance;
			break;
		case 2:
			if(x == 19) x = 19;
			else x+=distance;
			break;
		case 3:
			if(y == 0) y = 0;
			else y-=distance;
			break;
		case 4:
			if(y == 9) y = 9;
			else y+=distance;
			break;
		default:
			break;
		}
		
	}
	
	protected void getShape() {
		System.out.print("O");
	}
}
