package verify08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "���̵�,�̸�,�н�����";
		String mul=",";
		
		System.out.println("split������");
		String[] split=str.split(mul);
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		System.out.println();
		
		StringTokenizer st=new StringTokenizer(str,",");
		int countToken=st.countTokens();
		for(int i=0;i<countToken;i++) {
			String token =st.nextToken();
			System.out.println(token);
		}
		
		
		
	}

}
