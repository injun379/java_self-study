package ch6;

// 5.4 생성자에서 다른 생성자 호출하기 - this(), this

class Car2 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	
	Car2() {	// 생성자
		this("white", "auto", 4);	// 생성자에서 다른 생성자는 this()로 호출한다.
	}
	
	Car2(String color) {
		this(color, "auto", 4);		// 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출 가능하다.
	}
	
	Car2(String color, String gearType, int door) {	// 생성자
		this.color = color;			// this - 인스턴스 자신을 가리키는 참조변수
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest2 {
	public static void main(String args[]) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		System.out.println("c1의 color=" + c1.color + ", gearType="
										+ c1.gearType + ", door="+ c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType="
										+ c2.gearType + ", door="+ c2.door);
	}
}
