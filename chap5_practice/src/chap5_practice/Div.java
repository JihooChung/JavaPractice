package chap5_practice;

public class Div extends Calc{
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate(){return a/b;}
}