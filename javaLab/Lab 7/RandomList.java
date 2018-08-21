import java.util.*;

public class RandomList {
    public static void main(String arga[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Number of random number: ");
		int sum=0;
		int n = input.nextInt();
		int[] numbers = new int[n];
		
		for (int i=0; i< numbers.length; i++)
			numbers[i] = (int) (Math.random() * 100);
			
		for (int i=0; i< numbers.length; i++){
		    System.out.println(numbers[i]);
			sum += numbers[i];
		}
			
		System.out.println("Sum = " + sum);
	}
}	