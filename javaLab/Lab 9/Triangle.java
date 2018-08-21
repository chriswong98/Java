import java.util.Scanner;

public class Triangle {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		if(triangle(a,b,c)){
		System.out.println("It is a right angle");
		}
		else
		System.out.println("It is not a right angle");
		
	}
	
	
    public static boolean triangle(int a,int b,int c) {
			return a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a;
			
			
	}
	
	
}