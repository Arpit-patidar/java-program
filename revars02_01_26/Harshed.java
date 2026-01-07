package revars02_01_26;

import java.util.Arrays;

public class Harshed {
public static void main(String[] args) {
	int[] a = {153,24,154,10,11};
	System.out.println(Arrays.toString(isharshed(a)));
	}
public static int[] isharshed(int[]a) {
	int count= 0;
	for(int i=0;i<a.length;i++) {
		if(isHarshad(a[i])) {
			count++;
		}
	}
		int[]harshedele =new int[count];
		int index =0;
		for(int i=0;i<a.length;i++) {
			if(isHarshad(a[i])) {
				harshedele[index++]=a[i];
			}
	}
		return harshedele;
}

public static boolean isHarshad(int n) {
	int sum = 0;
	int temp = n;
	while(n!=0) {
		int r=n%10;
		sum = sum +r;
		n=n/10;
	}
	return temp%sum==0;
}
}
