package sec02.exam02_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Box box = new Box();
		box.set("홍길동"); //Object o="홍길동", 자동형변환(부모형<-자식형)
		String name=(String)box.get();//강제형변환(자식형<-부모형)
		
		box.set(new Apple());//Object o= new Apple();, 자동형변환
		Apple apple =(Apple) box.get();//강제형변환
		*/
		
		Box <String> box1= new Box<String>();
		box1.set("hello");  //형변환이 없다.
		String str=box1.get(); //형변환이 없다
		Box <Integer> box2= new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		
		
	}

}
