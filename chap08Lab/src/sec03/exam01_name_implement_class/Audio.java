package sec03.exam01_name_implement_class;

public class Audio implements RemoteControl{
	//ÇÊµå
	private int volume;

	@Override
	public void turnON() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
		
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
		System.out.println("ÇöÀç TV º¼·ý:"+volume);
		
	}
}
