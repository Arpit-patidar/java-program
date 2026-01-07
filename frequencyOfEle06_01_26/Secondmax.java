package frequencyOfEle06_01_26;

public class Secondmax {
	public static void main(String[] args) {
		int[]a= {2,3,5,6};
		System.out.println(secondmax(a));
		
	}
	public static int secondmax(int[]a) {
		int max= Integer.MIN_VALUE;
		int max2 = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max2 =max;
				max =a[i];
			}else if
				( a[i]>max2)
					max= a[i];
			
		}
		return max;
	}
}
