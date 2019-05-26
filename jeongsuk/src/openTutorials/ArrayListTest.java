package openTutorials;
import java.util.*;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(1, 50);
						
		System.out.println("\nfor each");
		for(int value : numbers) {
			System.out.println(value);		
		}
		
		Iterator<Integer> it = numbers.iterator();
		System.out.println("\niterator");
		while(it.hasNext()){
			int value = it.next();
			if(value == 30){
				it.remove();
			}						
			System.out.println(value);
		}
		
		System.out.println("\nfor");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
	}
}
