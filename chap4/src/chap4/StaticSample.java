package chap4;

class StaticSample {
	
	public int non_static_val;
	
	public void g() {
		static_val = 20;
	}
	public void h() {
		static_val = 30;
	}
	public static int static_val; //static
	public static void f() {
		static_val = 5;
	}
	
}
