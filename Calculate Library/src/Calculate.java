/*This class contains methods that perform various math operations
 * 
 * @author Jakin Chan
 * @version September 6, 2018
 */

public class Calculate {
	//return the square of the input
	public static int square(int num) {
		return num * num;
	}
	
	public static int cube(int num) {
		return num * num * num;
	}
	
	public static double average(double num1, double num2) {
		return ((num1 + num2)/2);
	}
	
	public static double average(double num1, double num2, double num3) {
		return ((num1+num2+num3)/2);
	}
	
	public static double toDegrees(double radian) {
		return (radian * (180/3.14159));
	}
	
	public static double toRadians(double degrees) {
		return (degrees * (3.14159/180));
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b * b) - 4 * a *c;
	}
	
	public static String toImproperFrac(int wholenum, int numerator, int denominator) {
		return ((wholenum*denominator)+numerator) + "/" + denominator;
	}
	
	public static String toMixedNum(int numerator, int denominator) {
		return ((numerator / denominator) + "_" + (numerator % denominator) + "/" + denominator);
	}
	
	public static String foil(int a, int b, int c, int d, String variable) {
		return ((a * c) + variable + "^2 + " + ((a * d) + (b * c)) + variable + " + " + (b * d));
	}
	
	public static boolean isDivisibleBy(int num1, int num2) {
		return num1 % num2 == 0;
	}
	
	public static double absValue(double num) {	
		if(num < 0) {
			num*= -1;
		}
		return num;
	}
	
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double max(double num1, double num2, double num3) {
		double MaxValue;
		if(num1 > num2) {
			MaxValue = num1;
		} else {
			MaxValue = num2;
		}
		
		if(MaxValue > num3) {
			return MaxValue;
		} else {
			return num3;
		}
	}
	
	public static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double round2(double num) {
		if(((num * 100) % 10) > 5) {
			num += 0.01;
		}
		int roundedNum = (int) (num * 100);
		return (((double) roundedNum) / 100);	
	}
	
	public static double exponent(double num, int power) {
		double totalValue = 1;
		for(int i = 0; i < power; i++) {
			totalValue *= num;
		}
		return totalValue;
	}
}
