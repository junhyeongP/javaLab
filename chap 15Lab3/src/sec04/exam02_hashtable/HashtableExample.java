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
		
		//Scanner객체는 키보드에서 값을 입력받는 다.
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id=scanner.nextLine();//입력한 한줄을 문자열로 반환한다.
			
			System.out.print("비밀번호: ");
			String password=scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
			
		}
		
		
	}

}
