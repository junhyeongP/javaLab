package sec03.exam01_name_implement_class;

public class Audio implements RemoteControl{
	//�ʵ�
	private int volume;

	@Override
	public void turnON() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.Max_VOLUME) {
			this.volume=RemoteControl.Max_VOLUME;
		}else if(volume<RemoteControl.MIN_VOlUME) {
			this.volume=RemoteControl.MIN_VOlUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� TV ����:"+volume);
		
	}
}
