
public class Problem30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		int sum = 0;
		while (num < 100000000) {
			int x = num/10000000;
			int y = (num/1000000)%10;
			int z = (num/100000)%10;
			int a = (num/10000)%10;
			int b = (num/1000)%10;
			int c = (num/100)%10;
			int d = (num/10)%10;
			int e = num%10;
			int digitsum = a*a*a*a*a + b*b*b*b*b + c*c*c*c*c + d*d*d*d*d + e*e*e*e*e + x*x*x*x*x + y*y*y*y*y + z*z*z*z*z;
			if (digitsum == num){
				System.out.println(num);
				sum = sum + num;
			}
		num++;
		}
		System.out.println(sum);
	}

}
