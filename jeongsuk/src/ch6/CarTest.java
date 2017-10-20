package ch6;

// 5.4 매개변수가 있는 생성자

class Car {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	
	Car() {}	// 생성자
	
	Car(String c, String g, int d) {	// 생성자
		color = c;
		gearType = g;
		door = d;
	}
}

class CarTest {
	public static void main(String args[]) {
		Car2 c1 = new Car2();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car2 c2 = new Car2("white", "auto", 4);
		System.out.println("c1의 color=" + c1.color + ", gearType="
										+ c1.gearType + ", door="+ c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType="
										+ c2.gearType + ", door="+ c2.door);
	}
}
