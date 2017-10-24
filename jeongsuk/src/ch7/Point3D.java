package ch7;

// 2.1 오버라이딩이란?
/*
 * 오버라이딩(overriding)
 * - 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것
 */


// 2.2 오버라이딩의 조건
/*
 * 자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와
 *	- 이름이 같아야 한다.
 *	- 매개변수가 같아야 한다.
 *	- 리턴타입이 같아야 한다.
 *
 * 1. 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
 * 	- 만일 조상 클래스에 정의된 메서드의 접근 제어자가 protected라면, 
 * 이를 오버라이딩하는 자손 클래스의 메서드는 접근 제어자가 protected나 public이어야 한다.
 * 
 * 2. 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
 * 
 * 3. 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.
 */
class Point2D {
	int x;
	int y;
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point2D {
	int z;
	
	String getLocation() {		// 오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}
