
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x;
x = 600851475143D;
double f = 3;
while (f< x/6) {if (x%f > 0) f=f+2;
else {System.out.println(x/f); f= f + 2;}
}

}

}
