package chap5_practice;

import java.util.Scanner;

public class Km2Mile extends Converter{

	Scanner scanner = new Scanner(System.in);
	private String src = "km";
	private String dest = "mile";
	
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	public double convert(double src){
		return src/ratio;
	}
	public String getSrcString() {return src;}
	public String getDestString() {return dest;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
