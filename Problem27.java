
public class Problem27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -999;
		int counter1 = 0;
		while (a < 1000) {
			int b = 2;
			while (b < 1000){
				int c = 2;
				int x = 0;
				while (c <= b/2) {
					if (b%c == 0) {
						x = 1000;
						c = b;
					}
					if (b%c!=0) {
						c++;
					}
				}
				boolean limit = true;
				int counter = 0;
				while (x < 1000&&limit == true) {
					int q = x*x + a*x + b;
					int d = 2;
					if (q < 2) {
						limit = false;
					}
					while (d <= q/2&&limit == true) {
						if (q%d == 0) {
							limit = false;
						}
						if (q%d!=0) {
							d++;
						}
					}
					if (d > q/2&&limit==true) {
						counter++;					
					}
					x++;
					
				}
				if (counter>counter1) {
					counter1 = counter;
					System.out.println(counter1 + " " + a*b + " " + a + " " + b);
				}
			
			b++;
			}
		a++;
		}
	}
}
