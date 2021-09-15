package veriify07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//필드 : 객체에 데이터를 저장한다
	//생성자: 객체를 생성하여 필드를 초기화한다
	BoardDao(){
		
	}
	
	//메소드: 객체에 기능을 부여한다
	//메소드 형태: 리턴타입 메소드명(매개변수){//실행문}
	public  List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		return list;
	}

}
