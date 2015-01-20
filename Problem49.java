import java.util.*;

public class Problem49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1000;
		int sorted[] = new int [400];
		int sortcount = 0;
		String numbers[] = new String [400];
		while (i < 10000) {
			boolean prime = true;
			int j = 2;
			while (j <= i/10&&prime==true) {
				if (i%j==0) {
					prime = false;
				}
				j++;
			}
			String a = Integer.toString(i);
			char nums[] = a.toCharArray();
			int b = 0;
			if (prime == true) {
				Arrays.sort(nums);
				String c = new String(nums);
				int d = Integer.parseInt(c);
				boolean sort = false;
				int x = 0;
				boolean triple = false;
				if ((d%1000)%111==0) triple = true;
				if ((d/10)%111==0) triple = true;
				while (sort==false&&x < sortcount&&triple == false) {
					if (sorted[x] == d) {
						sort = true;
						x--;
					}
					x++;
				}
				if (sort == false&&triple==false) {
					String z = Integer.toString(i);
					numbers[sortcount] = z;
					sorted[sortcount] = d;
					sortcount++;
				}
				if (sort==true&&triple==false) {
					numbers[x] = numbers[x] + a;
				}
			}
			i++;
		}
		String tripleprime[] = new String [200];
		int counter = 0;
		int counter1 = 0;
		String quadprime[] = new String [200];
		for (int y = 0; y < 310; y++) {
			int length = numbers[y].length();
			if (length >= 12) {
				tripleprime[counter] = numbers[y];
				counter++;
			}
			if (length >= 16) {
				quadprime[counter1] = numbers[y];
				counter1++;
			}
		}
		for (int y = 0; y < 171; y++) {
			if (tripleprime[y].length() == 12) {
				int a = Integer.parseInt(tripleprime[y].substring(0,4));
				int b = Integer.parseInt(tripleprime[y].substring(4,8));
				int c = Integer.parseInt(tripleprime[y].substring(8,12));
				int diff1 = b - a;
				int diff2 = c - b;
				if (diff1==diff2) {
					System.out.println(tripleprime[y]);
				}
			}
		}
		for (int y = 0; y < 123; y++) {
			int length = quadprime[y].length();
			int array[] = new int [11];
			int arraycounter = 0;
			while (arraycounter < length/4) {
				String z = quadprime[y].substring(4*arraycounter, (4*arraycounter + 4));
				array[arraycounter] = Integer.parseInt(z);
				arraycounter++;
			}
			arraycounter = 0;
			int num = (length/4)*(length/4-1)/2;
			String differences[] = new String [num];
			int diffcounter = 0;
			while (arraycounter < 11) {
				int diff = 1;
				while (diff + arraycounter < length/4) {
					int difference = array[arraycounter + diff] - array[arraycounter];
					differences[diffcounter] = array[arraycounter] + " " + array[arraycounter + diff] + " " + difference;
					diffcounter++;
					diff++;
				}
				arraycounter++;
			}
			int a = 0;
			while (a < num) {
				int b = a + 1;
				while (b < num) {
					int g = Integer.parseInt(differences[a].substring(10));
					int f = Integer.parseInt(differences[b].substring(10));
					if (g==f) {
						System.out.println(differences[a] + " " + differences[b] + " " + quadprime[y]);
					}
					b++;
				}
				a++;
			}
		}
	}

}
