
public class Problem10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7;
		int a=3;
		long sum=10;
		while (x<2000002) {
			
				while (a<x){
		
				if (x%a==0&&a<=x/3) a=x;
				else if (x%a>0&&a<x/3) a=a+2;
				else {sum= sum + x; a=x;} 
			}
			a=3;
			x=x+2;
		}
			 System.out.println(sum);
	}

}
