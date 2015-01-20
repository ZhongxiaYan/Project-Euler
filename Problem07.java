
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7;
		int a=2;
		int count=4;
		while (x>0&&count<10002) {
			
				while (a<x){
		
				if (x%a==0&&a<=x/2) a=x;
				else if (x%a>0&&a<x/2) a++;
				else {count++; a=x;} 
			}
			a=2;
			x++;
		}
			 System.out.println(x-1);
	

}}
