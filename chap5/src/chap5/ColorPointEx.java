package chap5;

public class ColorPointEx {
	public static void main(String [] args) {
		Point2 p = new Point2();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(5,6,"blue");
		//cp.set(3, 4); //�̰� �����ڰ� �ƴ϶� �׳� �޼ҵ� �θ��Ŵϱ�
		//cp.setColor("red");
		cp.showColorPoint();
	}
}
