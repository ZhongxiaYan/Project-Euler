
public class Problem41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 11L;
		long max = 0L;
		while (a < 1000000000) {
			String b = Long.toString(a);
			char digit[] = b.toCharArray();
			int array[] = new int [10];
			int i = 0;
			while (i < b.length()) {
				int d = Character.getNumericValue(digit[i]);
				array[d] = d;
				i++;
			}
			i = 1;
			boolean pandigital = true;
			while (i <= b.length()&&pandigital == true) {
				if (array[i] != i) {
					pandigital = false;
				}
				i++;
			}
			long j = 3L;
			while (pandigital==true&&j <= a/3) {
				if (a%j==0) {
					pandigital = false;	
				}
				j++;
			}
			if (a > max&&pandigital==true) {
				max = a;
				System.out.println(max);
			}
			a = a + 2;
		}
	}

}
