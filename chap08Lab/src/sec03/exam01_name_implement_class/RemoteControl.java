package sec03.exam01_name_implement_class;

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
	

}
