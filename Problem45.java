
public class Problem45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long tri[] = new long [1000000];
		long pent[] = new long [1000000];
		long hex[] = new long [1000000];
		int i = 1;
		long j = 1L;
		while (i < 1000000) {
			tri[i] = j*(j+1)/2;
			pent[i] = j*(3*j-1)/2;
			hex[i] = j*(2*j-1);
			i++;
			j++;
		}
		int t = 286;
		boolean triple = false;
		while (t < 999999&&triple==false) {
			int p = 166;
			boolean both = false;
			while (pent[p] <= tri[t]&&both==false) {
				if (pent[p]==tri[t]) {
					both= true;
				}
				
				if (both==true) {
					int h = 144;
					while (hex[h] <= tri[t] &&triple==false) {
						if (tri[t]==hex[h]&&hex[h]==pent[p]) {
							System.out.println(t+ " " + p + " " + h + " " + tri[t]);
							triple=true;
						}
						h++;
					}
				}
				p++;
			}
			t++;
		}
	}

}
