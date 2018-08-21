import java.util.Scanner;



public class CylinderConsole {
   public static void main( String[] args ) {
   Scanner input = new Scanner(System.in);
   double r, l, v;
   
   System.out.print("Enter the radius: ");
   r = input.nextInt();
   System.out.print("Enter the length: ");
   l = input.nextInt();
   v = r * r * Math.PI * l;
   
   System.out.printf("The volume of the cylinder with radius= %.1f" +
       " and length= %.1f is %.3f.", r, l, v);
   
   
   
   
   
   
   
   
   
   }
}