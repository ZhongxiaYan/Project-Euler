
public class Problem46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		int primes[] = new int [800];
		int primecounter = 1;
		primes[0] = 2;
		while (primecounter < 800) {
			int factor = 3;
			boolean prime = true;
			while (factor <= i/2&&prime==true) {
				if (i%factor == 0) {
					prime= false;
				}
				factor = factor + 2;
			}
			if (prime==true) {
				primes[primecounter] = i;
				primecounter++;
			}
			i = i + 2;
		}
		int odds[] = new int [20000];
		int a = 0;
		while (a < 800) {
			odds[primes[a]] = primes[a];
			int b = 1;
			while (b < 50) {
				int c = primes[a] + 2*b*b;
				if (c%2 > 0) {
					odds[c] = c;
				}
				b++;
			}
			a++;
		}
		int j = 3;
		boolean found = false;
		while (j < 10000&&found == false) {
			if (odds[j] != j) {
				System.out.println(j);
				found = true;
			}
			j = j + 2;
		}
	}

}
