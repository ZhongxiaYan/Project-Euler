import java.lang.*;
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Set[]= new int[900];
		int i = 0;
		for (int a =1; a < 10;) {
			for (int b=0; b < 10;) {
				for (int c =0; c<10;) {
				Set[i]= palindromize(a,b,c); 
				c++;
				i++;}
			b++;
			}
		a++;
		}
		int x=999;
		int j= 899;
		while (j>600){
		while (x > 800) {
			if (Set[j]%x == 0&&Set[j]/x<1000) {System.out.println(Set[j]); x=799; j=599;}
			else x--;
		}
		j--;
		x=999;
		}
		
			
	}
	static int palindromize(int x, int y, int z) {
		int palindrome = 100001*x + 10010*y +1100*z;
		return palindrome;
	}
}
