package chap7_practice;

public class Word {
	private String eng, kor;
	
	Word(String eng, String kor){
		this.eng = eng; this.kor = kor;
	}
	
	String getEng() {return eng;}
	String getKor() {return kor;}
}
