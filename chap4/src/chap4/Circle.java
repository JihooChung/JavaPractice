package chap4;

public class Circle {
	int radius;   //������, variable
	String name;  //String Ŭ����, name ������Ʈ
	
	Circle(){
		this.radius = 5;
		this.name = "mycircle"; // �׳� ���ڿ� �ٷ� �̷��� �ϸ� �ſ�
		System.out.println("Circle ������ �޼ҵ�, radius = " + radius);
	} //Ŭ���� �̸��� ������ �̸��� �޼ҵ� : ������ �޼ҵ�
	
	Circle(int radius){
		this.radius = radius; //radius = r;�̾��µ� �ٲٰ��ϱ� ������ �ȵ��ݾ� �����Ϸ��� this!
		System.out.println("Circle(int r) ������ �޼ҵ�, radius = " + radius);
	}
	
	Circle(int radius, String name){
		this(radius); //�ٷ� ���� �ִ� ������ �޼ҵ� �θ��°ž�
		
		this.radius = radius; //radius = r;�̾��µ� �ٲٰ��ϱ� ������ �ȵ��ݾ� �����Ϸ��� this!
		this.name = name; //name = n;�� �ٸ��� ������ �ȵǴϱ�
		System.out.print("Circle(int r) ������ �޼ҵ�, ");
		System.out.println("radius = " + this.radius + " name = " + this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���α׷� ������Ʈ �ڵ�
		Circle mycircle; // mycircle ������Ʈ
		mycircle = new Circle();
		
		Circle yourcircle;
		yourcircle = new Circle(55);
		
		Circle pizza;
		pizza = new Circle(10, "PIZZA");
		

	}

}
