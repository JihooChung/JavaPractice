package chap3_practice;

public class Average {
	
	public static void main(String[] args){
		double sum = 0.0;
		
		for(int i=0; i<args.length; i++)
			sum += Integer.parseInt(args[i]);
		
		System.out.println("ЦђБе : " + sum/args.length);
	}

}
