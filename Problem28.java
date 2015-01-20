
public class Problem28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 1;
		int num = 1;
		int dim = 3;
		while (dim < 1002) {
			num = dim*dim;
			sum = sum + 2*(2* num -3*(dim-1));
			dim = dim + 2;
		}
		System.out.println(sum);
	}

}
