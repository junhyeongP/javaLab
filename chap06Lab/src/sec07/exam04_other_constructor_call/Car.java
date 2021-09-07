package sec07.exam04_other_constructor_call;

public class Car {
	//클래스 구성멤버
		//1.필드
		String company="현대자동차";
		String model;
		String color;
		int maxSpeed;
		//2.생성자
		Car(){
			
		}
		//생성자overloading
		//this:자기 자신의 객체를 의미한다.
		//this():자기 자신의 객체의 다른 생성자를 의미한다
		//super:부모 객체
		//super():부모 객체의 생성자
		Car(String model){
			//this.model = model;
			this(model,null,0);
		}
		Car(String model,String color){
			//this.model = model;
			//this.color = color;
			this(model,color,0);
		}
		Car(String model,String color,int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed=maxSpeed;
		}
}
