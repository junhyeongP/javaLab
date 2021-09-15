package veify00_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import sec03.exam01_hashset.Member;

public class SetTest01 {

	public static void main(String[] args) {
		int n;
		Set s = new HashSet();

		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			s.add(r.nextInt(45) + 1);
		}
		System.out.println(s);

	}
}
