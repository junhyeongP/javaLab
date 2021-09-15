package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("È«±æµ¿", "½Å¿ë±Ç", "±èÀÚ¹Ù");
		for (String name : list1) {
			System.out.println(name);
		}

		// auto-boxing
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {// Auto-unboxing
			System.out.println(value);
		}

	}

}
