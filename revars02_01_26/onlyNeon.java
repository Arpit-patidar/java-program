package revars02_01_26;

import java.util.Arrays;

public class onlyNeon {
public static void main(String[] args) {
	int[] a = {0,9,1,11,8,};
	System.out.println(Arrays.toString(isneon(a)));
}
	public static int[] isneon(int[] a) {
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (isNeon(a[i])) {
				count++;

			}}
			int[] primeEle = new int[count];
			int index = 0;
			for (int i = 0; i <= a.length - 1; i++) {
				if (isNeon(a[i])) {
					primeEle[index++] = a[i];
				}

			}
			return primeEle;
		}
	

public static boolean isNeon(int n) {
	int sum = 0;
	int sq = n*n;
	if(n==0) {
		return true;
	}
	while(sq!=0) {
		int rem=sq%10;
		sum = sum + rem;
		sq=sq/10;
	}
	return sum==n;
}

}
