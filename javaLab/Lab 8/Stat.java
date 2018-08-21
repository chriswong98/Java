import java.util.*;
public class Stat {
	public static void main(String [ ] args) {
	Scanner input = new Scanner(System.in);
	
	double value;
	double[] data = new double[10];
	int count=0;
	
	for (int i=0; i<10;i++) {
		System.out.print("Value? ");
		value = input.nextDouble();
		if (value<0)
		    break;
		data[i] = value;
		count++;
	}
	
	double sum=0;
	for (int i=0; i<count;i++)
		sum += data[i];
	System.out.printf("The sum is %.2f %n" , sum);	
	
	double mean=0;
	mean = sum / count;
	System.out.printf("The mean is %.2f %n" , mean);
	
	double max = data[0];
	for (int i=1; i<count;i++)
		if (data[i]>max)
			max = data[i];
	System.out.println("The maximum is " + max);
	
	double min = data[0];
	for (int i=1; i<count;i++)
		if (data[i]<min)
			min = data[i];
	System.out.println("The minimum is " + min);
	
	double sd=0,sdsum=0;
	for (int i=0;i<count;i++){
		sdsum += Math.pow((data[i]-mean),2);
	}
	sd = Math.sqrt(sdsum/(count-1));
	System.out.printf("The standard deviation is %.2f %n" , sd);
	}
}