package ch6;

// 기본형 매개변수와 참조형 매개변수
// 참조형 매개변수
class ParameterTest2 {
	public static void main(String args[]) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(Data d) {	// 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
