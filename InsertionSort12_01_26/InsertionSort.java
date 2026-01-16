package InsertionSort12_01_26;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] a = { 9, 7, 2, 1, 3, 4, 5, 6, 8 };
		insertion(a);
		System.out.println(Arrays.toString(a));
		insertiondesc(a);
		System.out.println(Arrays.toString(a));
	}

	public static void insertion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j>=0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
 	}

	public static void insertiondesc(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] < key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}
}
