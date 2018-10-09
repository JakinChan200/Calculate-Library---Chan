/*This class calculates the descriptions of the graph and sends it to QuadraticClient
 * 
 * @author Jakin Chan
 * @version 2 October 2018
 */

public class Quadratic {
	
	public static String quadrDescriber(double a, double b, double c) {
		//declare variables
		String GraphOpens;
		String Equation = "y = " + a + "^2 + " + b + "x + " + c;
		double AxisOfSymmetry = (b * -1) / (2 * a);
		double YOfVertex = (a * AxisOfSymmetry * AxisOfSymmetry) + (b * AxisOfSymmetry) + c;
		String XIntercept = quadForm(a, b, c);
		
		//If AxisOfSymmetry is -0.0, turns it to 0.0
		if(AxisOfSymmetry == 0){
			AxisOfSymmetry *= -1;
		}
		
		//checks if the graph opens up or down and assign it to GraphOpens
		if(a >= 0) {
			GraphOpens = "Up";
		} else {
			GraphOpens = "Down";
		}
		
		//returns description of graph including equation, opening direction, vertex, and x and y intercepts
		return "Description of the graph of: \n" + Equation + 
			"\n\nOpens: " + GraphOpens + 
			"\nAxis of Symmetry: " + round2(AxisOfSymmetry) +
			"\nVertex: (" + round2(AxisOfSymmetry) + ", " + round2(YOfVertex) + ")" +
			"\nx-intercept(s): " + XIntercept +
			"\ny-intercept: " + c + 
			"\n";
	}
	
	public static double absValue(double num) {	
		//returns the absolute value of the input
		if(num < 0) {
			num *= -1;
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
		
		//returns 0 when num is equal or less than 0
		if(num <= 0){
			return 0.0;
		}
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