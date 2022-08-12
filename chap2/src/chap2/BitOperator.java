package chap2;

public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	byte numA, numB;
	byte resultAnd, resultOr, resultXor, resultNot;
	
	numA =(byte)15; //0000 1111
	numB =(byte)23; //0001 0111
	              //& 0000 0111 -> 7
                  //| 0001 1111 -> 31
	
	resultAnd = (byte)(numA & numB);
	resultOr = (byte)(numA | numB);
	resultXor = (byte)(numA ^ numB);
	resultNot = (byte)(~ numA);
	
	System.out.println("resultAnd = " + resultAnd);
	System.out.println("resultOr = " + resultOr);
	System.out.println("resultXor = " + resultXor);
	System.out.println("resultNot = " + resultNot);
		
	}

}
