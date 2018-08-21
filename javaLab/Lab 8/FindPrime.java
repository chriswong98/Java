public class FindPrime {
	public static void main(String [ ] args) {
		int count=1, counter=0;
		System.out.print(2);  // 2 is the first prime number
		int num=2;
		while (count < 20) {
			num++;			// try next number
			boolean isPrime=true;
			for (int i=2; i<num; i++) {
			    counter++;
				if (num%i == 0){	// divisible by i
					isPrime = false;    // not a prime
					break;
				}
			}
			if (isPrime) {
				count++;	// one more prime is found
				System.out.print(", " + num);
			}
		}
		System.out.println("\nDone");
		System.out.println("Total calculation = "+counter);
	}
}	
