
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 1;
int y = 1;
int z = 0;
int sum = 0;
while (z< 4000000) {sum = sum + z; z = x + y; x = z + y; y = z + x;}
	System.out.println(sum);
	}

}
