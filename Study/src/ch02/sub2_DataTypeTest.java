package ch02;

/*
 * ��¥ : 2021/12/31
 * �̸� : ��뼮
 * ���� : �ڹ� �ڷ���(Data Type) �ǽ��ϱ� ���� p38
 *  
 */
public class sub2_DataTypeTest {
	public static void main(String[] args) {
		
		// ������
		byte  num1 = 127;   //�׸��� ������ ũ�� byte < short < int < long
		short num2 = 13456;
		int   num3 = 5463125;
		long  num4 = 1000L;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
		
		// �Ǽ���
		float  var1 = 1.123456789f;          //�Ҽ��� 7�ڸ�����
		double var2 = 1.12345678923456789;   //�Ҽ��� 16�ڸ�����
		
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		
		// ������
		boolean val1 = true;
		boolean val2 = false;
		
		System.out.println("val1:"+val1);
		System.out.println("val2:"+val2);
		
		// ������
		char ch1 = 'A';    //���� �ϳ� (���ϰ��� ����)
		char ch2 = '��';
		
		System.out.println("ch1:"+ch1);
		System.out.println("ch2:"+ch2);
		
		// ���ڿ�
		String str1 = "A";
		String str2 = "Apple";
		String str3 = "��";
		String str4 = "���";
		String str5 = "123";

		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		System.out.println("str4:"+str4);
		System.out.println("str5:"+str5);
		
		
		
		
		
	}
	
	
	
}