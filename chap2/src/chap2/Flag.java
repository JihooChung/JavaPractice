package chap2;

public class Flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte flag = 0b00001110;
		
		if((flag&0b00000100)==0)
			System.out.print("온도는 0도 이하");
		else
			System.out.print("온도는 0도 이상");

	}

}
