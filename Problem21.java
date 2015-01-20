
public class Problem21 {
	public static void main(String[] args) {
		int b = 2;
		int sum3 = 0;
		while (b < 10000){
			int sum1 = 0;
			int a = 1;
			while (a <= b/2) {
				if (b%a==0) {
					sum1 = sum1 + a;
					a++;
				}
				else a++;
			}
			a = 1;
			int sum2 = 0;
			if (sum1>1&&sum1<10000) {
				int c = sum1;
				while (a <= c/2) {
					if (c%a==0) {
						sum2 = sum2 + a;
						a++;
					}
					else a++;
				}
				
			}
			if (sum2==b&&sum1!=sum2) {
				System.out.println(b + " " + sum1);
				sum3 = sum3 + b;
			}
			b++;
		}
		System.out.println(sum3);
	}
}
