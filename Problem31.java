
public class Problem31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hun = 100;
		int fif = 50;
		int twe = 20;
		int ten = 10;
		int five = 5;
		int two = 2;
		int one = 1;
		int counter = 0;
		for (int a = 0; a <= 2; a++) {
			for (int b = 0; b <= 4; b++) {
				for (int c = 0; c <= 10; c++) {
					for (int d = 0; d <= 20; d++) {
						for (int e = 0; e <= 40; e++) {
							for (int f = 0; f <= 100; f++) {
								for (int g = 0; g <= 200; g++){
									int sum = a*hun + b*fif + c*twe + d*ten + e*five + f*two + g*one;
									if (sum == 200) counter++;
									
								}
							}
						}
					}
				}
			}
		}
	System.out.println(counter + 1);
	}

}
