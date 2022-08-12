package chap5_practice;

public class Dictionary extends PairMap{
	protected int count=0;	
	
	Dictionary(int length){
		keyArray = new String[length];
		valueArray = new String[length];
	}
	
	String get(String key) {
		for(int i=0;i<count;i++){
			if(keyArray[i].equals(key)) return valueArray[i];
		}
		return null;
	}
	
	void put(String key, String value) {
		for(int i=0;i<count;i++){
				if(keyArray[i].equals(key)) {
					valueArray[i] = value;
					return;}
			}
		keyArray[count] = key;
		valueArray[count] = value;
		count++;
	}
	
	String delete(String key) {
		int i= 0;
		for(;i<count;i++){
			if(keyArray[i].equals(key)) {
				valueArray[i] = null;
				break;
			}
		}
		return valueArray[i];
	}
	
	int length() {return count+1;}
}
