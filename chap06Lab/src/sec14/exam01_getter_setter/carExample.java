package sec14.exam01_getter_setter;

public class carExample {

	public static void main(String[] args) {
		Car myCar= new Car();
		myCar.speed2=-5;
		//myCar.speed=-5;
		myCar.setSpeed(-5);
		
		System.out.println("���� �ӵ�:"+myCar.getSpeed());
		System.out.println("speed:"+myCar.speed2);

	
	}

}


