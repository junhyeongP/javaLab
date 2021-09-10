package verify.exam04;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 수정");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 삭제");
	}

}
