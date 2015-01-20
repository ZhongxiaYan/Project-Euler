
public class Problem38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int a = 1;
		while (a < 10000) {
			int b = 1;
			int array[] = new int [10];
			int digits = 0;
			boolean zero = false;
			String whole = "";
			while (digits < 9&&zero == false) {
				String product = Integer.toString(a*b);
				whole = whole + product;
				char numarray[] = product.toCharArray();
				int i = 0;
				while (i < product.length()&&zero==false) {
					int d = Character.getNumericValue(numarray[i]);
					if (array[d] == d) {
						zero = true;
					}
					array[d] = d;
					if (d == 0) {
						zero = true;
					}
					digits++;
					i++;					
				}
				b++;
			}
			int j = 1;
			int counter = 0;
			while (j < 10&&digits == 9&&zero==false) {
				if (array[j]==j) {
					counter++;
				}
				j++;
			}
			
			if (counter==9){
				int num = Integer.parseInt(whole);
				if (num > max) {
					max = num;
					System.out.println(max);
				}
			}
		a++;
		}
	}

}
