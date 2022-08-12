package chap7;
import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("��ä��", 97);
		javaScore.put("�źα�", 94);
		javaScore.put("��������", 90);
		javaScore.put("Ʈũ����", 95);
		
		System.out.println("HashMap�� ��� ���� : " + javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}

	}

}
