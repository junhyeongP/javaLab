package sec02.exam02_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Box box = new Box();
		box.set("ȫ�浿"); //Object o="ȫ�浿", �ڵ�����ȯ(�θ���<-�ڽ���)
		String name=(String)box.get();//��������ȯ(�ڽ���<-�θ���)
		
		box.set(new Apple());//Object o= new Apple();, �ڵ�����ȯ
		Apple apple =(Apple) box.get();//��������ȯ
		*/
		
		Box <String> box1= new Box<String>();
		box1.set("hello");  //����ȯ�� ����.
		String str=box1.get(); //����ȯ�� ����
		Box <Integer> box2= new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		
		
	}

}
