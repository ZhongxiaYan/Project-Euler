
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i= 0;
int sum1=0;
int sum2=0;
while (i<101) {
	sum1=sum1+ i*i;
	sum2= sum2 +i;
	i++;
}
int difference= sum2*sum2 - sum1;
System.out.println(difference);
	}

}
