import java.util.*;
public class CheckPrime {
	public static void main(String [ ] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("?");
		int num = kb.nextInt();
		boolean isPrime;
	    isPrime = isPrime(num);
		if(isPrime)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean isPrime(int num){
		boolean isPrime=true;
		for (int i=2; i<num; i++) {
		    if (num%i == 0){	
				isPrime = false;    
				break;
			}
		}
		return isPrime;
	}
	
	
}	