package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest01 {

		public static void main(String[] args) {
			int n;
			//Set s = new HashSet();
			TreeSet s = new TreeSet();//TreeSet�����ؼ�
			
			Random r = new Random();
			
			//�ڵ� �Է�
			//1~45���� ���� ����
			while(s.size()<6) {
			s.add(r.nextInt(45)+1);//16,16 �ߺ�x
			}
			System.out.println(s);
			
					
			
	}

}
