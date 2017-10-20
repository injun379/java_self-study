package ch6;

// 5.5 생성자를 이용한 인스턴스의 복사

/*
 * 인스턴스를 생성할 때 는 다음의 2가지 사항을 결정해야 한다.
 * 1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
 * 2. 생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 성성할 것인가?
 */


class Car3 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	
	Car3() {	// 생성자
		this("white", "auto", 4);	// 생성자에서 다른 생성자는 this()로 호출한다.
	}
	
	Car3(Car3 c) {					// 인스턴스 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car3(String color, String gearType, int door) {	// 생성자
		this.color = color;			// this - 인스턴스 자신을 가리키는 참조변수
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest3 {
	public static void main(String args[]) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);		// c1의 복사본 c2를 생성한다.
		System.out.println("c1의 color=" + c1.color + ", gearType="
										+ c1.gearType + ", door="+ c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType="
										+ c2.gearType + ", door="+ c2.door);
		c1.door = 100;		// c1의 인스턴스 변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행 후");
		System.out.println("c1의 color=" + c1.color + ", gearType="
										+ c1.gearType + ", door="+ c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType="
										+ c2.gearType + ", door="+ c2.door);
	}
}
