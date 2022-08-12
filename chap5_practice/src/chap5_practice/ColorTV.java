package chap5_practice;

public class ColorTV extends TV{
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public int getColor() {return color;}
	
	public void printProperty(){
		System.out.println(getSize() + "��ġ " + getColor() + "�÷�");
	}
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}
}