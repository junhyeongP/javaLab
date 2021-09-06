package sec06.exam04_main_argument;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 =args[0];//"3"
		String strNum2 =args[1];//"4"
		
		int num1 =Integer.parseInt(strNum1);//"3"->Integer.parseInt()는 정수로 변경
		int num2 =Integer.parseInt(strNum2);//"4"->3
		
		int result =num1+ num2;
		System.out.println(num1 + "+"+ num2+"=" + result);//"3+4=7"
	}//////main

}//////////class
