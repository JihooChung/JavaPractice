package chap5_practice;
import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scanner.nextInt();
		
		StringStack stack = new StringStack(size);
		
		while(true) {
			
			System.out.print("문자열 입력 >> ");
			String word = scanner.next();
			
			if(word.equals("그만"))
				break;
			
			if(!stack.push(word))
				System.out.println("스택이 꽉 차서 푸시 불가!");	
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		
		for(int i = stack.length();i>0;i--) {
			System.out.print(stack.pop() + " ");
		}
		
		scanner.close();
	}

}
