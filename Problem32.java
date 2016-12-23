
public class Problem32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factor1 = 1;
		int factor2 = 1;
		int products[] = new int [10000];
		int counter = 0;
		for (int l = 0; l < 10000; l++){
			products[l] = 0;
		}
		int sum = 0;
		while (factor1 < 10000) {
			factor2 = 1;
			while (factor2 < 10000) {
				int array[] = new int [10];
				for (int i = 0; i < 10; i++) {
					array[i] = 0;
				}
				int product = factor1*factor2;
				if (product < 10000){
					int a = factor1/1000;
					int b = (factor1/100)%10;
					int c = (factor1/10)%10;
					int d = factor1%10;
					int w = product/1000;
					int x = (product/100)%10;
					int y = (product/10)%10;
					int z = product%10;
					int h = factor2/1000;
					int i = (factor2/100)%10;
					int j = (factor2/10)%10;
					int k = factor2%10;
					array[a] = array[a] + a;
					array[b] = array[b] + b;
					array[c] = array[c] + c;
					array[d] = array[d] + d;
					array[h] = array[h] + h;
					array[i] = array[i] + i;
					array[j] = array[j] + j;
					array[k] = array[k] + k;
					array[w] = array[w] + w;
					array[x] = array[x] + x;
					array[y] = array[y] + y;
					array[z] = array[z] + z;
					int p = 9;
					while (p > 1&&array[p] == 0) {
						p--;					
					}
					int o = 1;
					int counter1 = 0;
					while ( o <= p && p>1) {
						if (array[o] == o) {
							counter1++;
						}
						else {
							o = p;
							counter1 = 0;
						}
						o++;
					}
					if (counter1 == p) {
						String facone = Integer.toString(factor1);
						String factwo = Integer.toString(factor2);
						String prod = Integer.toString(product);
						String all = facone + factwo + prod;
						int digit = 0;
						counter = 0;
						while (digit < all.length()) {
							String dig = all.substring(digit, digit + 1);
							int f = Integer.parseInt(dig);
							if (f != 0) {
								counter++;
							}
							digit++;
						}
						if (counter == 9) {
						products[product] = product;
						}
					}
				}
				factor2++;
			}
		factor1++;
		}
		for (int l = 0; l < 10000; l++){
			if (products[l] != 0) {
				sum = sum + products[l];
				System.out.println(products[l]);
			}
		}
		System.out.println(sum);
	}

}
