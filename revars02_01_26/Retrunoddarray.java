package revars02_01_26;

import java.util.Arrays;

public class Retrunoddarray {
	public static void main(String[] args) {
		
	
int a[]= {1,2,3,4,4};
System.out.println(Arrays.toString(onlyOdd(a)));
	}

public static int[] onlyOdd(int []a) {
	int count= 0;
	for(int i =0;i<=a.length-1;i++) {
		if(a[i]%2!=0)
			count++;
	}
	int[]oddEle=new int[count];
	int index= 0;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]%2!=0)
			oddEle[index++]=a[i];
	}
	return oddEle;
}
}
