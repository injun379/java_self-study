package ch7;

// 1. 상속 (inheritance)
// 1.1 상속의 정의와 장점

/*
 * - 생성자와 초괴화 블럭은 상속되지 않는다. 멤버(변수와 메서드)만 상속된다.
 * - 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
 * 
 * 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성된다.
 */

class Tv {
	boolean power;		// 전원상태(on/off)
	int channel;		// 채널
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv {
	boolean caption;		// 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {		// 캡션상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;					// 조상 클래스로부터 상속받은 멤버
		ctv.channelUp();					// 조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;						// 캡션기능을 켠다.
		ctv.displayCaption("Hello, World");		// 캡션을 화면에 보여 준다.
	}
}
