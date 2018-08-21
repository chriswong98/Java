import java.util.Scanner;


public class BreakCoins {
   public static void main( String[] args ) {
      Scanner input = new Scanner(System.in);
	  int amount, ten, five, two, one;
	  
	  System.out.print("Input an amount: ");
	  amount = input.nextInt();
	  ten = amount / 10;
	  amount = amount % 10;
	  five = amount / 5;
	  two = (amount - five * 5)/2;
	  one = (amount - five * 5 - two * 2);
	  
	  System.out.println("The minimum numbers of coins for 19 dollars are:");
	  System.out.println("10-dollar coin(s): " + ten);
	  System.out.println("5-dollar coin(s): " + five);
	  System.out.println("2-dollar coin(s): " + two);
	  System.out.println("1-dollar coin(s): " + one);
	 
	  
	  
   
   
   
   
   }
}
