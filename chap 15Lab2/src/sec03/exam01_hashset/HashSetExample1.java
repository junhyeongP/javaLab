package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		//�������̽� ���� = new ����Ŭ���� ();
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");//�ߺ�
		set.add("iBATIS");
		
		int size=set.size();
		System.out.println("�� ��ü��:"+size);
		
		Iterator<String> iterator= set.iterator();
		while(iterator.hasNext()) {
			String element= iterator.next();
			System.out.println("\t"+element);
		}
		
		for(String element:set) {
			System.out.println("\t"+element);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
	}

}