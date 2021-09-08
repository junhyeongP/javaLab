package sec14.exam01_getter_setter;

public class Car {
	//필드
	int speed2;
	private int speed;
	private boolean stop;
	
	//생성자
	//메소드
	//getter
	public int getSpeed() {
		return speed;
	}
	//setter
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;//종료
		}else {
		this.speed=speed;
		}
	}
	
	//getter
	public boolean isStop() {
		return stop;
	}
	//setter
	public void setStop(boolean stop) {
		this.stop=stop;
		this.speed=0;
	}

}
