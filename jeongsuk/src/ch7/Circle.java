package ch7;

// 1.2 클래스간의 관계 - 포함관계
/*
 *	포함(Composite)관계 
 *	- 상속 이외에 클래스를 재사용하는  또 다른 방법
 *  - 한 클래스의 멤버변수로 다른 클래스를 선언하는 것
 *  - 코드의 중복을 줄일 수 있고 관리하는데 수월하다.
 */

class Circle1 {
/*	
	int x;		// 원점의 x좌표
	int y;		// 원점의 y좌표
*/	
	Point1 c = new Point1();	// 원점
	int r;		// 반지름(radius)
}

class Point1 {
	int x;		// x좌표
	int y;		// y좌표
}