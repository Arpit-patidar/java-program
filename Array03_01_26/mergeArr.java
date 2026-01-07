package Array03_01_26;

import java.util.Arrays;

public class mergeArr { 
public static void main(String[] args) {
	int []a= {1,2,3};
	int []b= {4,5};
	System.out.println(Arrays.toString(mergeArr(a, b)));
}
public static int[] mergeArr(int []a,int[]b) {
	int []result = new int  [a.length+b.length];
	for(int i=0;i<a.length;i++) {
		result[i]=a[i];
	} 
	int index = a.length;
	for(int i=0;i<b.length;i++) {
		result[index++]=b[i];
	}
	return result;
}
}
