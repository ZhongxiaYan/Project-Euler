
public class Problem40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int counter = 0;
		int product = 1;
		while (counter <= 1000000) {
			String b = Integer.toString(a);
			char array[] = b.toCharArray();
			int i = 0;
			while (i < b.length()) {
				counter++;
				if (counter == 1) {
					System.out.println(array[i]);
					product = product*Character.getNumericValue(array[i]);
				}
				if (counter == 10) {
					System.out.println(array[i]);
					product = product*Character.getNumericValue(array[i]);
				}
				if (counter == 100) {
					System.out.println(array[i]);
					product = product*Character.getNumericValue(array[i]);
				}
				if (counter == 1000) {
					System.out.println(array[i]);
					product = product*Character.getNumericValue(array[i]);
				}
				if (counter == 10000) {
					System.out.println(array[i]);
					product = product*Character.getNumericValue(array[i]);
				}
				if (counter == 100000) {
					System.out.println(array[i]);
					product = product*Character.getNumericValue(array[i]);
				}
				if (counter == 1000000) {
					System.out.println(array[i]);
					product = product*Character.getNumericValue(array[i]);
				}
				i++;
			}	
			a++;
		}
		System.out.println(product);
	}

}
