import java.util.*;

public class Pattern2 {
	public static void main(String [ ] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Number? ");
	int size = input.nextInt();
	
	for (int i=1; i<=size; i++) {
		for (int j=1; j<=size-i; j++)
		    System.out.print(" ");
		for(int k=1; k<=i; k++)
			System.out.print(k);
		System.out.println();
		}
	
	
	
	}
}
	
	
	
	
	
	