
public class Problem39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 120;
		int count = 0;
		while (t <= 1000) {
			int a = 1;
			int counter = 0;
			while (a < (t-2)) {
				int b = 1;
				boolean triple = false;
				while (b < (t-a-1)&& triple== false) {
					int c = t-b-a;
					if (a*a + b*b == c*c) {
						counter++;
						triple = true;
					}
					b++;
				}
				a++;
			}
			if (counter>count) {
				count = counter;
				System.out.println(count/2 + " " + t);
			}
			t++;
		}
		
	}

}
