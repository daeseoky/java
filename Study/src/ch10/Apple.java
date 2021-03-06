package ch10;

public class Apple extends Object{  //Object상속은 기본값이라 extends Object는 안적어도 됨
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("사과 원산지 : "+this.country);
		System.out.println("사과 가격 : "+this.price);
	}
	
	public String toString() {
		show();
		return super.toString();
	}

}
