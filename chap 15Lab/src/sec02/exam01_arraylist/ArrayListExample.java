package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		//						remove
		list.add("Java");//0번자리 -	0
		list.add("JDBC");//1번자리 -	1
		list.add("Servlet/JSP");//3번자리-2-X
		list.add(2,"Database");//2번자리-X
		list.add("iBatis");//4번자리-3-2-X
		
		int size=list.size();
		System.out.println("총 객체수:"+size);
		System.out.println();
		
		String skill=list.get(2);
		System.out.println("2:"+skill);
		System.out.println();
		
		for (int i=0;i<list.size();i++) {
			String str=list.get(i);
				System.out.println(i+":"+str);
		}
		System.out.println();
		
		//데이터 지우기
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		for (int i=0;i<list.size();i++) {
			String str=list.get(i);
				System.out.println(i+":"+str);
		}
		
		
	}

}
