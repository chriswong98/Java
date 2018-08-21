import java.util.*;

public class ExamGrade {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		double examMark;
		System.out.print("Exam mark? ");
		examMark = input.nextDouble();
		
		if (examMark >= 0 && examMark <= 59){
			System.out.print("Grade = F");
			}
		else if (examMark > 59 && examMark <= 69){
			System.out.print("Grade = D");
			}
		else if (examMark > 69 && examMark <= 79){
			System.out.print("Grade = C");
			}
		else if (examMark > 79 && examMark <= 89){
			System.out.print("Grade = B");
			}
		else if (examMark > 79 && examMark <= 89){
			System.out.print("Grade = A");
			}
	
		
		
		
		
		
		
	}
}