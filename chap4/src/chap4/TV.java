package chap4;

public class TV {
	String brand;
	int year, size;
		
	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;	
	}
	
	public void show(){
		System.out.println(brand + "���� ���� " + year + "���� " + size + "��ġ TV");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
