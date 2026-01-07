package frequencyOfEle06_01_26;

import java.util.Arrays;

public class negetiveNum {
public static void main(String[] args) {
	int[]a= {1,2,0,-1,5};
	System.out.println(Arrays.toString(moveZero(a)));
}
public static int[] moveZero(int[]a) {
	int[] res = new int[a.length];
	int index =0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]!=0) {
			res[index++]=a[i];
		}
	}
	return res;
}
}
