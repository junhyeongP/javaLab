package verify08.try2;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str="���̵�, �̸�,�н�����";
		String mul=",";
		
		System.out.println("split");
		String[] split=str.split(mul);
		for(int i=0;i<split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println("StringTokenizer");
		StringTokenizer token=new StringTokenizer(str,",");
		int countToken =token.countTokens();
		for(int i=0;i<countToken; i++) {
			String st=token.nextToken();
			System.out.println(st);
		}
		
		
		

	}

}
