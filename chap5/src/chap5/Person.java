package chap5;

public class Person {
	private int weight;
	int age; //디폴트, 같은 패키지에서만 접근 가능
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight=weight;
		System.out.println("weight = " + this.weight);
	}
	public int getWeight() {
		return weight;
	}
}
