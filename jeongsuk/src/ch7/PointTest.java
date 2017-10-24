package ch7;

// 2.5 super() - 조상 클래스의 생성자
/*
 * 조상 클래스의 생성자를 호출하는데 사용
 * 
 * Object클래스를 제외한 모든 클래스의 생성자 첫 줄에는 생성자(같은 클래스의 다른 생성자 또는 조상의 생성자)를 호출해야 한다.
 * 그렇지 않으면 컴파일러가 자동적으로 'super();'를 생성자의 첫 줄에 삽입한다.
 * 
 * 생성자가 정의되어 있는 클래스에는 컴파일러가 기본 생성자를 자동적으로 추가하지 않는다.
 * 
 * 1.클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
 * 2.생성자 - 선택한 클래스의 어떤 생성자를 이용해서 인스턴스를 생성할 것인가?
 *
 */
class PointTest {
	public static void main(String args[]) {
		Point_3d p3 = new Point_3d();
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
	}
}

class Point2 {
	int x = 10;
	int y = 20;
	
	Point2(int x, int y) {
		super();		// 조상인 Object클래스의 생성자 Object()를 호출한다.
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point_3d extends Point2 {
	int z = 30;
	
	Point_3d() {
		this(100, 200, 300);	// Point_3d(int x, int y, int z)를 호출한다.
	}
	
	Point_3d(int x, int y, int z) {
		super(x, y);			// Point2(int x, int y)를 호출한다.
		this.z = z;
	}
}
