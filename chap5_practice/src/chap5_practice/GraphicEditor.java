package chap5_practice;
import java.util.Scanner;

public class GraphicEditor {
	Scanner scanner = new Scanner(System.in);
	private Shape before = null;
	private Shape start = null;
	
	public void run() {
		
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.print("삽입(1) 삭제(2) 모두보기(3) 종료(4)>>");
			int choice = scanner.nextInt();
			
			if(choice == 1) insert();
			else if(choice == 2) delet();
			else if(choice == 3) seeAll();
			else {
				System.out.println("beauty을 종료합니다.");
				break;
			}
		}
	}
	
	public void insert() {
		
		Shape shape = null;
		System.out.print("Line(1) Rect(2) Circle(3)>>");
		int shapeType = scanner.nextInt();
		
		switch(shapeType) {
		case 1: 
			shape = new Line();
			break;
		case 2:
			shape = new Rect();
			break;
		case 3:
			shape = new Circle();
			break;
		}
		
		if(before == null) {
			start = shape;
			before = shape;
		}
		else {
			before.setNext(shape);
			before = shape;
		}
		
	}
	
	public void delet() {
		System.out.print("삭제할 도형의 위치>>");
		int deletion = scanner.nextInt();
		
		Shape beforedel = new Line(); // 삭제를 위해 임시로 만든 객체
		beforedel.setNext(start);
		
		for(int i = 1;; i++){
			
			if(beforedel.getNext()== null){
				System.out.println("삭제할 수 없습니다.");
				break;
			}
			else if(i==deletion){
				Shape temp = beforedel.getNext();
				beforedel.setNext(temp.getNext());
				if(temp == before)
					before = beforedel;
				break;
			}
			
			beforedel = beforedel.getNext();
		}
			
	}
		

	public void seeAll() {
		Shape showing = start;
		
		while(true){
			if(showing == null) break;
			
			showing.draw();
			showing = showing.getNext();
		}	
	}
	
	
	public static void main(String[] args) {
		GraphicEditor graphic = new GraphicEditor();
		graphic.run();
	}

}
