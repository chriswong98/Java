import java.util.Scanner;



public class CylinderConsole {
   public static void main( String[] args ) {
   Scanner input = new Scanner(System.in);
   int r, l;
   double v;
   
   System.out.print("Enter the radius: ");
   r = input.nextInt();
   System.out.print("Enter the length: ");
   l = input.nextInt();
   v = r * r * Math.PI * l;
   
   System.out.print("The volume of the cylinder with radius=" + r + " and length=" + l + "is\n" + v);
   
   
   
   
   
   
   
   
   
   }
}