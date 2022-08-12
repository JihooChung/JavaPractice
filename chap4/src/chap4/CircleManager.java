package chap4;

import java.util.Scanner;
class Circles{
	double x,y;
	int radius;
	public Circles(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
}

public class CircleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circles c [] = new Circles[3];
		for(int i=0; i<c.length;i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circles(x,y,radius);
		}
		
		int bigindex=0, biggest = 0;
		for(int i=0;i<c.length;i++) {
			if(biggest<c[i].radius) {
				biggest = c[i].radius;
				bigindex = i;
			}
		}
		
		System.out.println("가장 면적이 큰 원은 "
				+ "("+c[bigindex].x + "," + c[bigindex].y + ")" + c[bigindex].radius);
	
		scanner.close();

	}

}
