import java.util.*;
public class AvgValues{
	public static void main(String[] args){
	    double times, average,sum=0,value=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many values to enter? ");
	    times = input.nextDouble();
		for (int i=0; i < times; i++){
		System.out.print("Value? ");
		value = input.nextDouble();
		sum += value;
		}
		average = sum / times;
		System.out.print("Average = " + average);
		}
	}


