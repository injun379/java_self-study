package ch7;

// 2.4 super
/*
 * super
 *  - 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조 변수
 *  - 상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을 때 사용한다.
 *  - this와 마찬가지로 static메서드에서는 사용할 수 없고 인스턴스메서드에서만 사용할 수 있다.
 */

class SuperTest {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x=10;
}

class Child extends Parent {
	int x=20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
