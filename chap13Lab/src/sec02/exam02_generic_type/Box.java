package sec02.exam02_generic_type;
/*
public class Box {
	//Ŭ���� �������
	//�ʵ�
	private Object object;
	//������
	
	//�޼ҵ�
	public void set(Object object) {
		this.object=object;
	}
	public Object get() {
		return object;
	}

}
*/
//���ʷ� Ÿ��
public class Box<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
	
}