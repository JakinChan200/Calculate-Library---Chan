/*This class calculates the descriptions of the graph and sends it to QuadraticClient
 * 
 * @author Jakin Chan
 * @version 2 October 2018
 * 
 * equation, opens, axis of symmetry, vertex, x-intercept, y-intercepts
 */

public class Quadratic {
	
	public static String quadrDescriber(double a, double b, double c) {
		String GraphOpensUp;
		String equation = a + "^2  + " + b + "x + " + c;
		double AxisOfSymmetry = (b * -1) / (2 * a);
		double YOfVertex = (a * AxisOfSymmetry * AxisOfSymmetry) + (b * AxisOfSymmetry) + c;
		
		if(a >= 0) {
			GraphOpensUp = "up";
		} else {
			GraphOpensUp = "down";
		}
		return "Description of the graph of: \n" + 
		equation + 
		"\n \n Opens: " + GraphOpensUp +
		"\n Vertex: " + AxisOfSymmetry + ", " + YOfVertex +
		"\n x-intercept: " + 
		"\n y-interrcept: " + c;
		
	}
	
	public static double absValue(double num) {	
		//returns the absolute value of the input
		if(num < 0) {
			num*= -1;
		}
		return num;
	}
	
	public static double discriminant(double a, double b, double c) {
		//returns the discriminant of three doubles ((b^2) - 4ac)
		return (b * b) - 4 * a *c;
	}
	
	public static double max(double num1, double num2) {
		//returns the larger value between num1 and num2
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double min(double num1, double num2) {
		//takes the smaller value between num1 and num2
		if(num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double round2(double numToRound) {
		//rounds the hundredths place if the number in the thousandths place is five or greater
		if(numToRound >= 0) {
			numToRound += 0.005;
		}else{
			numToRound += -0.005;
		}
		
		//truncates everything behind the hundredths value 
		int roundedNum = (int) (numToRound * 100);
		return (((double) roundedNum) / 100);	
	}
	
	public static double sqrt(double num){
		double guess = num;
		//throws an exception when the input is negative
		if(num <= 0) throw new IllegalArgumentException("Input cannot be negative");
		
		//keeps guessing until the difference between guess^2 and num is less than 0.005
		while(absValue(num - (guess * guess)) >= 0.005){
			guess = (0.5 * ((num/guess) + guess));
		}
		return round2(guess);
	}
	
	public static String quadForm(double a, double b, double c) {
		int numRoots;
		double discrim = discriminant(a, b, c);
		double QuadraticNumerator = sqrt(discrim);
		if(a == 0) throw new IllegalArgumentException("a cannot be zero");
		
		//Checks and returns a statement saying "no real roots" if there are no roots
		if(discrim <= 0) {
			return "no real roots";
		}

		double RootOne = round2(((-1 * b) + QuadraticNumerator) / (2 * a));
		double RootTwo = round2(((-1 * b) - QuadraticNumerator) / (2 * a));
		
		//checks if there are one or two roots
		if(RootOne == RootTwo) {
			numRoots = 1;
		}else {
			numRoots = 2;
		}
		
		//returns strings based on the number of roots and order it so the smaller root comes first
		if(numRoots == 1) {
			return RootOne + "";
		}else {
			return min(RootOne, RootTwo) + " and " + max(RootOne, RootTwo);
		}
	}
	
}