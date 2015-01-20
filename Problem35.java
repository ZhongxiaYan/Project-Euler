
public class Problem35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int counter = 1;
		while (a < 1000000) {
			int holder = a;
			int i = 0;
			boolean prime = true;
			while (i < 7&&prime == true) {
				String b = Integer.toString(a);
				String c = b.substring(1) + b.substring(0,1);
				if (a > 10) {
					String f = b.substring(1,2);
					int e = Integer.parseInt(f);
					if (e == 0) {
						prime = false;
					}
				}
				int d = Integer.parseInt(c);
				a = d;
				int x = 2;
				while (x <= d/2&&prime == true) {
					if (d%x == 0) {
						prime = false;
					}
					x++;
				}
				i++;
			}
			a = holder;
			if (prime == true) {
				System.out.println(a);
				counter++;
			}
			a = a + 2;
		}
		System.out.println(counter);
	}

}
