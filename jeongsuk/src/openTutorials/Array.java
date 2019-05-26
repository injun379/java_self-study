package openTutorials;

public class Array {
	public static void main(String args[]) {
		int[] numbers = new int[4];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		
		System.out.println("while");
		
		int i = 0;
		while(numbers.length > i) {
			System.out.println("numbers["+ i + "] = " + numbers[i]);
			i++;
		}
		
		System.out.println("");
		System.out.println("for");
		
		for(i = 0; i < numbers.length; i++) {
			System.out.println("numbers["+ i + "] = " + numbers[i]);
		}
	}
}


