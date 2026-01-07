package revars02_01_26;

import java.util.Arrays;

public class Onlysunny {
public static void main(String[] args) {
	 int[] a = {3, 8, 15, 24, 35, 37, 38, 39, 80};
	 System.out.println(Arrays.toString(issunny(a)));
}
public static int[] issunny(int[] a) {
	int count = 0;
	for (int i = 0; i <= a.length - 1; i++) {
		if (isSunny(a[i])) {
			count++;

		}}
		int[] primeEle = new int[count];
		int index = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (isSunny(a[i])) {
				primeEle[index++] = a[i];
			}

		}
		return primeEle;
	}

public static boolean isSunny(int n) {
	
	int x = n+1;
	for(int i=1;i*i<=x;i++) {
		if(i*i == x) {
			return true;
		}
	}
	return false;
}
}
