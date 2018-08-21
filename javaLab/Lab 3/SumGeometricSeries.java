import java.util.Scanner;


public class SumGeometricSeries {
   public static void main( String[] args ) {
    
   Scanner input = new Scanner(System.in);
   double power, r, n, S, a;
   
   System.out.print("Enter a:");
   a = input.nextDouble();
   System.out.print("Enter R:");
   r = input.nextDouble();
   System.out.print("Enter n:");
   n = input.nextDouble();
    power = (double) Math.pow(r, n);
	
	S = (a * (power - 1)) / (r - 1);
	
	System.out.println("S=" + S);
	}
}
	
	
	