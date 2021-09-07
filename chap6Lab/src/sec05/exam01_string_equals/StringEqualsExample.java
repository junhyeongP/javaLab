package sec05.exam01_string_equals;
//class
public class StringEqualsExample {
//method:리턴타입 메소드명 (타입 매개변수){//실행문;} 
	public static void main(String[] args) {
		
		String strVal1 = "박준형";
		String strVal2 = "박준형";
		
		System.out.println("strVal1= "+System.identityHashCode(strVal1));
		System.out.println("strVal2= "+System.identityHashCode(strVal2));
		
		if (strVal1== strVal2) {
			System.out.println("strVals1과 strVal2가 참조가 같음");
		} else {
			System.out.println("strVals1과 strVal2가 참조가 다름");
		}
		
		if (strVal1.equals(strVal2)) {
			System.out.println("strVals1과 strVal2가 문자열이 같음");
		}
		//객체생성방법: new연산자 클래스생성자();
		String strVal3 = new String("박준형");
		String strVal4 = new String("박준형");
		
		System.out.println("strVal3= "+System.identityHashCode(strVal3));
		System.out.println("strVal4= "+System.identityHashCode(strVal4));
		
		if (strVal3== strVal4) {//주소값을 비교
			System.out.println("strVal3과 strVal4가 참조가 같음");
		} else {
			System.out.println("strVal3과 strVal4가 참조가 다름");
		}
		
		if (strVal1.equals(strVal2)) {//객체의 문자열을 비교
			System.out.println("strVal3과 strVal4가 문자열이 같음");
		}
		
		int[] score = {83,90,83};
		int sum=0;//length쓰기
		for (int i=0;i<score.length;i++) {
			sum+= score[i];
		}
		
		
		
		
	}/////main

}////////class
