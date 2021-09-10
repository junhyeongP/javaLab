package sec03.exan02_nonname_implement_class;

public interface RemoteControl {
	//상수
	int Max_VOLUME=10;
	int MIN_VOlUME=0;
	//추상메소드
	void turnON();
	void turnOff();
	void setVolume(int volume);
	//딜폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음을 해체합니다");
		}
	}
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	

}
