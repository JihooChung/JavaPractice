package chap3_practice;

public class Guide369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=9;i++) {
			for(int j=1;j<=3;j++) {
				if((i%3==0)&&(i!=0))
					System.out.println(1*i + "" + 3*j + " ¹Ú¼ö Â¦Â¦");
				else System.out.println(10*i + 3*j + " ¹Ú¼ö Â¦");
			}
		}

	}

}
