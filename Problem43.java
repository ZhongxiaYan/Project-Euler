
public class Problem43 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1000000000L;
		long sum = 0L;
		while (a < 10000000000L) {
			String b = Long.toString(a);
			char digit[] = b.toCharArray();
			int array[] = new int [10];
			int i = 0;
			while (i < b.length()) {
				int d = Character.getNumericValue(digit[i]);
				array[d] = array[d] + d;
				i++;
			}
			i = 0;
			boolean pandigital = true;
			while (i < b.length()&&pandigital == true) {
				if (array[i] != i) {
					pandigital = false;
				}
				i++;
			}
			if (pandigital==true) {
				int r = Integer.parseInt(b.substring(1, 4));
				int s = Integer.parseInt(b.substring(2, 5));
				int t = Integer.parseInt(b.substring(3, 6));
				int u = Integer.parseInt(b.substring(4, 7));
				int v = Integer.parseInt(b.substring(5, 8));
				int w = Integer.parseInt(b.substring(6, 9));
				int x = Integer.parseInt(b.substring(7, 10));
				if (r%2==0&&s%3==0&&t%5==0&&u%7==0&&v%11==0&&w%13==0&&x%17==0) {
					sum = sum + a;
					System.out.println(a);
				}
			}
			a++;
		}
		System.out.println(sum);
	}

}
