package ch6;

class Card {
	final int NUMBER;		// 상수지만 선언과 함께 초기화 하지 않고,
	final String KIND;		// 생성자에서 단 한 번만 초기화할  수 있다.
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num) {
		KIND = kind;		// 매개변수를 넘겨받은 값으로 
		NUMBER = num;		// KIND와 NUMBER를 초기화한다.
	}
	
	Card() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

class FinalCardTest {
	public static void Main(String args[]) {
		Card c = new Card("HEART", 10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}
