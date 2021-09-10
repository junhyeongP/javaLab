package sec03.exam03_multi_implement_class;

//다중 인터페이스 구현클래스
public class SmartTelevison implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("티비를 켭니다");
		
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}


}
