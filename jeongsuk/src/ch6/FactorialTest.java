package ch6;

// 3.8 재귀호출(recursive call)

/* 팩토리얼 
 * 
 * n! = n * n-1 * n-2 * n-3 * ... * 1
 * f(n) = n * f(n-1), 단 f(1) = 1.
 * 
 */
class FactorialTest {
	public static void main(String args[]) {
		System.out.println(factorial(4));	// FactorialTest.factorial(4)
	}

	// if문을 이용한 factorial메서드
	static long factorial(int n) {
		long result = 0;
		
		if( n == 1) {
			result = 1;
		} else {	
			result = n * factorial(n-1);	// 다시 메서드 자신을 호출한다.
		}
		
		return result;
	}
	
	// 삼항 연산자 (? :)를 이용한 factorial메서드
	static long factorial2(int n) {
		return (n == 1) ? 1 : n * factorial2(n-1);
	}
}
