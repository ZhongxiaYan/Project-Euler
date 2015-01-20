
public class Problem24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit[] = new int [10];
		int a = 0;
		int counter = 0;
		long num[] = new long [3628800];
		while (a < 10) {
			int b = 0;
			while (b < 10)  {
				if (b!=a){
					int c = 0;
					while (c < 10){
						if (c!=a&&c!=b){
							int d = 0;
							while (d<10){
								if (d!=a&&d!=b&&d!=c){
									int e = 0;
									while (e<10) {
										if (e!=a&&e!=b&&e!=c&&e!=d){
											int f = 0;
											while (f<10) {
												if (f!=a&&f!=b&&f!=c&&f!=d&&f!=e){
													int g = 0;
													while (g<10) {
														if (g!=a&&g!=b&&g!=c&&g!=d&&g!=e&&g!=f){
															int h = 0;
															while (h <10) {
																if (h!=a&&h!=b&&h!=c&&h!=d&&h!=e&&h!=f&&h!=g){
																	int i = 0;
																	while (i < 10){
																		if (i!=a&&i!=b&&i!=c&&i!=d&&i!=e&&i!=f&&i!=g&&i!=h){
																			int j = 0;
																			while (j < 10) {
																				if (j!=a&&j!=b&&j!=c&&j!=d&&j!=e&&j!=f&&j!=g&&j!=h&&j!=i){
																					num[counter] = 1000000000L*a + 100000000*b + 10000000*c + 1000000*d + 100000*e + 10000*f + 1000*g + 100*h + 10*i + j;
																					counter++;
																				}
																				j++;
																			}
																		}
																		i++;
																	}
																}
																h++;
															}
															
														}
														g++;
													}
												}
												f++;
											}
										}
										e++;
									}
								}
								d++;
							}
						}
						c++;
					}
				}
				b++;
			}
		a++;
		}
		System.out.println(num[999999]);
	}

}
