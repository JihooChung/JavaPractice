package chap5_practice;

public class IPTV extends ColorTV{
	private String ip;
	
	IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	
	public String getIP() {return ip;}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + getIP() + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
	} 
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32, 2048);
		
		iptv.printProperty();
	}
}
