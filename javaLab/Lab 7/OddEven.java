import java.util.*;
public class OddEven{
	public static void main(String[] args){
		int value;
		int oddcount=0,evencount =0;
		Scanner input = new Scanner(System.in);
		
		for(int i =0; i <5; i++){
		System.out.print("Value? ");
		value = input.nextInt();
		if (value %2 ==0)
		evencount++;
		else 
		oddcount++;
		}
	    System.out.println("Number of odd values = " + oddcount);
		System.out.println("Number of even values = " + evencount);
	
	
	
	
	}
}