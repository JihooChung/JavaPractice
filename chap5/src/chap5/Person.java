package chap5;

public class Person {
	private int weight;
	int age; //����Ʈ, ���� ��Ű�������� ���� ����
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
