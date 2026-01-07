package frequencyOfEle06_01_26;

import java.util.Arrays;

public class OddEven {
public static void main(String[] args) {
	int[]a= {1,2,4,5,6,9,4};
	System.out.println(Arrays.toString(Segrigate(a)));
}
public static int[] Segrigate(int []a) {
	int [] res = new int [a.length];
	int index =0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]%2==0) {
			res[index++]=a[i];
		}
	}
	for (int i = 0; i < a.length; i++) {
		if(a[i]%2!=0) {
			res[index++]=a[i];
		}
	}
	
	return res;
}
}
