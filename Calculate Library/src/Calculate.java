/*This class contains methods that perform various math operations
 * 
 * @author Jakin Chan
 * @version September 6, 2018
 */

public class Calculate {
	//returns the square of the input
	public static int square(int num) {
		return num * num;
	}
	
	public static int cube(int num) {
		//returns the cube of the input
		return num * num * num;
	}
	
	public static double average(double num1, double num2) {
		//returns the average of two doubles
		return ((num1 + num2) / 2 );
	}
	
	public static double average(double num1, double num2, double num3) {
		//returns the average of three doubles
		return ((num1 + num2 + num3) / 3);
	}
	
	public static double toDegrees(double radian) {
		//returns the equivalent degree value of a radian value
		return (radian * (180/3.14159));
	}
	
	public static double toRadians(double degrees) {
		//returns the equivalent radian value of a degree value
		return (degrees * (3.14159/180));
	}
	
	public static double discriminant(double a, double b, double c) {
		//returns the discriminant of three doubles ((b^2) - 4ac)
		return (b * b) - 4 * a *c;
	}
	
	public static String toImproperFrac(int wholenum, int numerator, int denominator) {
		//changes a mixed number in the form of three integers into an improper fraction and returns it 
		return ((wholenum*denominator)+numerator) + "/" + denominator;
	}
	
	public static String toMixedNum(int numerator, int denominator) {
		//changes an improper fraction in the form of teo integers into a mixed number and returns it
		return ((numerator / denominator) + "_" + (numerator % denominator) + "/" + denominator);
	}
	
	public static String foil(int a, int b, int c, int d, String variable) {
		//takes in four integers and a string and applies the mathematical process "foil" and returns the result
		return ((a * c) + variable + "^2 + " + ((a * d) + (b * c)) + variable + " + " + (b * d));
	}
	
	public static boolean isDivisibleBy(int numerator, int denominator) {
		//throws the denominator if it is 0
		if(denominator == 0) throw new IllegalArgumentException("The denominator cannot be 0");
		
		//checks if the numerator is divisible by the denominator and returns either true or false
		return numerator % denominator == 0;
	}
	
	public static double absValue(double num) {	
		//returns the absolute value of the input
		if(num < 0) {
			num*= -1;
		}
		return num;
	}
	
	public static double max(double num1, double num2) {
		//returns the larger value between num1 and num2
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double max(double num1, double num2, double num3) {
		double MaxValue;
		
		//takes the larger value between num1 and num2
		if(num1 > num2) {
			MaxValue = num1;
		} else {
			MaxValue = num2;
		}
		
		//takes the final larger number
		if(MaxValue > num3) {
			return MaxValue;
		} else {
			return num3;
		}
	}
	
	public static int min(int num1, int num2) {
		//takes the smaller value between num1 and num2
		if(num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double min(double num1, double num2) {
		//takes two doubles and returns the smaller number
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
	
	public static double exponent(double base, int power) {
		//throws negative numbers and 0
		if(power <= 0) throw new IllegalArgumentException("you cannot enter a negaive power");
		
		//multiplies the base by the totalValue for the number of times dictated in the variable "power"
		double totalValue = 1;
		for(int i = 1; i <= power; i++) {
			totalValue *= base;
		}
		return totalValue;
	}
	
	public static int factorial(int num){
		int factorialResult = 1;
		//throws negative numbers
		if(num < 0) throw new IllegalArgumentException("You cannot enter a negative number");
		
		//loops through every number between num and 0 and multiplies it
		for(int i = num; i> 0; i--){
			factorialResult *= i;
		}
		return factorialResult;
	}

	public static boolean isPrime(int num){
		boolean isItPrime = false;
		
		//goes through all numbers between 0 and num to see if it is divisible
		for (int i = 2; i < num; i++){
			if(isDivisibleBy(num, i) == true){
				isItPrime = true;
			}
		}
		return isItPrime;
	}

	public static int gcf(int num1, int num2){
		int commonFactor = 1;
		
		//calculates and returns the gcf
		for(int i = 1; i <= num1; i++){
			if(isDivisibleBy(num1, i) == true && isDivisibleBy(num2, i) == true){
				if(i > commonFactor){
					commonFactor = i;
				}
			}
		}
		return commonFactor;
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
	
	public static String quadForm(int a, int b, int c) {
		int numRoots;
		if(discriminant(a, b, c) <= 0) throw new IllegalArgumentException("no real roots");
		if(a == 0) throw new IllegalArgumentException("a cannot be zero");
		double QuadraticNumerator = sqrt(discriminant(a, b, c));
		double RootOne = round2((-1 * b) + QuadraticNumerator / (2 * a));
		double RootTwo = round2(((-1 * b) - QuadraticNumerator) / (2 * a));
		
		if(RootOne == RootTwo) {
			numRoots = 1;
		}else {
			numRoots = 2;
		}
		
		if(numRoots == 1) {
			return RootOne + "";
		}else {
			return min(RootOne, RootTwo) + " and " + max(RootOne, RootTwo);
		}
	}
}
