package ch07;

public class p170 {
	public static void main(String[] args) {
		
	
	p167 stu = new p167("홍길동", 4, "소프트웨어공학");
	
	System.out.println(stu.name);
	System.out.println(stu.grade);
	System.out.println(stu.department);
	
	p167 stu1 = new p167("이순신", 3, "디자인");
	
	System.out.println(stu1.name);
	System.out.println(stu1.grade);
	System.out.println(stu1.department);
	
	// 기본 생성자로 객체 생성
	p167 stu0 = new p167();  
	
	}
}
