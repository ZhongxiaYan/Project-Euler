
public class Problem51 {

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
		String prime1[] = new String [78499];
		for (int c = 0; c < 78499; c++) {
			prime1[c] = Integer.toString(primes[c]);
		}
		System.out.println("start");
		int d = 0;
		while (d < 78499) {
			int x = 0;
			while (x < prime1[d].length() - 1) {
				int y = 1;
				while (y > x&&y < prime1[d].length()) {
					if (prime1[d].charAt(x)==prime1[d].charAt(y)) {
						int count = 0;
						for (int z = 0; z < 10; z++) {
							String k = prime1[d].replace(prime1[d].charAt(x), (char) ('0' + z));
							int q = 0;
							while (q < 78499){
								if (k.equals(prime1[q])) {
									q = 78499;
									count++;
								}
								q++;
							}
						}
						if (count >= 8) {
							System.out.println(prime1[d]);
						}
					}
					y++;
				}
				x++;
			}
			d++;
		}
	}

}
