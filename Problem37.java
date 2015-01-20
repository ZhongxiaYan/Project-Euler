
public class Problem37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int sum = 0;
		while (a < 1000000) {
			String x = Integer.toString(a);
			String c = x.substring(0, 1);
			int d = Integer.parseInt(c);
			boolean prime = false;
			if (a%10 > 1&& d%10 > 1){
				prime = true;
			}
			int e = 2;
			while (e <= a/2) {
				if (a%e == 0) {
					prime = false;
				}
				e++;
			}
			int num1 = a;
			int num2 = a;
			String u = x;
			String v = x;
			while (num1 > 10&&num2 > 10&&prime == true) {
				int b = 2;
				u = u.substring(1);
				num1 = Integer.parseInt(u);
				v = v.substring(0,v.length()-1);
				num2 = Integer.parseInt(v);
				if (num1 < 2) {
					prime = false;
				}
				if (num2 < 2) {
					prime = false;
				}
				while (b <= num1/2&&prime == true&&num1 > 1) {
					if (num1%b==0) prime = false;
					b++;
				}
				b = 2;
				while (b <= num2/2&&prime == true&&num2 > 1) {
					if (num2%b==0) prime = false;
					b++;
				}
			}
			if (prime == true) {
				System.out.println(a);
				sum = sum + a;
			}
			a++;
		}
		System.out.println(sum);
	}

}
