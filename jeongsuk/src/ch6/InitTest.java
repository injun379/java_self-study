package ch6;

// 6.1 변수의 초기화
/*
 * 멤버변수(클래스변수와 인스턴스변수)와 배열의 초기화는 선택적이지만, 
 * 지역변수는 반드시 사용하기 전에 초기화를 해주어야 한다.
 * 
 * 멤버변수의 초기화 방법
 * 1. 명시적 초기화 (explicit initialization)
 * 	: 변수를 선업과 동시에 초기화하는 것(가장 기본적이고 가장 우선적으로 고려되어야 함)
 * 2. 생성자(constructor)
 * 3. 초기화 블럭(initialization block) --> 명시적 초기화로는 부족한 경우 사용
 * 	- 인스턴스 초기화 블럭 : 인스턴스변수를 초기화 하는데 사용.
 *  - 클래스 초기화 블럭 : 클래스변수를 초기화 하는데 사용.
 *  
 */
class InitTest {
	int x;			// 인스턴스 변수
	int y = x;		// 인스턴스 변수
	
	void method() {
		int i;		// 지역변수
//		int j = i;	// 컴파일 에러 !!! 지역변수를 초기화하지 않고 사용했음.
	}
}
