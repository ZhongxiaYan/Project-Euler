
public class Problem26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		int number = 0;
		int repeat = 0;
		while (num < 1000){
        	int array[]= new int [1000];
        	int result[]= new int [1000];
        	int x = 999;
        	while (x >= 0){
        		array[x] = 0;
        		result[x] = 0;
        		x--;
        	}
        	array[999] = 1;
            int digit = 999;
            int b = 0;
            while (digit >= 3&&b==0){
            	if (array[digit]>=num) {
                    result[digit] = array[digit]/num;
                    int remainder = array[digit] - num*result[digit];
                    if (remainder == 0) {
                    	b = 2;
                    }
                    array[digit] = remainder;                    
            	}    
                if (num <= (array[digit]*10 + array[digit-1])&&array[digit]<num) {
                    int dividend = array[digit]*10 + array[digit-1];
                    result[digit-1] = dividend/num;
                    int remainder = dividend - num*result[digit-1];
                    if (remainder == 0) {
                    	b = 2;
                    }                    
                    array[digit] = remainder/10;
                    array[digit-1] = remainder%10;
                }
                if (num <= array[digit]*100 + array[digit-1]*10 + array[digit-2]&&num > array[digit]*10 + array[digit-1]){
                    int dividend = array[digit]*100 + array[digit-1]*10 + array[digit-2];
                    result[digit-2] = dividend/num;
                    int remainder = dividend - num*result[digit-2];
                    if (remainder == 0) {
                    	b = 2;
                    }
                    array[digit] = remainder/100;
                    array[digit-1] = (remainder/10)%10;
                    array[digit-2] = remainder%10;
                }
                if (num <=array[digit]*1000 + array[digit-1]*100 + array[digit-2]*10 + array[digit-3]&&num > array[digit]*100 + array[digit-1]*10 + array[digit-2]){
                    int dividend = array[digit]*1000 + array[digit-1]*100 + array[digit-2]*10 + array[digit-3];
                    result[digit-3] = dividend/num;
                    int remainder = dividend - num*result[digit-3];
                    if (remainder == 0) {
                    	b = 2;
                    }
                    array[digit] = remainder/1000;
                    array[digit-1] = (remainder/100)%10;
                    array[digit-2] = (remainder/10)%10;
                    array[digit-3] = remainder%10;
                }
                digit--;
            }
            /*for (int i=499; i>=0; i--){
                System.out.print(result[i]);   
            }
            System.out.println("");*/
            for (int c = 10; c < 994; c++) {
            	if (result[8]==result[c]&&result[9]==result[c+1]&&result[10]==result[c+2]&&result[11]==result[c+3]&&result[12]==result[c+4]&&result[13]==result[c+5]){
            		if (c>repeat){
            			repeat = c;
            			number = num;		
            			System.out.println(number + " " + (c-39));
            		}
            		c=1000;
            	}
            	c++;
            }
            num++;
        }

        
    
    }

}
	
