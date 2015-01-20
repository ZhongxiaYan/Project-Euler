
public class Problem23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = new int [28125];
		int b = 1;
		while (b < 28124){
			int sum1 = 0;
			int a = 1;
			while (a <= b/2) {
				if (b%a==0) {
					sum1 = sum1 + a;
					a++;
				}
				else a++;
			}
			if (sum1 > b) {
				Array[b] = b;
			}
			else Array[b] = 0;
			b++;
		}
		
		int num = 1;
		long sum = 0L;
		int i = 0;
		while (num < 28124) {
			while (i < num){
				while (Array[i]==0&&i < num - 1) {
					i++;
				}
				if (num - Array[i] == Array[num - i]){
					i = num + 1;
				}
				else i++;
				
			}
			if (i == num) {
				sum = sum + num;
			}
			i = 1;
			num++;
		}
		System.out.println(sum);
	}

}
