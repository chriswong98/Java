import java.util.Scanner;

public class Pattern {
	public static void main(String [ ] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Number? ");
		number = input.nextInt();
		
		for (int i=1;i<=number;i++){
			if (i > 1)
				System.out.print("\n");
			for(int j=1;j<=i;j++)
				System.out.print(j);
		}
			
		
		
	}
}	