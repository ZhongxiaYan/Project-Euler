import java.util.*;

public class Problem52 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		while (x < 1000000) {
			String a = Integer.toString(x);
			char set1[] = a.toCharArray();
			Arrays.sort(set1);
			String sorted = String.valueOf(set1);
			int counter = 2;
			boolean all = true;
			while (counter < 6&&all == true) {
				int y = counter*x;
				String b = Integer.toString(y);
				char set2[] = b.toCharArray();
				Arrays.sort(set2);
				String sorted1 = String.valueOf(set2);
				all = false;
				if (sorted.equals(sorted1)) {
					all = true;
				}
				counter++;
			}
			if (counter == 6) {
				System.out.println(x);
			}
			x++;
		}
	}

}
