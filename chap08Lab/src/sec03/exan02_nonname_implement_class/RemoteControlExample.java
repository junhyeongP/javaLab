package sec03.exan02_nonname_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnON() {
				// TODO Auto-generated method stub
				System.out.println("����");
			}
			
			public void turnOff() { System.out.println("����"); }
			public void setVolume(int volume) {System.out.println("������"+volume); }			
		};
		rc.turnOff();
		
	}

}
