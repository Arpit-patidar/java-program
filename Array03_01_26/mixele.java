package Array03_01_26;

import java.util.Arrays;

//WAp to prime first max value inside a new array
public class mixele {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6};
System.out.println(maxvalue(a));
}
public static int maxvalue(int []a) {

	int max = Integer.MIN_VALUE;
	for(int i =0;i<a.length;i++) {
		if(a[i]>max)
			max=a[i];
	}
	return max;
		
}
}
 