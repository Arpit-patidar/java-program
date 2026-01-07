package Arrays;

import java.util.Arrays;

public class Copyarr {
public static void main(String[] args) {
	int[] a= {1,2,4,5};
//	int[]c= {6,7,9,5};
//	Arrays.sort(c);
//	int []b= Arrays.copyOf(c, c.length.4);
	System.out.println(Arrays.toString(a));
}
public static int[] duplicat(int []a) {
	int[]b=new int[a.length];
	int index=0;
	for(int i=0;i<a.length;i++) {
		b[index++]=a[i];
	}
	return b;
}
}

