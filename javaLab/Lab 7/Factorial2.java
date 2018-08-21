import java.util.*;

public class Factorial2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		
		int n;
		int ans =1;
		
		System.out.print("n? ");
		n = input.nextInt();

		for (int i=n; i >=1 ; i--){
		    if (i == 1){
		    System.out.print(i);
			}
			else 
			System.out.print(i + " x ");
			ans *= i;
		    }

		System.out.println(" = " + ans);
		
		
		
		
	}
}