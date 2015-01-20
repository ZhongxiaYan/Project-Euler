
public class Problem25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit[] = new int [1000];
		int digit2[] = new int [1000];
		int x = 0;
		while (x<999) {
			digit[x] = 0;
			digit2[x] = 0;
			x++;
		}
		digit[0] = 1;
		digit2[0] = 1;
		int term = 1;
		while (digit2[999]==0){
			x = 998;
			while (x > -1){
				int b = digit2[x];
				int y = digit[x] + digit2[x];
				digit[x] = b;
				digit2[x] = y%10;
				digit2[x+1] = digit2[x+1] + ((y/10)%10);
				if (digit2[x+1]>9) {
					int c = digit2[x+1]/10;
					digit2[x+2] = digit2[x+2] + c;
					digit2[x+1] = digit2[x+1] - 10*c;
				}
				x--;
			}
			System.out.println(term);
			term++;
		}
		term++;
		System.out.println(term);
	}

}
