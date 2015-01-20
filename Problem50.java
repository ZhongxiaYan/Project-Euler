
public class Problem50 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primes[] = new int [78499];
		int a = 3;
		primes[0] = 2;
		int counter = 1;
		while (a < 90001) {
			int b = 2;
			boolean prime = true;
			while (b < a/2) {
				if (a%b==0) {
					prime = false;
				}
				b++;
			}
			if (prime == true) {
				primes[counter] = a;
				counter++;
			}
			a = a + 2;
		}
		while (a < 1000000) {
			int b = 2;
			boolean prime = true;
			while (b < a/300) {
				if (a%b==0) {
					prime = false;
				}
				b++;
			}
			if (prime == true) {
				primes[counter] = a;
				counter++;
			}
			a = a + 2;
		}	
		int max = 0;
		int d = 0;
		int finalcount = 0;
		while (d < 10000) {
			counter = d;
			int sum = 0;
			int count = 0;
			while (counter < 78499) {
				sum = sum + primes[counter];
				int c = 75000;
				while (c < 78499) {
					if (sum == primes[c]&&count > finalcount) {
						finalcount = count;
						max = sum;
						System.out.println(max + " " + finalcount);
					}
					c++;
				}
				count++;
				counter++;
			}
			d++;
		}
	}

}
