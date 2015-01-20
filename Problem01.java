
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int y = 0;
		int sum = 0;
		while (x < 1000) {sum = sum + x; x = x+3; }
		while (y < 1000) {if (y%15>0) {sum = sum + y; y = y + 5; }
		else y= y + 5;}
	System.out.println(sum);
	}

}
