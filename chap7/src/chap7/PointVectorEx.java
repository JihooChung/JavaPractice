package chap7;

import java.util.Vector;

public class PointVectorEx {
	
	public static void printVector(Vector<Integer> v) {
		for(int i = 0; i<v.size() ; i++) {
			int n = v.get(i);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1);
		
		for(int i = 0 ; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		
		Vector<Integer> vI = new Vector<Integer>();
		
		vI.add(2);
		vI.add(20);
		
		printVector(vI);
	}

}
