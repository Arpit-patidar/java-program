package revars02_01_26;

import java.util.Arrays;

public class primeEle {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(isprime(a)));
	}

	public static int[] isprime(int[] a) {
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (primenum(a[i])) {
				count++;

			}}
			int[] primeEle = new int[count];
			int index = 0;
			for (int i = 0; i <= a.length - 1; i++) {
				if (primenum(a[i])) {
					primeEle[index++] = a[i];
				}
 
			}
			return primeEle;
		}

	

	public static boolean primenum(int a) {
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
}
