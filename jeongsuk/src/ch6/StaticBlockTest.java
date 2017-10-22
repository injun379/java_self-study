package ch6;

// 6.3 초기화 블럭 - 클래스 초기화 블럭
/*
 *	인스턴스변수의 복잡한 초기화는 생성자 또는 인스턴스 초괴화 블럭을 사용한다.
 *
 */
class StaticBlockTest {
	static int[] arr = new int[10];		// 명시적 초기화
	
	static {
		for(int i=0; i<arr.length; i++) {
			// 1과 10 사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public static void main(String args[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+ i +"] : "+ arr[i]);
		}
	}
}

