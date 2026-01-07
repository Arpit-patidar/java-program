package frequencyOfEle06_01_26;

import java.util.Arrays;

public class splitArray {
public static void main(String[] args) {
	int[]a= {1,3,5,6,8,9};
	System.out.println(Arrays.toString(splitArrayshiftlastEletoFirst(a)));
}
public static int[] splitArrayshiftlastEletoFirst(int[]a) {
	int mid =a.length/2;
	int[] res = new int[a.length];
	int index =0;
	for (int i = mid; i < a.length; i++) {
		res[index++]=a[i];
	}
		for (int i = 0; i < mid; i++) {
			res[index++]=a[i];
			
		}
		return res;
	}
	
}

