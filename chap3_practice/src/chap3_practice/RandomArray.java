package chap3_practice;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[4][4];

		//�⺻������ ���� �迭�� 0���� �ʱ�ȭ�� �ǹǷ� ������ 10�� �����ϸ� �ȴ�.
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
