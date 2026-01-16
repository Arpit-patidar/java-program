package unionOfArr10_01_26;

import java.util.Arrays;
//Wap to sift element to left side
public class ShifEle {
public static void main(String[] args) {
	int[]a= {10,20,30,40,50};
	System.out.println(Arrays.toString(shifEle(a)));
}
public static int[] shifEle(int[]a) {
	
	int[] res = new int[a.length];
	int index=0;
	int temp = a[0];

	for (int i = 1; i < a.length; i++) {
		res[index++]=a[i];
	}
	res[index]= temp;
	return res;
}
}
