package Test1;
import java.util.Scanner;


/*
 * ��¥ : 2021/1/06
 * �̸� : ��뼮
 * ���� : �ڹ� �⺻ ����� ��������
 */
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.print("���� �⵵ �Է� : ");
		year = sc.nextInt();
		
		System.out.print("�¾ �⵵ �Է� : ");
		birth =sc.nextInt();
		
		System.out.print("�̸� �Է� : ");
		name =sc.next();
				
		int age =year - birth;
		
		System.out.printf("%s�� �ȳ��ϼ���.\n����� ���� �� %d�� �Դϴ�.", name, age);
		
		sc.close();
		
	}

}