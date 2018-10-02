/*This class is to take the input from the user and output the descriptions of the quadratic graph
 *
 * @author Jakin Chan
 * @version 2 October 2018
 */

import java.util.*;
public class QuadraticClient {
	public static void main(String[] args) {
		System.out.println("Input your coefficients");
		Scanner userInput = new Scanner(System.in);
		double a = userInput.nextDouble();
		double b = userInput.nextDouble();
		double c = userInput.nextDouble();
		userInput.close();
		if(a == 0) throw new IllegalArgumentException("a cannot be zero");
		System.out.println(Quadratic.quadrDescriber(a, b, c));
	}


}