package chap4;

public class Ex {

	public static void main(String[] args) {
		
		/*StaticSample s1,s2;
		
		s1 = new StaticSample();
		s1.n = 5;
		 */
		
		StaticSample ahn;
		ahn = new StaticSample(); //object
		
		ahn.non_static_val = 100;
		System.out.println("ahn.non_static_val = " + ahn.non_static_val);
	
		ahn.static_val = 77;
		System.out.println("ahn.static_val = " + ahn.static_val);
		
		StaticSample.static_val = 999;
		System.out.println("StaticSample.static_val = " + StaticSample.static_val);
		
		//static�� class�� �ϴ°� �ξ� ������. ������ �� �����ϰ� �����ŵ�
		
	}
}
