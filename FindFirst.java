package FindFirstelementOfList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(43, 256, 755, 89, 131, 45);
		Optional<Integer> first = list.stream().findFirst();
		System.out.println(first.get());
	}

}
