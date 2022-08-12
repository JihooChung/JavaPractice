package chap6_practice;

public class Example {
	public static void main (String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6", "=,");
		int sum =0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			try {
				sum += Integer.parseInt(token);
				System.out.println(token);
			}
			catch(NumberFormatException e) {
				System.out.println(token);
			}
		}
		System.out.println("гую╨ "+sum);
	}
}