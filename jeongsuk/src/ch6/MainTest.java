package ch6;

//3.8 재귀호출(recursive call)

// main메서드 재귀호출
class MainTest {
	public static void main(String args[]) {
		main(null);		// 아무런 조건도 없이 계속 재귀호출하면 무한 호출에 빠지게 된다.
	}
}
