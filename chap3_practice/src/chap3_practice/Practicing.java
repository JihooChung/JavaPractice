package chap3_practice;

public class Practicing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] val;
		val = new int[4][3];
		int num=1;
		
		for(int i = 0 ; i<4 ; i++){
			for(int j=0 ; j<3 ; j++){
				val[i][j] = num++;		
			}
		}
		
		for(int i = 0 ; i<4 ; i++){
			for(int j=0 ; j<3 ; j++){
				System.out.print(val[i][j] + " ");		
			}
			System.out.println(" ");		

		}
		
		//------------------------------------------
		
		double[][] temp = {{1.1,1.2,1.2,1.4},{2.1,2.2},{3.1,3.2,1.2},{4.1}};
		
		
		
	}

}
