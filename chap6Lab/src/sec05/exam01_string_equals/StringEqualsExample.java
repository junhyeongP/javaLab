package sec05.exam01_string_equals;
//class
public class StringEqualsExample {
//method:����Ÿ�� �޼ҵ�� (Ÿ�� �Ű�����){//���๮;} 
	public static void main(String[] args) {
		
		String strVal1 = "������";
		String strVal2 = "������";
		
		System.out.println("strVal1= "+System.identityHashCode(strVal1));
		System.out.println("strVal2= "+System.identityHashCode(strVal2));
		
		if (strVal1== strVal2) {
			System.out.println("strVals1�� strVal2�� ������ ����");
		} else {
			System.out.println("strVals1�� strVal2�� ������ �ٸ�");
		}
		
		if (strVal1.equals(strVal2)) {
			System.out.println("strVals1�� strVal2�� ���ڿ��� ����");
		}
		//��ü�������: new������ Ŭ����������();
		String strVal3 = new String("������");
		String strVal4 = new String("������");
		
		System.out.println("strVal3= "+System.identityHashCode(strVal3));
		System.out.println("strVal4= "+System.identityHashCode(strVal4));
		
		if (strVal3== strVal4) {//�ּҰ��� ��
			System.out.println("strVal3�� strVal4�� ������ ����");
		} else {
			System.out.println("strVal3�� strVal4�� ������ �ٸ�");
		}
		
		if (strVal1.equals(strVal2)) {//��ü�� ���ڿ��� ��
			System.out.println("strVal3�� strVal4�� ���ڿ��� ����");
		}
		
		int[] score = {83,90,83};
		int sum=0;//length����
		for (int i=0;i<score.length;i++) {
			sum+= score[i];
		}
		
		
		
		
	}/////main

}////////class
