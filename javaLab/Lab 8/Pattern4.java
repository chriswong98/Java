import java.util.*;
public class Pattern4 {
	public static void main(String [ ] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Number? ");
	int size = input.nextInt();
	for (int i=size; i>=1; i--) {
		for(int j=1; j<=size-i; j++)
			System.out.print(" ");
			
		for(int k=i; k>=1;k--)
			System.out.print(k);
		System.out.println();
		}
	
	
	
	}
}