import java.util.*;

public class PrintOdd {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		
		int n;
		System.out.print("n? ");
		n = input.nextInt();
		
		int i = 0;
		while (i < n){
		     System.out.print(2*i+1 + " ");
			 i++;
		}

		System.out.println();
		
		for (i=0; i<n; i++)
		    System.out.print(2*i+1 + " ");
			 
		
	}
}