import java.util.*;

public class Factorial {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		
		int n;
		int ans =1;
		
		System.out.print("n? ");
		n = input.nextInt();

		for (int i=n; i >=1 ; i--){
		   
			ans *= i;
		    }

		System.out.println(n + "! =" + ans);
		
		
		
		
	}
}