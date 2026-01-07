package Dupletcate05_01_26;

import java.util.Arrays;

public class sortedEle {
public static void main(String[] args) {
	int []a= {1,5,3,4,5};
 System.out.println((isSort(a)));
}
public static boolean  isSort(int[]a) {
	boolean issorted =true;
	for (int i = 0; i < a.length-1; i++) {
		if(a[i]>a[i+1]) {
			issorted= false;
		break;
		}
	}
	return issorted;
			
}
}
