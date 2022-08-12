package chap5_practice;

public class StringStack implements Stack{
	private String stack[];
	private int count=0;
	
	StringStack(int length){
		stack = new String[length];
	}
	
	public int length() {return count;}
	
	public int capacity() {return stack.length;}
	
	public String pop(){
		count--;
		if(count==-1)return null;
		else return stack[count];
	}
	
	public boolean push(String val) {
		if(count<stack.length) {
			stack[count] = val;
			count++;
			return true;
		}
		else return false;
	}
}
