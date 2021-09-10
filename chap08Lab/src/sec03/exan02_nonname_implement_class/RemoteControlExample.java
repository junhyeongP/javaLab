package sec03.exan02_nonname_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnON() {
				// TODO Auto-generated method stub
				System.out.println("ÄÑÁü");
			}
			
			public void turnOff() { System.out.println("²¨Áü"); }
			public void setVolume(int volume) {System.out.println("º¼·ýÀº"+volume); }			
		};
		rc.turnOff();
		
	}

}
