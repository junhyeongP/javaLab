package sec09.exam09_instance_member;

public class Car {
	//Ŭ���� ���� ���
	//�ʵ�
	String model;
	int speed;
	
	//������
	Car(){
	}
	//������ �����ε�(overloading)
	Car(String model){
		this.model=model;
		}
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed =speed;
		
	}
	void run() {
		for(int i=10;i<=50; i+=10) {
			this.setSpeed(i);//
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�:"+this.speed);
		}
	}
	
}
