package chap4;

public class Circle {
	int radius;   //반지름, variable
	String name;  //String 클래스, name 오브젝트
	
	Circle(){
		this.radius = 5;
		this.name = "mycircle"; // 그냥 문자열 바로 이렇게 하면 돼요
		System.out.println("Circle 생성자 메소드, radius = " + radius);
	} //클래스 이름과 동일한 이름의 메소드 : 생성자 메소드
	
	Circle(int radius){
		this.radius = radius; //radius = r;이었는데 바꾸고보니까 구분이 안되잖아 구분하려고 this!
		System.out.println("Circle(int r) 생성자 메소드, radius = " + radius);
	}
	
	Circle(int radius, String name){
		this(radius); //바로 위에 있는 생성자 메소드 부르는거야
		
		this.radius = radius; //radius = r;이었는데 바꾸고보니까 구분이 안되잖아 구분하려고 this!
		this.name = name; //name = n;과 다르게 구분이 안되니까
		System.out.print("Circle(int r) 생성자 메소드, ");
		System.out.println("radius = " + this.radius + " name = " + this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램 오브젝트 코딩
		Circle mycircle; // mycircle 오브젝트
		mycircle = new Circle();
		
		Circle yourcircle;
		yourcircle = new Circle(55);
		
		Circle pizza;
		pizza = new Circle(10, "PIZZA");
		

	}

}
