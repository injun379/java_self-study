package ch6;

// 3.2 클래스 변수와 인스턴스 변수

class CardTest {
	public static void main(String args[]) {
		System.out.println("Card.width = " + Card1.width);
		System.out.println("Card.height = " + Card1.height);
		
		Card1 c1 = new Card1();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card1 c2 = new Card1();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 "+ c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 "+ c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 "+ c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 "+ c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
	}

}

class Card1 {
	String kind;		// 카드의 무늬 - 인스턴스 변수
	int number;			// 카드의 숫자 - 인스턴스 변수
	static int width = 100;	// 카드의 폭 - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수
}
