package chap7_practice;
import java.util.*;

public class Number5 {

	public static int func(HashMap<String, Integer> h) {
		return h.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String> (10);
		
		a.add("Java");
		a.add(0,"C++");
		a.size();
		a.remove(a.size()-1);
		
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0; i<10; i++) v.add(i);
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() +" ");
			
		}
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("a", 20);
		h.put("b", 20);
		System.out.println(func(h));
		
	}

}
