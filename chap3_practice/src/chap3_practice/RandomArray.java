package chap3_practice;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[4][4];

		//기본적으로 정수 배열은 0으로 초기화가 되므로 난수만 10개 생성하면 된다.
		for(int i = 0; i<10 ;) {
			
			int a = (int)(Math.random()*4);
			int b = (int)(Math.random()*4);			
			
			if(array[a][b]==0) {
				array[a][b] = (int)(Math.random()*10+1);
				i++;
			}
		}
		
		for(int i = 0; i<array.length;i++) {
			for(int j : array[i])
				System.out.print(j + "  ");
			System.out.println();
		}		
	}
}
