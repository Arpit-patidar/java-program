package Dupletcate05_01_26;

import java.util.Arrays;

public class sawpEle {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,};
	System.out.println(Arrays.toString(sawpfirst(a)));
}
public static int[ ]sawpfirst(int[]a) {
	int temp=a[a.length-1];
	a[a.length-1]=a[0];
	a[0]=temp;
	return a;
}
}
