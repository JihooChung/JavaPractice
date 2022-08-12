package chap3_practice;

class RandomInt {

	public static void main(String[] args) {
	
		int[] random = new int[10];
		int sum=0;
		
		for(int i=0;i<random.length;i++) {
			random[i] =(int)(Math.random()*10+1);
			sum +=random[i];
		}		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		
		for(int n:random)
			System.out.print(n + " ");	
		System.out.println();
		System.out.println("Æò±ÕÀº " + sum/random.length);
		
	}
}
