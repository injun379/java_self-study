package ch6;

//3.8 재귀호출(recursive call)

class PowerTest {
	
	// x^1 부터 x^n까지의 합을 구하는 예제
	public static void main(String args[]) {
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		
		System.out.println(result);
	}
	
	// x의 n 제곱을 구하는 메서드
	static long power(int x, int n) {
		if(n == 1) return x;		// n이  1일 경우 x를 반환(x의 1제곱)
		return x * power(x, n-1);	// 재귀호출 
	}
}
