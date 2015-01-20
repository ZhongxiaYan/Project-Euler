
public class Problem53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int counter = 0;
		while (a <= 100) {
			long num = 1L;
			int top = a;
			int bottom = 1;
			int term = 1;
			while (bottom <= a&&top>0) {
				num = num*top/bottom;
				if (num > 1000000) {
					counter = counter + a - term*2 + 1;
					bottom = a;
					top = 0;
				}
				top--;
				bottom++;
				term++;
			}
			a++;
		}
		System.out.println(counter);
	}

}
