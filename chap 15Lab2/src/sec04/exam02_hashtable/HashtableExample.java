package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map= new Hashtable<String,String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winder", "12345");
		
		//Scanner��ü�� Ű���忡�� ���� �Է¹޴� ��.
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵�: ");
			String id=scanner.nextLine();//�Է��� ������ ���ڿ��� ��ȯ�Ѵ�.
			
			System.out.print("��й�ȣ: ");
			String password=scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
			
		}
		
		
	}

}