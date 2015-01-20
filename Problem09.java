
public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c = 1;
		while (a < 1000) {
			while (b < 1000) {
				c= 1000 - a - b;
				if (a*a + b*b == c*c) {
					System.out.println(a * b * c);
				b=1000; 
				a=1000;
				}
			b++;
			}	
		b=1;
		a++;
		}
		}
	}


