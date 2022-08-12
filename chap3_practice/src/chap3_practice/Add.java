package chap3_practice;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=0;i<args.length;i++) {
			int temp=0;
			try{temp=Integer.parseInt(args[i]);}
			catch(NumberFormatException e) {
				continue;
			}
			sum +=temp;
		}
		
		System.out.print("гу╟Х : " + sum);
	}

}
