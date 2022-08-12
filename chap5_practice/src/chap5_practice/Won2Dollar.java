package chap5_practice;
import java.util.Scanner;


public class Won2Dollar extends Converter{
	Scanner scanner = new Scanner(System.in);
	private String src = "¿ø";
	private String dest = "´Þ·¯";
	
	public Won2Dollar(int ratio) {
		this.ratio = ratio;
	}
	
	public double convert(double src){
		return src/ratio;
	}
	public String getSrcString() {return src;}
	public String getDestString() {return dest;}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}