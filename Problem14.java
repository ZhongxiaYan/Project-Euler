
public class Problem14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 1;
		long y;
		long z;
		int counter1 = 0;
		int counter2 = 0;
		long num = 0;
		while (x < 1000000){
			z = x;
			while (z > 1) {
				if (z%2>0) {
					y = (3*z + 1);
				}
				else {
					y = z/2;
				}
				z = y;
				counter1++;
				}
			if (counter1 > counter2) {
				counter2=counter1;
				num = x;
				System.out.println(num);
				System.out.println(counter2);
			}
			counter1 = 0;
			x++;
		}
		
	}

}
