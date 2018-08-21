import java.util.*;
public class MultiplicationTable {
	public static void main(String [ ] args) {
	Scanner input = new Scanner(System.in);
		int [][] mTable = new int[10][10];
		System.out.print("  ");
		for(int k=0; k<10; k++)
			System.out.printf("%3d", k);
		System.out.println("\n +------------------------------");
		for (int i=0; i<mTable.length;i++)
			for(int j=0; j<mTable[i].length; j++)
				mTable[i][j] = i*j;
				 
		for (int i=0; i<mTable.length;i++){
			System.out.print(i +"|");
			for(int j=0; j<mTable[i].length; j++)
				System.out.printf("%3d", mTable[i][j]);
			System.out.println();
		}
		
	
	
	
	
	
	
	
	
	
	}
}