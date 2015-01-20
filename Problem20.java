
public class Problem20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit[] = new int [200];
		int num = 2;
		digit[0] = 1;
		for (int i = 1; i<200; i++){
			digit[i] = 0;
		}
		int x = 0;
		int y;
		int sum = 0;
		while (num < 100) {
			x = 195;
			while (x > -1) {
				y = num * digit[x];
				digit[x] = y%10;
				digit[x+1] = digit[x+1] + ((y/10)%10);
				digit[x+2] = digit[x+2] + ((y/100)%10);
				if (digit[x+1]>9) {
					int c = digit[x+1]/10;
					digit[x+2] = digit[x+2] + c;
					digit[x+1] = digit[x+1] - 10*c;
				}
				if (digit[x+2]>9) {
					int c = digit[x+2]/10;
					digit[x+3] = digit[x+3] + c;
					digit[x+2] = digit[x+2] - 10*c;
				}
				if (digit[x+3]>9) {
					int c = digit[x+3]/10;
					digit[x+4] = digit[x+4] + c;
					digit[x+3] = digit[x+3] - 10*c;
				}
				if (digit[x+4]>9) {
					int c = digit[x+4]/10;
					digit[x+5] = digit[x+5] + c;
					digit[x+4] = digit[x+4] - 10*c;
				}
				x--;
				
			}
			num++;
		}
		for (int c = 199; c>-1; c--){
				sum = sum + digit[c];
				System.out.print(digit[c]);
		}
		System.out.println("");
		System.out.println(sum);
		
	}

}
