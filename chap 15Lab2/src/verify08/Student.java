package verify08;

public class Student {
	public int studentNum;
	public String name;
	public Student (int studentNum, String name) {
	this.studentNum = studentNum;
	this.name = name;
	}
	@Override
	public int hashCode() {
		// #1 �ۼ� ��ġ
		return studentNum;
		}
		@Override
		public boolean equals(Object obj) {
			// #2 �ۼ� ��ġ
			return true;
		}

}
