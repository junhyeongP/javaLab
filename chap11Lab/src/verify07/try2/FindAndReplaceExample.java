package verify07.try2;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index=str.indexOf("�ڹ�");
		if(index==-1) {
			System.out.println("�ڹٰ� ���ԵǾ� ���� �ʽ��ϴ�");
		}else {
			System.out.println("�ڹٰ� ���ԵǾ� �ֽ��ϴ�");
			str=str.replace("�ڹ�", "java");
			System.out.println("-->"+str);
		}

	}

}
