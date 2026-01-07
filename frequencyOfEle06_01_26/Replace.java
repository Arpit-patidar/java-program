package frequencyOfEle06_01_26;

import java.util.Arrays;

public class Replace {
public static void main(String[] args) {
	int[]a= {1,-2,4,-5,6};
	System.out.println(Arrays.toString(Replace(a)));
}
public static int[] Replace(int []a) {
	int [] res = new int [a.length];
	int index =0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]<0) {
			res[index++]=0;
		}else {
			res[index++]=a[i];
		}
	}
	
	
	return res;
}
}
