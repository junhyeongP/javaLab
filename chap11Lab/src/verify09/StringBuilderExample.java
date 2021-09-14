package verify09;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder st=new StringBuilder();
		for(int i=1;i<=100;i++) {
		StringBuilder str=st.append(i);
		}
		String str=st.toString();
		System.out.println(str);
	}

}
