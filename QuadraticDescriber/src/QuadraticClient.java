/*This class is to take the input from the user and output the descriptions of the quadratic graph
 *
 * @author Jakin Chan
 * @version 2 October 2018
 */

import java.util.*;

//ask users for coefficients of a quadratic equation and prints the description of the graph
public class QuadraticClient {
	public static void main(String[] args) {
		//Declare variables and prints introduction
		Scanner userInput = new Scanner(System.in);
		boolean keepGoing = true;
		System.out.println("Welcome to Quadratic Describer" + 
				"\nProvide values for coefficients a, b, and c");
		
		//ask user for variables and print description of graph
		while(keepGoing){
			System.out.println();
			System.out.print("a: ");
			double a = userInput.nextDouble();
			System.out.print("b: ");
			double b = userInput.nextDouble();
			System.out.print("c: ");
			double c = userInput.nextDouble();
			System.out.println();
		
			if(a == 0) throw new IllegalArgumentException("a cannot be zero");
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			
			//ask the user if the user wants to quit and closes the loop if yes
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String userResponse = userInput.next();
			if(userResponse.equals("quit")){
				keepGoing = false;
				userInput.close();
			}
		}
	}
}