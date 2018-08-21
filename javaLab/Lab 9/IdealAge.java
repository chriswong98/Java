import java.util.Scanner;
public class IdealAge {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		int manAge = kb.nextInt();
		int wifeAge;

		// call idealAge() with manAge as argument
          
		 wifeAge = idealAge(manAge);
		System.out.println("Ideal age of wife = " + wifeAge);
	}

	public static int idealAge(int manAge) {
		return (manAge/2 + 7);
               
	}
}
