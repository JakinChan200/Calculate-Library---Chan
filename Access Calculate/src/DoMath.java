/*This class is client code that uses the Calculate Library to perform various mathematical tasks
 * 
 * @author Jakin Chan
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(5, 10));
		System.out.println(Calculate.average(5, 10, 3));
		System.out.println(Calculate.toDegrees(3.14));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(2, 3, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(6, 2));
		System.out.println(Calculate.absValue(-5.2));
		System.out.println(Calculate.max(4, 2));
		System.out.println(Calculate.max(4, 2, 3));
		System.out.println(Calculate.min(4, 2));
		System.out.println(Calculate.round2(3.1415));
		System.out.println(Calculate.exponent(2, 3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(20));
		System.out.println(Calculate.gcf(230, 350));
		System.out.println(Calculate.sqrt(2));
	}

}
