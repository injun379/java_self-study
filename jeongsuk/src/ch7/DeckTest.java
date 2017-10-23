package ch7;

//1.3 클래스간의 관계 결정하기

// 카드 섞은 후 카드 뽑기

class DeckTest {
	public static void main(String args[]) {
		Deck d = new Deck();	// 카드 한 벌(Deck)을 만든다.
		Card1 c = d.pick(0);	// 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);	// System.out.println(c.toString()); 과 같다.
		d.shuffle();			// 카드를 섞는다.
		c = d.pick(0);			// 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);
	}
}

// Deck 클래스
class Deck {
	final int CARD_NUM = 52;	// 카드의 개수
	Card1 c[] = new Card1[CARD_NUM];
	
	Deck() {		// Deck의 카드를 초기화한다.
		int i = 0;
		
		for(int k=Card1.KIND_MAX; k>0; k--) {
			for(int n=1; n < Card1.NUM_MAX + 1; n++) {
				c[i++] = new Card1(k, n);
			}
		}
	}
	
	Card1 pick(int index) {		// 지정한 위치(index)에 있는 카드 하나를 선택한다.
		if(0 <= index && index < CARD_NUM) {
			return c[index];
		} else {
			return pick();
		}
	}
	
	Card1 pick() {				// Deck에서 카드 하나를 선택한다.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int n=0; n < 1000; n++) {
			int i = (int)(Math.random() * CARD_NUM);
			Card1 temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
	}
}


// Card 클래스
class Card1 {
	static final int KIND_MAX = 4;	// 카드 무늬의 수
	static final int NUM_MAX = 13;	// 무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card1() {
		this(SPADE, 1);
	}
	
	Card1(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String kind = "";
		String number = "";
		
		switch(this.kind) {
			case 4 : 
				kind = "SPADE";
				break;
			case 3 : 
				kind = "DIAMOND";
				break;
			case 2 : 
				kind = "HEART";
				break;
			case 1 : 
				kind = "CLOVER";
				break;
			default :
		}
		
		switch(this.number) {
		case 13 : 
			number = "K";
			break;
		case 12 : 
			number = "Q";
			break;
		case 11 : 
			number = "J";
			break;
		default : 
			number = this.number + "";
		}
		return "kind : " + kind + ", number : " + number;
	}	// toString()의 끝
}	// Card1클래스의 끝