package ch6;

// 6.3 초기화 블럭(initialization block)

class BlockTest {
	
	/*	클래스 초기화 블럭
	 *	- 클래스가 메모리에 처음 로딩될 때 한 번만 수행	
	 */
	static {
		System.out.println("static { }");
	}
	
	/* 인스턴스 초기화 블럭 
	 * - 인스턴스를 생성할 때마다 수행(생성자보다 먼저 수행)
	 * - 클래스의 모든 생성자에 공통적으로 수행되어야 하느 문장들이 있을 때 사용
	 */
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}
