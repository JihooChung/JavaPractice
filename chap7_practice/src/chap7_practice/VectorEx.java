package chap7_practice;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.print("정수입력 하는데 그만하고 싶으면 -1 입력 >> ");
		while(true) {
			int num = scanner.nextInt();
			if(num==-1) break;
			
			v.add(num);
		}
		
		int maximum=0;
		
		for(int i =0 ; i<v.size() ; i++) {
			if(maximum<v.get(i)) maximum = v.get(i);
		}
		
		System.out.println("가장 큰 수는" + maximum);
	}

}
