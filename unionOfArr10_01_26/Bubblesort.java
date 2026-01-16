package unionOfArr10_01_26;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int[] a = { 8, 2, 5, 4, 6, 7, 1 };
		Bubble(a);
		System.out.println(Arrays.toString(a));
	}

	public static void Bubble(int[] a) { 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
//			if(a[j]<a[j+1]) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
