package verify03;

public class Student {
	private String studentNum;
	public Student(String studentNum) {
	this.studentNum = studentNum;
	}
	public String getStudentNum() {
	return studentNum;
	}
	 // �ۼ� ��ġ

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student sno=(Student) obj;
			if(this.studentNum ==sno.studentNum) {
				return true;
			}
			
		}
		
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}
	
	


}
