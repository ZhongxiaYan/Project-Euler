
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 200000000;
int a= 20;
while (i<300000000) {
	while (a>-1) {
		if (a>0&&i%a==0) a--;
		else if (a==0) {System.out.println(i); a=-1; i= 400000000;}
		else a=-2;
		
	}
	a=20;
	i= i+2;
}
	}

}
