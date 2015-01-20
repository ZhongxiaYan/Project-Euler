
public class Problem36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int sum = 0;
		while (a < 1000000) {
			String a1 = Integer.toString(a);
			String a2 = new StringBuffer(a1).reverse().toString();
			int a3 = Integer.parseInt(a2);
			String b = Integer.toBinaryString(a);
			
			String b1 = new StringBuffer(b).reverse().toString();
			long b4 = 0L;
			long b5 = 0L;
			long b2 = 0L;
			long b3 = 0L;
			if (a <= 10000) {
				b2 = Long.parseLong(b);
				b3 = Long.parseLong(b1);
			}
			if (a > 10000) {
				b2 = Long.parseLong(b.substring(0, 7));
				b3 = Long.parseLong(b1.substring(0, 7));
				b4 = Long.parseLong(b.substring(7));
				b5 = Long.parseLong(b1.substring(7));

			}
			
			if (a== a3 && b2==b3 && b4==b5){
				System.out.println(a + " " + b);
				sum = sum + a;
			}
			a++;
		}
		System.out.println(sum);
	}

}
