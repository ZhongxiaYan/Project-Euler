
public class Problem48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum[] = new int [11];
		for (int z = 0; z < 11; z++) {
			sum[z] = 0;
		}
		while (i < 1000) {
			int digits[] = new int [11];
			digits[10] = i%10;
			digits[9] = (i/10)%10;
			digits[8] = (i/100)%10;
			int a = i;
			while (a > 1) {
				int j = 10;
				int c = 0;
				while (j > 0) {
					digits[j] = digits[j]*i + c;
					c = 0;
					if (digits[j] >= 10) {
						c = digits[j]/10;
						digits[j] = (digits[j])%10;
					}
					digits[0] = 0;
					j--;
				}
				a--;
			}
			int b = 10;
			while (b > 0) {
				sum[b] = digits[b] + sum[b]; 
				if (sum[b] >= 10) {
					sum[b-1] = sum[b-1] + sum[b]/10;
					sum[b] = (sum[b])%10;
				}
				sum[0] = 0;
				b--;
			}
			i++;
		}
		int b = 10;
		while (b > 0) {
			System.out.print(sum[11-b]);
			b--;
		}
	}

}
