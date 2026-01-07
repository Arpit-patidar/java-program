package Dupletcate05_01_26;

import java.util.Arrays;

public class MidEle {
public static void main(String[] args) {
	int []a= {1,2,3,4};
	System.out.println(midEle(a));
}
public static int midEle(int[]a) {
	if(a.length%2==0) {
		return 0;
	}else {
		return a[a.length/2];
	}
}
}
