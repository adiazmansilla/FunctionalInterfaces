package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
/**
 * 
 * @author albertodiaz
 *
 */
public class FunctionFI {

	public static void main(String[] args) {
		
		Integer[] list = {1,2,3,4};

		printResult(Arrays.asList(list));
	}

	private static void printResult(List<Integer> list) {

		Function<Integer, Integer> fun = x -> x * x;

		list.stream().forEach(y -> System.out.println(fun.apply(y)));

	}

}
