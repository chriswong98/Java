import java.util.Scanner;

public class Quadratic {
	public static void main( String[] args ) {
	Scanner input = new Scanner(System.in);
	Double a, b, c, x1, x2, temp1;
   
	System.out.print("Enter a: ");
	a = input.nextDouble();
	System.out.print("Enter b: ");
	b = input.nextDouble();
	System.out.print("Enter c: ");
	c = input.nextDouble();
	
	double temp1 = Math.sqrt(b * b - 4 * a * c);
 
    x1 = (-b +  temp1) / (2*a) ;
    x2 = (-b -  temp1) / (2*a) ;
	
	
	System.out.print("x1=" + x1 + " x2=" + x2 );
	}	
}

		
		
		
		