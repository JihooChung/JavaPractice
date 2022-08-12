package chap6_practice;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "가나다라";
		System.out.println(a=="가나다라");
		
		String b = new String(a);
		System.out.println(a==b); //문자열은 equals써야함 a, b는 각각 주소값을 가지고있겠지 레퍼런스 값이 달라서
	}

}
