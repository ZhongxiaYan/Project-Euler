
public class Problem19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month[] = new int [13];
		month[1] = 31;
		month[2] = 28;
		month[3] = 31;
		month[4] = 30;
		month[5] = 31;
		month[6] = 30;
		month[7] = 31;
		month[8] = 31;
		month[9] = 30;
		month[10] = 31;
		month[11] = 30;
		month[12] = 31;
		int day = 1;
		int sunday = 0;
		int year = 1901;
		while (year < 2000){
			int monthnumber = 1; 
			while (monthnumber < 13) {
				day = day + month[monthnumber];
				if (monthnumber==2&&year%4==0) {
					day = day + 1;
				}
				if (day%7==0){
				sunday++;
				System.out.println(sunday + " " + monthnumber + " " + year);
				} 
			monthnumber++;
			}
			year++;
		}
		
		System.out.println("Number of sundays is " + sunday);
	}

}
