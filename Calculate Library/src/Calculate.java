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
		return ((a * c) + variable + "^2 + " + ((a * d) + (b + c)));
	}
}
