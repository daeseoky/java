package ch10;
/*
 * ��¥ : 2021/1/11
 * �̸� : ��뼮
 * ���� : �ڹ� ���׸� �ǽ��ϱ� ���� p384
 */ 
public class sub1_GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("�ѱ�", 3000);
		Banana banana = new Banana("�Ϻ�", 2000);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		FruitBox<Banana> box2 = new FruitBox<>();
		
		box1.setFruit(apple);
		box2.setFruit(banana);
		
		box1.getFruit().toString();
		box2.getFruit().toString();
		
		
		
	}
	

}