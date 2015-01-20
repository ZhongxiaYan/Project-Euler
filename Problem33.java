
public class Problem33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 11.0;
		double product = 1;
		while (a < 100) {
			double b = 11.0;
			while (b < a) {
				double w = (b - b%10)/10;
				double x = b%10;
				double y = (a - a%10)/10;
				double z = a%10;
				if (x != 0&& z != 0) {
					double c = w/y;
					double d = w/z;
					double e = x/y;
					double f = x/z;
					double g = b/a;
					if (w != x && y != z) {
						if (c == g&&x==z) {
							System.out.println(b + " " + a);
							product = product*b/a;
						}
						if (d == g&&x==y) {
							System.out.println(b + " " + a);
							product = product*b/a;
						}
						if (e == g&&w==z) {
							System.out.println(b + " " + a);
							product = product*b/a;
						}
						if (f == g&&w==y) {
							System.out.println(b + " " + a);
							product = product*b/a;
						}
					}
				}
				b++;
			}
			a++;
		}
		System.out.println(1/product);
	}

}
