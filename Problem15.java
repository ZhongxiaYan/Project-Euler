
public class Problem15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 40;
		double y = 20;
		double product = 1;
		while (x>20) {
			product = product * x/y;
			y--;
			x--;
		}
		System.out.println(product);
	}

}
