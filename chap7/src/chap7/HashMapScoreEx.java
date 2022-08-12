package chap7;
import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("정채연", 97);
		javaScore.put("거부기", 94);
		javaScore.put("마무리코", 90);
		javaScore.put("트크스맘", 95);
		
		System.out.println("HashMap의 요소 개수 : " + javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}

	}

}
