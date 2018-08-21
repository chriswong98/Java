import java.util.*;
public class AvgValues2{
	public static void main(String[] args){
	    double sum=0;
		int counter=0,value=0;
	    double average;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Value? ");
		value = input.nextInt();
		for (counter=0; value > 0; counter++){
		System.out.print("Value? ");
		sum += value;
		value = input.nextInt();
		}
		if (counter>0){
			average = sum / counter;
			System.out.println("Average = " + average);
		}
		else
		    System.out.println("No number inputed!");
	}
}