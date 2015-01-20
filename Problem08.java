import java.util.Scanner;
public class Problem8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String a = input.next();
		int x = 0;
		while (x<46) {
			String b = a.substring(x, x+1);
			x++;
			String c = a.substring(x, x+1);
			x++;
			String d = a.substring(x, x+1);
			x++;
			String e = a.substring(x, x+1);
			x++;
			String f = a.substring(x, x+1);
			x++;
			int v = Integer.parseInt(b);
			int w = Integer.parseInt(c);
			int xx = Integer.parseInt(d);
			int y = Integer.parseInt(e);
			int z = Integer.parseInt(f);
			int product = v*w*xx*y*z;
			if (product> 16000) {System.out.println(product);}
			x=x-4;
		}
	
	}

}
