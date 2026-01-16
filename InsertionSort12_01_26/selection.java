package InsertionSort12_01_26;

import java.util.Arrays;

public class selection {
public static void main(String[] args) {
	int[]a= {4,3,2,1,5,6,8,7};
	selectionsort(a, a.length);
	System.out.println(Arrays.toString(a));
}
public static void selectionsort(int []a,int n) {
	int count =0;
	for (int i = 0; i < n; i++) {
		int min =i;
		for (int j = i+1; j < n; j++) {
			if(a[min]>a[j]) {
				min=j;
			}
		}
		if(i==min) continue;
		int temp =a[i];
		a[i] = a[min];
		a[min]= temp;
		count++;
	}
}
}
