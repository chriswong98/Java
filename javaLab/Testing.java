import java.util.Scanner;

public class Testing {
	public static void main(String [ ] args) {
		double number=0,sum=0,counter=0,max=0;
		double mean=0;
		double[] mTable =new double[10];
		Scanner input = new Scanner(System.in);
		
		for(int i=1; i<=mTable.length; i++){
			number = input.nextDouble();
			if (number <=0)
				break;
			mTable[i]= number;
			}
			
			sum += number;
			counter++;
	    }
		mean = sum / counter;
		System.out.println("Their sum:" + sum);
		System.out.println("Their mean:" + mean);
	    System.out.println("Their maximum:" + max);
	}
}	

		