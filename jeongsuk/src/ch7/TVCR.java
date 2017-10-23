package ch7;

// 1.4 단일상속(single inheritance)
/*
 * 자바에서는 단일 상속만을 허용, 다중상속 불가
 * 
 * 단일상속
 * 1.장점 
 *  - 클래스 간의 관계가 명확하다.
 *  - 코드를 더욱 신뢰할 수 있게 만들어 준다.
 * 2.단점
 *  - 두 개 이상의 클래스로부터 상속을 받을 수 없다.
 *
 * 다중 상속
 * 1.장점
 *  - 복합적인 기능을 가진 클래스를 쉽게 작성할 수 있다.
 * 2.단점(자바가 단일상속만 허용하는 주된 이유)
 *  - 클래스간의 관계가 매우 복잡해진다.
 *  - 서로 다른 클래스로부터 상속받은 멤버간의 이름이 같을 경우 구별할 수 있는 방법이 없다.
 */

// 1.5 Object클래스 - 모든 클래스의 조상
/*
 * Object클래스
 * - 모든 클래스 상속계층도의 제일 위에 위치하는 조상클래스이다.
 * - 모든 클래스는 Object클래스에 정의된 멤버들을 사용할 수 있다.(toString()이나 equals() 메서드 등)
 * - 다른 클래스로부터 상속 받지 않는 모든 클래스들은 자동적으로 Object클래스로부터 상속받는다.(extends Object는 생략)
 * 
 */

class Tv1 {
	boolean power;	// 전원상태 (on/off)
	int channel;	// 채널
	
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

class VCR {
	boolean power;	//전원상태(on/off)
	int counter = 0;
	
	void power() {
		power = !power;
	}
	
	void play() {
		/* 내용 생략 */
	}
	
	void stop() {
		/* 내용 생략 */
	}
	
	void rew() {
		/* 내용 생략 */
	}
	
	void ff() {
		/* 내용 생략 */
	}
}

class TVCR extends Tv1 {
	VCR vcr = new VCR();	// VCR클래스를 포함시켜서 사용
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
