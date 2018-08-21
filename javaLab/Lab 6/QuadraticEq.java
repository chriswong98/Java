import java.util.*;

public class QuadraticEq {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		Double a,b,c,x1,x2,discri;
		
		System.out.print("Enter a: ");
		a = input.nextDouble();
		System.out.print("Enter b: ");
		b = input.nextDouble();
		System.out.print("Enter c: ");
	    c = input.nextDouble();
		
		x1 = (-b + Math.sqrt(b * b - 4 * a * c))/ (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c))/ (2 * a);
		
		discri = b * b - 4 * a * c;
		
		if (a == 0){
			System.out.println("This is not a quadratic equation.");
			}
		else if ( discri > 0){
			System.out.println("x1 = " + x1 + " x2 = " + x2);
			System.out.println("Discriminant: " + discri);
			}
		else if ( discri == 0){
			System.out.println("x1 = " + x1);
			System.out.println("Discriminant: " + discri);
			}
		else if ( discri < 0){
			System.out.println("No real solution");
			System.out.println("Discriminant: " + discri);
			}
		
		
		}
}
		
		
		
