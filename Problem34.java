
public class Problem34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int sum1 = 0;
		while (a < 4000000) {
			int b = a/1000000;
			int c = (a/100000)%10;
			int d = (a/10000)%10;
			int e = (a/1000)%10;
			int f = (a/100)%10;
			int g = (a/10)%10;
			int h = a%10;
			int sum = 0;
			if (a < 100){
				int product = 1;
				while (g > 0) {
					product = product*g;
					g--;
				}
				sum = sum + product;
				product = 1;
				while (h > 0) {
					product = product*h;
					h--;
				}
				sum = sum + product;
			}
			if (a < 1000&&a>100){
				int product = 1;
				while (f > 0) {
					product = product*f;
					f--;
				}
				sum = sum + product;
				product = 1;
				while (g > 0) {
					product = product*g;
					g--;
				}
				sum = sum + product;
				product = 1;
				while (h > 0) {
					product = product*h;
					h--;
				}
				sum = sum + product;
			}
			if (a < 10000&&a>1000){
				int product = 1;
				while (e > 0) {
					product = product*e;
					e--;
				}
				sum = sum + product;
				product = 1;
				while (f > 0) {
					product = product*f;
					f--;
				}
				sum = sum + product;
				product = 1;
				while (g > 0) {
					product = product*g;
					g--;
				}
				sum = sum + product;
				product = 1;
				while (h > 0) {
					product = product*h;
					h--;
				}
				sum = sum + product;
			}
			if (a < 100000&&a>10000){
				int product = 1;
				while (d > 0) {
					product = product*d;
					d--;
				}
				sum = sum + product;
				product = 1;
				while (e > 0) {
					product = product*e;
					e--;
				}
				sum = sum + product;
				product = 1;
				while (f > 0) {
					product = product*f;
					f--;
				}
				sum = sum + product;
				product = 1;
				while (g > 0) {
					product = product*g;
					g--;
				}
				sum = sum + product;
				product = 1;
				while (h > 0) {
					product = product*h;
					h--;
				}
				sum = sum + product;
			}
			if (a < 1000000&&a>100000){
				int product = 1;
				while (c > 0) {
					product = product*c;
					c--;
				}
				sum = sum + product;
				product = 1;
				while (d > 0) {
					product = product*d;
					d--;
				}
				sum = sum + product;
				product = 1;
				while (e > 0) {
					product = product*e;
					e--;
				}
				sum = sum + product;
				product = 1;
				while (f > 0) {
					product = product*f;
					f--;
				}
				sum = sum + product;
				product = 1;
				while (g > 0) {
					product = product*g;
					g--;
				}
				sum = sum + product;
				product = 1;
				while (h > 0) {
					product = product*h;
					h--;
				}
				sum = sum + product;
			}
			if (a < 4000000&&a>1000000){
				int product = 1;
				while (b > 0) {
					product = product*b;
					b--;
				}
				sum = sum + product;
				product = 1;
				while (c > 0) {
					product = product*c;
					c--;
				}
				sum = sum + product;
				product = 1;
				while (d > 0) {
					product = product*d;
					d--;
				}
				sum = sum + product;
				product = 1;
				while (e > 0) {
					product = product*e;
					e--;
				}
				sum = sum + product;
				product = 1;
				while (f > 0) {
					product = product*f;
					f--;
				}
				sum = sum + product;
				product = 1;
				while (g > 0) {
					product = product*g;
					g--;
				}
				sum = sum + product;
				product = 1;
				while (h > 0) {
					product = product*h;
					h--;
				}
				sum = sum + product;
			}
			if (sum == a) {
				sum1 = sum1 + sum;
				System.out.println(sum);
			}
			a++;
		}
		System.out.println(sum1);
	}

}
