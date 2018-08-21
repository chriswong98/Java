import java.util.Scanner;

public class LDLC {
   public static void main( String[] args ) {
   Scanner input = new Scanner(System.in);
   
   int TC, HDLC, TG ;
   double LDLC;
   System.out.print("Enter TC : ");
   TC = input.nextInt();
   System.out.print("Enter HDLC : ");
   HDLC = input.nextInt();
   System.out.print("Enter TG : ");
   TG = input.nextInt();
   
   LDLC = TC - HDLC - (double) TG / 5;
   System.out.print("LDLC = " + LDLC);
   
   
   
   
   
   
   
   
   }
}
