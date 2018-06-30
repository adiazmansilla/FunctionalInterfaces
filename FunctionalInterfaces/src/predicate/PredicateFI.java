package predicate;

import java.util.function.Predicate;

/**
 * 
 * @author albertodiaz
 *
 */
public class PredicateFI {

	public static void main(String[] args) {
		printMessage("Alergia");
	}

	private static void printMessage(String message){

		assert message != null : "el mensaje no puede ser nulo";
		
		Predicate<String> pred = x -> x.startsWith("a");

		if (pred.test(message)) {
			System.out.println("the message starts with a");
		} else {
			System.out.println("the message starts with other character");
		}

	}

}
