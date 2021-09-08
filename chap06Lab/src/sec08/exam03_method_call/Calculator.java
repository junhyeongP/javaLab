package sec08.exam03_method_call;

public class Calculator {
	//필드
	//생성자
	//메소드
	int plus(int x,int y) {
		int result= x+y;
		return result;
	}
	double avg(int x, int y) {
		double sum = plus(x,y);//자동형 변화 :double(8)<- int(4)
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result =avg(7,10);
		println("실행겨로가:"+ result);
	}
	void println(String message) {
		System.out.println(message);
	}

}
