package ch6;

// 5.2 기본 생성자(default constructor)

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) {
		value = x;
	}
}

class ConstructorTest {
	public static void main(String args[]) {
		Data1 d1 = new Data1();
	//	Data2 d2 = new Data2();		// compile error 발생. 컴파일러가 자동으로 기본 생성자를 추가해주는 경우는 '클래스 내에 생성자가 하나도 없을 때'뿐이다.
	}
}
