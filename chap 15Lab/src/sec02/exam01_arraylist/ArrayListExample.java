package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		//						remove
		list.add("Java");//0���ڸ� -	0
		list.add("JDBC");//1���ڸ� -	1
		list.add("Servlet/JSP");//3���ڸ�-2-X
		list.add(2,"Database");//2���ڸ�-X
		list.add("iBatis");//4���ڸ�-3-2-X
		
		int size=list.size();
		System.out.println("�� ��ü��:"+size);
		System.out.println();
		
		String skill=list.get(2);
		System.out.println("2:"+skill);
		System.out.println();
		
		for (int i=0;i<list.size();i++) {
			String str=list.get(i);
				System.out.println(i+":"+str);
		}
		System.out.println();
		
		//������ �����
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		for (int i=0;i<list.size();i++) {
			String str=list.get(i);
				System.out.println(i+":"+str);
		}
		
		
	}

}
