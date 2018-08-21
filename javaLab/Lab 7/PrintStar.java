import java.util.*;

public class PrintStar {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		int i = 0;
		System.out.print("Number of stars? ");
		n = input.nextInt();
		
		for (i=0; i<n; i++)
			System.out.print("*");
			
	}
}
