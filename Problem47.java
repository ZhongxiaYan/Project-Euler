
public class Problem47 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i = 3;
		int primes[] = new int [6134];
		primes[2] = 2;
		while (i < 6134) {
			int factor = 3;
			boolean prime = true;
			while (factor <= i/2&&prime==true) {
				if (i%factor == 0) {
					prime= false;
				}
				factor = factor + 2;
			}
			if (prime==true) {
				primes[i] = i;
			}
			i = i + 2;
		}*/
		int a = 1000;
		int counter = 0;
		while (a < 1000000) {
			int b = 2;
			int factors[] = new int [10000];
			int factorcounter = 0;
			int c = 0;
			int d = a;
			while (b <= d/2) {
				if (d%b == 0) {
					factors[factorcounter] = b;
					d = d/b;
					if (c != b) {
						factorcounter++;
					}
					c = b;
					b--;
				}
				b++;
			}
			if (factorcounter == 3) {
				counter++;
				System.out.println(a);
			}
			if (factorcounter != 3) {
				counter = 0;
			}
			if (counter == 4) {
				a = 1000000;
			}
			a++;
		}
	}

}
