package verify03;

public class SoundableExample {
	//Ŭ���� �����ɹ�
	//�ʵ�
	//������
	
	//�޼ҵ�
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
		}
		public static void main(String[] args) {
		printSound(new Cat());
		//Sounable soundable=new Cat()
		//�������̽� ���� =������ü; �ڵ�����ȯ
		printSound(new Dog());
		}

}
