import java.util.*;

public class Fib {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("? ");
		int num = kb.nextInt();
        printFib(num);
		// call printFib() with num as argument
		
	}

	public static void printFib(int num) {
		if (num>=1)
			System.out.print("1");
		if (num>=2)
		    System.out.print(", 1");
		int fiminus1=1, fiminus2=1, f;
		for(int i=3; i<=num; i++){
		    f = fiminus1+fiminus2;
			System.out.print(", " + f);
		    fiminus2 = fiminus1;
			fiminus1 = f;
		}

	}
}
