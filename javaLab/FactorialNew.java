import java.util.*;

public class FactorialNew {
	public static void main(String [] args) {
		double sum=0;
		int counter=0,value=0;
	    double average;
		
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Value? ");
			value = input.nextInt();
			if(value >0){
			sum +=value;
			counter++;
			}
		}
		while ( value > 0);
		
		if (counter > 0){
			average = sum / counter;
			System.out.println("Average = " + average);
		}
		
		else 
			System.out.println("No number inputed!");
			
	
		
		
		
		
	}
}
