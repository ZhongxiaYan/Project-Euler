
public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while (i < 1000) {
			sum = translate(i, sum);
			i++;
		}
		System.out.println(sum + 3 + 8);
	}
	static int translate(int a, int b){
		int x = a/100;
		int y = (a/10)%10;
		int z = a%10;
		int ones[] = new int [10];
		ones[0] = 0;
		ones[1] = 3;
		ones[2] = 3;
		ones[3] = 5;
		ones[4] = 4;
		ones[5] = 4;
		ones[6] = 3;
		ones[7] = 5;
		ones[8] = 5;
		ones[9] = 4;
		int tens[] = new int [10];
		tens[0] = 0;
		tens[2] = 6;
		tens[3] = 6;
		tens[4] = 5;
		tens[5] = 5;
		tens[6] = 5;
		tens[7] = 7;
		tens[8] = 6;
		tens[9] = 6;
		int teens[] = new int [10];
		teens[0] = 3;
		teens[1] = 6;
		teens[2] = 6;
		teens[3] = 8;
		teens[4] = 8;
		teens[5] = 7;
		teens[6] = 7;
		teens[7] = 9;
		teens[8] = 8;
		teens[9] = 8;
		int hundreds[] = new int [10];
		hundreds[0] = 0;
		hundreds[1] = 13;
		hundreds[2] = 13;
		hundreds[3] = 15;
		hundreds[4] = 14;
		hundreds[5] = 14;
		hundreds[6] = 13;
		hundreds[7] = 15;
		hundreds[8] = 15;
		hundreds[9] = 14;
		if (y == 1) {
			b = b + teens[z];
		}
		else {
			b = b + tens[y] + ones[z];
		}
		if (x==0&&y==0) {
			b = b + hundreds[x] - 3;
		}
		else b = b + hundreds[x];
		return b;
	}
}
