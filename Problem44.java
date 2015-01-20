
public class Problem44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long array[] = new long [10000];
		for (int i = 1; i < 10000; i++) {
			array[i] = i*(3*i-1)/2;
		}
		int a = 1;
		long min = 1000000000L;
		while (a < 9999) {
			int d = 1;
			while (d < 9999-a) {
				long b = array[a + d] + array[a];
				long c = array[a + d] - array[a];
				int i = 1;
				boolean sum = false;
				while (i<10000&&sum==false) {
					if (b == array[i]) {
						sum= true;
					}
					i++;
				}	
				boolean diff = false;
				i = 1; 
				while (i<10000&&sum==true&&diff==false) {
					if (c == array[i]) {
						diff= true;
					}
					i++;
				}	
				if (sum==true&&diff==true&&c < min){
					min = c;
					System.out.println(min);
				}
				d++;
			}
			a++;
		}
		
	}

}
