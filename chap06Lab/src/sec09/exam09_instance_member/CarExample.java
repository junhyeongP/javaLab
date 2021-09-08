package sec09.exam09_instance_member;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar =new Car("포르쉐");
		Car yourCar =new Car("벤츠");
		
		myCar.model="제네시스";//인스턴스 필드
		myCar.run();//인스턴스 메소드
		yourCar.run();//인스턴스 메소드
		
	}

}
