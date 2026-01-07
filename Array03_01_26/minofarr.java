package Array03_01_26;

import java.util.Arrays;

//WAp to prime first max value inside a new array
public class minofarr {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6};
System.out.println(maxvalue(a));
}
public static int maxvalue(int []a) {
int min =a[0];
//	int min = Integer.MAX_VALUE;

	for(int i =0;i<a.length;i++) {
		if(a[i]<min)
			min=a[i];
	}
	return min;
		
}
}
