package sec03.exam01_name_implement_class;

public interface RemoteControl {
	//���
	int Max_VOLUME=10;
	int MIN_VOlUME=0;
	//�߻�޼ҵ�
	void turnON();
	void turnOff();
	void setVolume(int volume);
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		}else {
			System.out.println("������ ��ü�մϴ�");
		}
	}
	

}
