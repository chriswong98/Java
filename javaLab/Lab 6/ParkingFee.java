import java.util.*;

public class ParkingFee {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int vehicleType, noHour, parkingF;
		
		System.out.print("Vehicle Type [1=private, 2=bus, 3=truck]? ");
        vehicleType = input.nextInt();	
        System.out.print("Number of hours? ");
		noHour = input.nextInt();	
		
		
		
		
        if (vehicleType == 1){
		    parkingF = 15 * noHour;
			System.out.print("Parking fee = " + parkingF);
		} 
		else if(vehicleType == 2){
		    parkingF = 35 * noHour;
			System.out.print("Parking fee = " + parkingF);
		} 
		else if(vehicleType == 3){
		    parkingF = 50 * noHour;
			System.out.print("Parking fee = " + parkingF);
		} 
			
        		
		
		
		
		
		
		
		}
}