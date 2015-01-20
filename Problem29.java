
public class Problem29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 2;
		int array[] = new int [101];
		int counter = 0;
		while (a <= 100) {
			array[0] = 1;
			array[1] = 1;
			for (int z = 2; z < 101; z++){
				array[z] = 0;
			}
			b = 32;
			while (b >= 2) {
				if (a == b*b) {
					for (int i = 2; i <= 50; i++) {
						array[i] = 1;
					}
				}
				if (a == b*b*b) {
					for (int i = 2; i <= 33; i++) {
						array[i] = 1;
					}
				}
				if (a == b*b*b*b) {
					for (int i = 2; i <= 25; i++) {
						array[i] = 1;
					}
				}
				if (a == b*b*b*b*b) {
					for (int i = 2; i <= 20; i++) {
						array[i] = 1;
					}
				}
				if (a == b*b*b*b*b*b) {
					for (int i = 2; i <= 16; i++) {
						array[i] = 1;
					}
				}
				if (a*a*a*a*a == b*b*b*b*b*b) {
					for (int i = 5; i <= 80; i= i + 5) {
						array[i] = 1;
					}
				}
				if (a*a*a*a == b*b*b*b*b) {
					for (int i = 4; i <= 80; i= i + 4) {
						array[i] = 1;
					}
				}
				if (a*a*a == b*b*b*b) {
					for (int i = 3; i <= 75; i= i + 3) {
						array[i] = 1;
					}
				}
				if (a*a == b*b*b) {
					for (int i = 2; i <= 66; i= i + 2) {
						array[i] = 1;
					}
				}
				if (a*a == b*b*b*b*b) {
					for (int i = 2; i <= 40; i= i + 2) {
						array[i] = 1;
					}
				}
				if (a*a*a == b*b*b*b*b) {
					for (int i = 3; i <= 60; i= i + 3) {
						array[i] = 1;
					}
				}
				b--;
			}
		int j = 2;
		while (j < 101){
			if (array[j]==0) {
				counter++;
			}
			j++;
		}
		System.out.println(a + " " + counter);	
		a++;
		

		}
	}

}
