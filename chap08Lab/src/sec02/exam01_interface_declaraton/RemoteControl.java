package sec02.exam01_interface_declaraton;

public interface RemoteControl {
	//�������̽��� �������
	//���(public static final��������)
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME=10;
	//�߻� �޼ҵ�(abstract ��������)
	abstract void turnOn();
	void turnOff();
	void setVOlum(int volume);
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		} else {
			System.out.println("���� �����մϴ�");
		}
	}
	//���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}
