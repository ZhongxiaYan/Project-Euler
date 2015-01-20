
public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		long product = 1L;
		long y;
		double ratio;
		for (int b = 0; b < 62; b++) {
			System.out.print((b+1) + " ");
			long sum = 0;
			product = product * x;
			y = product;
			while (y > 0) {
				sum = sum + y%10;
				y = y/10;
			}
			ratio = sum/(b+ 1.0);
			System.out.print(ratio + " ");
			System.out.print(sum + " ");

			long sumofsum = 0;
			while (sum > 0) {
				sumofsum = sumofsum + sum%10;
				sum = sum/10;
			}
			System.out.println(sumofsum);
			
		}
	}

}
