package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest01 {

		public static void main(String[] args) {
			int n;
			//Set s = new HashSet();
			TreeSet s = new TreeSet();//TreeSet정렬해서
			
			Random r = new Random();
			
			//코드 입력
			//1~45사이 임의 정수
			while(s.size()<6) {
			s.add(r.nextInt(45)+1);//16,16 중보x
			}
			System.out.println(s);
			
					
			
	}

}
