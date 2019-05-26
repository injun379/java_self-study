package openTutorials;

public class Main {
	public static void main(String args[]) {
		ArrayList1 numbers = new ArrayList1();
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);		
		numbers.add(1, 15);
		numbers.addFirst(5);
		System.out.println(numbers);
		
		numbers.remove(3);
		System.out.println(numbers);
		
		numbers.removeFirst();
		System.out.println(numbers);
		
		numbers.removeLast();
		System.out.println(numbers);
		
		System.out.println(numbers.get(2));
		System.out.println(numbers.size());
		
		System.out.println(numbers.indexOf(15));
		System.out.println(numbers.indexOf(40));
		
	}
}
