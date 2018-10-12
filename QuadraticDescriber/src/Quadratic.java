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
	
	//returns the absolute value of the input
	public static double absValue(double num) {	
		if(num < 0) {
			num *= -1;
		}
		return num;
	}
	
	//returns the discriminant (b^2) - 4ac of three doubles
	public static double discriminant(double a, double b, double c) {
		return (b * b) - 4 * a *c;
	}
	
	//returns the larger value of two doubles
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	//returns the smaller value of two doubles
	public static double min(double num1, double num2) {
		if(num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	//returns the double rounded to the hundredths place
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
	
	//returns the square root of a double
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
	
	//returns the roots of a quadratic equation using the inputs of a, b, and c
	public static String quadForm(double a, double b, double c) {
		double discrim = discriminant(a, b, c);
		double sqrtOfDiscrim = sqrt(discrim);
		
		if(discrim < 0) {
			return "none";
		} else if (discrim == 0){
			return (-1 * b) / (2 * a) + "";
		} else {
			double RootOne = round2(((-1 * b) + sqrtOfDiscrim) / (2 * a));
			double RootTwo = round2(((-1 * b) - sqrtOfDiscrim) / (2 * a));
			return min(RootOne, RootTwo) + " and " + max(RootOne, RootTwo);
		}
	}
}