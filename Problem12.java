
public class Problem12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = 1;
		int j = 1;
		long k = 2;
		int counter= 1;
		while (i>0) {
			while (i>=j&&j>0){
				if (i%j==0) {
					if (counter>499) {
						System.out.println(i); j= -2; i=-1; 
					}
					else {counter++; 
					}
				j++;
				
				}
				else j++;
				
		}
		counter=1;
		j=1;
		if (i<0) {
			k=0;
		}
		i= i+k;
		k++;
		System.out.println(i);
	}
}}
